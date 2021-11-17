package com.fr.gestion.web.model;

/**
 * Classe ClasseDto
 * 
 * @author pc
 *
 */
public class ClasseDto {

	private Integer idClasse;
	private String niveau;
	private Integer capaciteMin;
	private Integer capaciteMax;
	private boolean enable;

	public ClasseDto() {
		// Empty method
	}

	public Integer getIdClasse() {
		return idClasse;
	}

	public void setIdClasse(final Integer idClasse) {
		this.idClasse = idClasse;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(final String niveau) {
		this.niveau = niveau;
	}

	public Integer getCapaciteMin() {
		return capaciteMin;
	}

	public void setCapaciteMin(final Integer capaciteMin) {
		this.capaciteMin = capaciteMin;
	}

	public Integer getCapaciteMax() {
		return capaciteMax;
	}

	public void setCapaciteMax(final Integer capaciteMax) {
		this.capaciteMax = capaciteMax;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(final boolean enable) {
		this.enable = enable;
	}

}
