package com.fr.gestion.service.security;

import org.springframework.security.core.Authentication;

import com.fr.gestion.web.model.JwtTokens;
import com.fr.gestion.web.model.UtilisateurSecurityDto;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;

public interface IJwtTokenService {

	/**
	 * Permet de créer les tokens
	 * 
	 * @param authentication
	 * @return
	 */
	JwtTokens createTokens(final Authentication authentication);

	/**
	 * Permet de créer un token
	 * 
	 * @param user
	 * @return
	 */
	String createToken(final UtilisateurSecurityDto user);

	/**
	 * Créer un token après refresh
	 * 
	 * @param user
	 * @return
	 */
	String createRefreshToken(final UtilisateurSecurityDto user);

	/**
	 * Refesh le token
	 * 
	 * @param token
	 * @return
	 */
	JwtTokens refreshJwtToken(final String token);

	/**
	 * @param token
	 * @return
	 */
	Jws<Claims> validateJwtToken(final String token);

}
