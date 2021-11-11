package com.fr.gestion.web.model;

import java.util.List;

import com.fr.gestion.persistence.entities.CoursDo;
import com.fr.gestion.persistence.entities.EleveDo;
import com.fr.gestion.persistence.entities.EnseignantDo;
import com.fr.gestion.persistence.entities.UtilisateurDo;

/**
 * Classe ClasseDto
 * 
 * @author pc
 *
 */
public class ClasseDto {

    private Integer       idClasse;
    private String        niveau;
    private Integer       capaciteMin;
    private Integer       capaciteMax;
    private boolean       enable;

    private UtilisateurDo utilisateur;
    private EnseignantDo  enseignantDo;
    private List<EleveDo> listeDesEleves;
    private List<CoursDo> listeCours;

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

    public List<CoursDo> getListeCours() {
        return listeCours;
    }

    public void setListeCours(final List<CoursDo> listeCours) {
        this.listeCours = listeCours;
    }

}
