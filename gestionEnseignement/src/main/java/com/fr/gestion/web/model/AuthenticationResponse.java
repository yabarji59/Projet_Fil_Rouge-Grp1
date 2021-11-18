package com.fr.gestion.web.model;

/**
 * AuthenticationResponse
 * 
 * @author Apprenant
 *
 */
public class AuthenticationResponse {

	private String jwt;

	private UtilisateurDto utilisateur;

	public AuthenticationResponse() {
		// TODO Auto-generated constructor stub
	}

	public String getJwt() {
		return jwt;
	}

	public void setJwt(String jwt) {
		this.jwt = jwt;
	}

	public UtilisateurDto getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(UtilisateurDto utilisateur) {
		this.utilisateur = utilisateur;
	}

}
