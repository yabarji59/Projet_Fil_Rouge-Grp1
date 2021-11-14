package com.fr.gestion.web.model;

/**
 * Classe JwtToken
 * @author Apprenant
 *
 */
public class JwtTokens {
	public String token;
	public String refreshToken;

	public JwtTokens(String token, String refreshToken) {
		this.token = token;
		this.refreshToken = refreshToken;
	}

}
