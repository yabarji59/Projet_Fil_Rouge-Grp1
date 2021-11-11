package com.fr.gestion.persistence.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Classe UtilisateurDo
 * 
 * @author pc
 *
 */
@Entity
@Table(name = "utilisateurs")
@SequenceGenerator(name = "utilisateur_id_user_seq", initialValue = 1, allocationSize = 1)
public class UtilisateurDo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "utilisateur_id_user_seq")
    @Column(name = "id_utilisateur")
    private Integer        idUtilisateur;
    private String         nomUtilisateur;
    private String         prenomUtilisateur;
    private String         emailUtilisateur;
    private String         passwordUtilisateur;
    private String         tokenSecret;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "utilisateur")
    private List<ClasseDo> listeDesClasses;

    //Constructer
    public UtilisateurDo() {
        // Empty method
    }

    //Getter & Setter
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
