package com.fr.gestion.security;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;

import com.fr.gestion.service.security.IAuthenticationService;
import com.fr.gestion.service.security.IJwtTokenService;
import com.google.common.net.HttpHeaders;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtException;

public class JwtAuthenticationTokenFilter extends GenericFilterBean {

	private static final String BEARER = "Bearer";

	@Autowired
	private IAuthenticationService authenticationService;
	
	@Autowired
	private IJwtTokenService jwtTokenService;
	
	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {
		System.err.println("1");
		final HttpServletRequest request = (HttpServletRequest) servletRequest;
		final HttpServletResponse response = (HttpServletResponse) servletResponse;
		
		System.err.println("1.1");
		final Optional<String> token = Optional.ofNullable(request.getHeader(HttpHeaders.AUTHORIZATION));
		
		Authentication authentication;
		System.err.println("1.2");
		
		if(token.isPresent() && token.get().startsWith(BEARER)) {
			
			String bearerToken = token.get().substring(BEARER.length()+1);
			
			try {
				Jws<Claims> claims = jwtTokenService.validateJwtToken(bearerToken);
				authentication = authenticationService.getAuthentication(claims);
				SecurityContextHolder.getContext().setAuthentication(authentication);
				
			} catch (ExpiredJwtException expiredException) {
				response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "error.jwt.expired");
				return;
				
			} catch (JwtException jwtException) {
				response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "error.jwt.invalid");
				return;
			}
		}		
		System.err.println("1.3");
		chain.doFilter(servletRequest, servletResponse);
		SecurityContextHolder.getContext().setAuthentication(null);
	}

}
