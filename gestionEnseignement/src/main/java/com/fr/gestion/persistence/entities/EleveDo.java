package com.fr.gestion.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "eleves")
@SequenceGenerator(name = "eleve_id_eleve_seq", initialValue = 1, allocationSize = 1)
public class EleveDo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "eleve_id_eleve_seq")
    @Column(name = "id_eleve")
    private Integer  idEleve;
    private String   nomEleve;
    private String   prenomEleve;
    private String   emailEleve;
    private String   telephoneEleve;
    private Integer  ageEleve;
    private String   adresseEleve;
    private boolean  available;

    @ManyToOne
    @JoinColumn(name = "id_classe")
    private ClasseDo classe;

    //Constructeur 
    public EleveDo() {
        // Empty
    }

    //Getter & Setter
    public Integer getIdEleve() {
        return idEleve;
    }

    public void setIdEleve(final Integer idEleve) {
        this.idEleve = idEleve;
    }

    public String getNomEleve() {
        return nomEleve;
    }

    public void setNomEleve(final String nomEleve) {
        this.nomEleve = nomEleve;
    }

    public String getPrenomEleve() {
        return prenomEleve;
    }

    public void setPrenomEleve(final String prenomEleve) {
        this.prenomEleve = prenomEleve;
    }

    public String getEmailEleve() {
        return emailEleve;
    }

    public void setEmailEleve(final String emailEleve) {
        this.emailEleve = emailEleve;
    }

    public String getTelephoneEleve() {
        return telephoneEleve;
    }

    public void setTelephoneEleve(final String telephoneEleve) {
        this.telephoneEleve = telephoneEleve;
    }

    public Integer getAgeEleve() {
        return ageEleve;
    }

    public void setAgeEleve(final Integer ageEleve) {
        this.ageEleve = ageEleve;
    }

    public String getAdresseEleve() {
        return adresseEleve;
    }

    public void setAdresseEleve(final String adresseEleve) {
        this.adresseEleve = adresseEleve;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(final boolean available) {
        this.available = available;
    }

    public ClasseDo getClasse() {
        return classe;
    }

    public void setClasse(final ClasseDo classe) {
        this.classe = classe;
    }

}
