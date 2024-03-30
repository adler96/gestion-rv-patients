/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.Date;

/**
 *
 * @author pc
 */
public class SuiviDossier {
    private int id, numDP;
    private String Observation;
    private Date dateObs;

    public SuiviDossier() {
    }

    public SuiviDossier(int id, int numDP, String Observation, Date dateObs) {
        this.id = id;
        this.numDP = numDP;
        this.Observation = Observation;
        this.dateObs = dateObs;
    }

    public SuiviDossier(int numDP, String Observation, Date dateObs) {
        this.numDP = numDP;
        this.Observation = Observation;
        this.dateObs = dateObs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumDP() {
        return numDP;
    }

    public void setNumDP(int numDP) {
        this.numDP = numDP;
    }

    public String getObservation() {
        return Observation;
    }

    public void setObservation(String Observation) {
        this.Observation = Observation;
    }

    public Date getDateObs() {
        return dateObs;
    }

    public void setDateObs(Date dateObs) {
        this.dateObs = dateObs;
    }
    
    
    
}
