package com.fr.gestion.web.model;

import java.util.List;

/**
 * Classe UtilisateurDto
 * 
 * @author pc
 *
 */
public class UtilisateurDto {

	private Integer idUtilisateur;
	private String nomUtilisateur;
	private String prenomUtilisateur;
	private String emailUtilisateur;
	private String passwordUtilisateur;
	private String tokenSecret;
<<<<<<< HEAD
	private List<String> roles;

	private List<ClasseDto> listeDesClasses;
=======
>>>>>>> e95f77e3aa949938ecb153320153099c896e0125

	public UtilisateurDto() {
		// Empty method
	}

	public Integer getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(final Integer idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(final String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	public String getPrenomUtilisateur() {
		return prenomUtilisateur;
	}

	public void setPrenomUtilisateur(final String prenomUtilisateur) {
		this.prenomUtilisateur = prenomUtilisateur;
	}

	public String getEmailUtilisateur() {
		return emailUtilisateur;
	}

	public void setEmailUtilisateur(final String emailUtilisateur) {
		this.emailUtilisateur = emailUtilisateur;
	}

	public String getPasswordUtilisateur() {
		return passwordUtilisateur;
	}

	public void setPasswordUtilisateur(final String passwordUtilisateur) {
		this.passwordUtilisateur = passwordUtilisateur;
	}

	public String getTokenSecret() {
		return tokenSecret;
	}

	public void setTokenSecret(final String tokenSecret) {
		this.tokenSecret = tokenSecret;
	}
<<<<<<< HEAD

	public List<ClasseDto> getListeDesClasses() {
		return listeDesClasses;
	}

	public void setListeDesClasses(final List<ClasseDto> listeDesClasses) {
		this.listeDesClasses = listeDesClasses;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
=======
>>>>>>> e95f77e3aa949938ecb153320153099c896e0125

}
