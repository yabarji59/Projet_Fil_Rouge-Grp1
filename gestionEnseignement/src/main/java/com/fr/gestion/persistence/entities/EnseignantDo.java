package com.fr.gestion.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Classe EnseignantDo
 * 
 * @author pc
 *
 */
@Entity
@Table(name = "enseignants")
@SequenceGenerator(name = "enseignant_id_enseignant_seq", initialValue = 1, allocationSize = 1)
public class EnseignantDo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "enseignant_id_enseignant_seq")
    @Column(name = "id_enseignant")
    private Integer  idEnseignant;
    private String   nomEnseignant;
    private String   prenomEnseignant;
    private String   emailEnseignant;
    private String   telephoneEnseignant;
    private Integer  ageEnseignant;
    private String   adresseEnseignant;
    private boolean  available;

    @OneToOne()
    private ClasseDo classe;

    //Constructer
    public EnseignantDo() {
        // Empty method
    }

    //Getter & Setter
    public Integer getIdEnseignant() {
        return idEnseignant;
    }

    public void setIdEnseignant(final Integer idEnseignant) {
        this.idEnseignant = idEnseignant;
    }

    public String getNomEnseignant() {
        return nomEnseignant;
    }

    public void setNomEnseignant(final String nomEnseignant) {
        this.nomEnseignant = nomEnseignant;
    }

    public String getPrenomEnseignant() {
        return prenomEnseignant;
    }

    public void setPrenomEnseignant(final String prenomEnseignant) {
        this.prenomEnseignant = prenomEnseignant;
    }

    public String getEmailEnseignant() {
        return emailEnseignant;
    }

    public void setEmailEnseignant(final String emailEnseignant) {
        this.emailEnseignant = emailEnseignant;
    }

    public String getTelephoneEnseignant() {
        return telephoneEnseignant;
    }

    public void setTelephoneEnseignant(final String telephoneEnseignant) {
        this.telephoneEnseignant = telephoneEnseignant;
    }

    public Integer getAgeEnseignant() {
        return ageEnseignant;
    }

    public void setAgeEnseignant(final Integer ageEnseignant) {
        this.ageEnseignant = ageEnseignant;
    }

    public String getAdresseEnseignant() {
        return adresseEnseignant;
    }

    public void setAdresseEnseignant(final String adresseEnseignant) {
        this.adresseEnseignant = adresseEnseignant;
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
