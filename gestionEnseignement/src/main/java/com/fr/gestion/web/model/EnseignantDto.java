package com.fr.gestion.web.model;

/**
 * Classe EnseignantDto
 * 
 * @author pc
 *
 */
public class EnseignantDto {

	private Integer idEnseignant;
	private String nomEnseignant;
	private String prenomEnseignant;
	private String emailEnseignant;
	private String telephoneEnseignant;
	private Integer ageEnseignant;
	private String adresseEnseignant;
	private boolean available;

	public EnseignantDto() {
		// Empty method
	}

	public Integer getIdEnseignant() {
		return idEnseignant;
	}

	public void setIdEnseignant(final Integer idEnseignant) {
		this.idEnseignant = idEnseignant;
	}

	public String getNomEnseignant() {
		return nomEnseignant;
	}

	public void setNomEnseignant(final String nomEnseignant) {
		this.nomEnseignant = nomEnseignant;
	}

	public String getPrenomEnseignant() {
		return prenomEnseignant;
	}

	public void setPrenomEnseignant(final String prenomEnseignant) {
		this.prenomEnseignant = prenomEnseignant;
	}

	public String getEmailEnseignant() {
		return emailEnseignant;
	}

	public void setEmailEnseignant(final String emailEnseignant) {
		this.emailEnseignant = emailEnseignant;
	}

	public String getTelephoneEnseignant() {
		return telephoneEnseignant;
	}

	public void setTelephoneEnseignant(final String telephoneEnseignant) {
		this.telephoneEnseignant = telephoneEnseignant;
	}

	public Integer getAgeEnseignant() {
		return ageEnseignant;
	}

	public void setAgeEnseignant(final Integer ageEnseignant) {
		this.ageEnseignant = ageEnseignant;
	}

	public String getAdresseEnseignant() {
		return adresseEnseignant;
	}

	public void setAdresseEnseignant(final String adresseEnseignant) {
		this.adresseEnseignant = adresseEnseignant;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(final boolean available) {
		this.available = available;
	}

}
