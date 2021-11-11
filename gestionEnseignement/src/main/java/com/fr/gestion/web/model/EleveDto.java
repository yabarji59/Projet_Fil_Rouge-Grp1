package com.fr.gestion.web.model;

import com.fr.gestion.persistence.entities.ClasseDo;

/**
 * Classe EleveDto
 * 
 * @author pc
 *
 */
public class EleveDto {

    private Integer  idEleve;
    private String   nomEleve;
    private String   prenomEleve;
    private String   emailEleve;
    private String   telephoneEleve;
    private Integer  ageEleve;
    private String   adresseEleve;
    private boolean  available;

    private ClasseDo classe;

    public EleveDto() {
        // Empty method
    }

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
