package com.fr.gestion.web.model;

import java.util.List;

import com.fr.gestion.persistence.entities.ClasseDo;

/**
 * Classe UtilisateurDto
 * 
 * @author pc
 *
 */
public class UtilisateurDto {

    private Integer        idUtilisateur;
    private String         nomUtilisateur;
    private String         prenomUtilisateur;
    private String         emailUtilisateur;
    private String         passwordUtilisateur;
    private String         tokenSecret;

    private List<ClasseDo> listeDesClasses;

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

    public List<ClasseDo> getListeDesClasses() {
        return listeDesClasses;
    }

    public void setListeDesClasses(final List<ClasseDo> listeDesClasses) {
        this.listeDesClasses = listeDesClasses;
    }

}
