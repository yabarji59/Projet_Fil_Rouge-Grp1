package com.fr.gestion.service.security;

import org.springframework.security.core.Authentication;

import com.fr.gestion.web.model.AuthenticationRequest;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;

public interface IAuthenticationService {

	/**
	 * Permet de recuperer les droits d'authentification à partir de la requete
	 * @param request
	 * @return
	 */
	Authentication getAuthentication(Jws<Claims> request);

	/**
	 * Permet d'authentifier à partir de la requete
	 * @param authenticationRequest
	 * @return
	 */
	Authentication authenticate(AuthenticationRequest authenticationRequest);

}
