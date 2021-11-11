package com.fr.gestion.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Classe CoursDo
 * 
 * @author pc
 *
 */
@Entity
@Table(name = "cours")
@SequenceGenerator(name = "cours_id_cours_seq", initialValue = 1, allocationSize = 1)
public class CoursDo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cours_id_cours_seq")
    @Column(name = "id_cours")
    private Integer idCours;
    private String  libelle;

    //Constructer
    public CoursDo() {
        // Empty method
    }

    //Getter & Setter
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

}
