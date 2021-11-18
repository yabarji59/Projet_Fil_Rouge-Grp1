package com.fr.gestion.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fr.gestion.service.security.IJwtTokenService;
import com.fr.gestion.web.model.AuthenticationRequest;
import com.fr.gestion.web.model.JwtTokens;
import com.fr.gestion.web.model.RefreshRequest;

/**
 * Classe AuthenticationController
 * 
 * @author Apprenant
 *
 */
@RestController
@RequestMapping("auth")
public class AuthenticationController {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private IJwtTokenService jwtTokenService;

	@PostMapping("/login")
	public ResponseEntity<?> authenticate(@RequestBody AuthenticationRequest authenticationRequest) {
		System.err.println("2");
		UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
				authenticationRequest.username, authenticationRequest.password);
		Authentication authentication = authenticationManager.authenticate(usernamePasswordAuthenticationToken);
		if (authentication != null && authentication.isAuthenticated()) {
			JwtTokens tokens = jwtTokenService.createTokens(authentication);
			return ResponseEntity.ok().body(tokens);
		}
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(HttpStatus.UNAUTHORIZED.getReasonPhrase());
	}

	@PostMapping(value = "/refresh")
	public ResponseEntity<?> refreshToken(@RequestBody RefreshRequest refreshRequesst) throws Exception {
		System.err.println("3");
		try {
			JwtTokens tokens = jwtTokenService.refreshJwtToken(refreshRequesst.refreshToken);
			return ResponseEntity.ok().body(tokens);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(HttpStatus.UNAUTHORIZED.getReasonPhrase());
		}
	}
}
