package com.fr.gestion.web.model;

<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> 613daa066f61b22c0488b660f2b5f2fc20caef31
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

<<<<<<< HEAD
	private UtilisateurDto utilisateur;
	private EnseignantDto enseignantDo;
	private List<EleveDto> listeDesEleves;
	private List<CoursDto> listeCours;

=======
>>>>>>> 613daa066f61b22c0488b660f2b5f2fc20caef31
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
<<<<<<< HEAD
	}

	public UtilisateurDto getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(UtilisateurDto utilisateur) {
		this.utilisateur = utilisateur;
	}

	public EnseignantDto getEnseignantDo() {
		return enseignantDo;
	}

	public void setEnseignantDo(EnseignantDto enseignantDo) {
		this.enseignantDo = enseignantDo;
	}

	public List<EleveDto> getListeDesEleves() {
		return listeDesEleves;
	}

	public void setListeDesEleves(List<EleveDto> listeDesEleves) {
		this.listeDesEleves = listeDesEleves;
	}

	public List<CoursDto> getListeCours() {
		return listeCours;
	}

	public void setListeCours(List<CoursDto> listeCours) {
		this.listeCours = listeCours;
=======
>>>>>>> 613daa066f61b22c0488b660f2b5f2fc20caef31
	}

}
