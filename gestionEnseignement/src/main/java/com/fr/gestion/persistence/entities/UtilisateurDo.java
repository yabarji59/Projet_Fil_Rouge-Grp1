package com.fr.gestion.persistence.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

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
    private String         nom;
    private String         prenom;
    private String         email;
    private String         password;
    private String         tokenSecret;

    @ElementCollection
    @CollectionTable(name = "ROLES")
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<String>   roles;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "utilisateur")
    private List<ClasseDo> listeDesClasses;

    public boolean         accountNonExpired;
    public boolean         accountNonLocked;
    public boolean         credentialsNonExpired;

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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

}
