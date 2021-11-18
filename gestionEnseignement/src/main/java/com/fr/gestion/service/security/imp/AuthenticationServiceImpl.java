package com.fr.gestion.service.security.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.stereotype.Service;

import com.fr.gestion.service.security.IAuthenticationService;
import com.fr.gestion.web.model.AuthenticationRequest;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;

@Service
public class AuthenticationServiceImpl implements IAuthenticationService {
	@Autowired
	private AuthenticationManager authenticationManager;

	@Override
	public Authentication getAuthentication(Jws<Claims> token) {
		System.err.println("5");
		return new UsernamePasswordAuthenticationToken(token.getBody().getSubject(), "",
				AuthorityUtils.commaSeparatedStringToAuthorityList(token.getBody().get("roles", String.class)));
	}

	@Override
	public Authentication authenticate(AuthenticationRequest authenticationRequest) {
		System.err.println("4");
		UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
				authenticationRequest.username, authenticationRequest.password);
		return authenticationManager.authenticate(usernamePasswordAuthenticationToken);
	}

}
