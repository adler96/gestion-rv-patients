/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.sql.Time;
import java.util.Date;



/**
 *
 * @author pc
 */
public class RV {
    
    private int id;
    private Date dateRV;
    private Time heure;
    private int codeP;
    private String motif;
    private int matricule;

    public RV() {
    }

    public RV(int id, Date dateRV, Time heure, int codeP, String motif, int matricule) {
        this.id = id;
        this.dateRV = dateRV;
        this.heure = heure;
        this.codeP = codeP;
        this.motif = motif;
        this.matricule = matricule;
    }

    public RV(Date dateRV, Time heure, int codeP, String motif, int matricule) {
        this.dateRV = dateRV;
        this.heure = heure;
        this.codeP = codeP;
        this.motif = motif;
        this.matricule = matricule;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateRV() {
        return dateRV;
    }

    public void setDateRV(Date dateRV) {
        this.dateRV = dateRV;
    }

    public int getCodeP() {
        return codeP;
    }

    public void setCodeP(int codeP) {
        this.codeP = codeP;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public Time getHeure() {
        return heure;
    }

    public void setHeure(Time heure) {
        this.heure = heure;
    }
    
    
    
}
