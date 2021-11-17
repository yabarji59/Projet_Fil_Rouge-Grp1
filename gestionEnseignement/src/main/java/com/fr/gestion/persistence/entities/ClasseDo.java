package com.fr.gestion.persistence.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Classe ClasseDo
 * 
 * @author pc
 *
 */
@Entity
@Table(name = "classes")
@SequenceGenerator(name = "classe_id_classe_seq", initialValue = 1, allocationSize = 1)
public class ClasseDo {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "classe_id_classe_seq")
	@Column(name = "id_classe")
	private Integer idClasse;
	private String niveau;
	private Integer capaciteMin;
	private Integer capaciteMax;
	private boolean enable;

	@ManyToOne()
	@JoinColumn(name = "id_utilisateur")
	private UtilisateurDo utilisateur;

	@OneToOne(mappedBy = "classe", fetch = FetchType.LAZY)
	private EnseignantDo enseignantDo;

	@OneToMany(mappedBy = "classe", fetch = FetchType.LAZY)
	private List<EleveDo> listeDesEleves;

	@OneToOne(mappedBy = "classe", fetch = FetchType.LAZY)
	private CoursDo coursDo;

	public Integer getIdClasse() {
		return idClasse;
	}

	// Constructeur

	public void setIdClasse(final Integer idClasse) {
		this.idClasse = idClasse;
	}

	// Getter & Setter

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

	public UtilisateurDo getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(final UtilisateurDo utilisateur) {
		this.utilisateur = utilisateur;
	}

	public EnseignantDo getEnseignantDo() {
		return enseignantDo;
	}

	public void setEnseignantDo(final EnseignantDo enseignantDo) {
		this.enseignantDo = enseignantDo;
	}

	public List<EleveDo> getListeDesEleves() {
		return listeDesEleves;
	}

	public void setListeDesEleves(final List<EleveDo> listeDesEleves) {
		this.listeDesEleves = listeDesEleves;
	}

	public CoursDo getCoursDo() {
		return coursDo;
	}

	public void setCoursDo(final CoursDo coursDo) {
		this.coursDo = coursDo;
	}

}
