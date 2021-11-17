package com.fr.gestion.web.model;

/**
 * Classe CoursDto
 * 
 * @author pc
 *
 */
public class CoursDto {

	private Integer idCours;
	private String libelle;
	private String description;

	public CoursDto() {
		// Empty method
	}

	public Integer getIdCours() {
		return idCours;
	}

	public void setIdCours(final Integer idCours) {
		this.idCours = idCours;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(final String libelle) {
		this.libelle = libelle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
