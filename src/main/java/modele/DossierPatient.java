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
public class DossierPatient {
    private int numDP, codeP;
    private Date dateCreation;

    public DossierPatient() {
    }

    public DossierPatient(int numDP, int codeP, Date dateCreation) {
        this.numDP = numDP;
        this.codeP = codeP;
        this.dateCreation = dateCreation;
    }

    public DossierPatient(int codeP, Date dateCreation) {
        this.codeP = codeP;
        this.dateCreation = dateCreation;
    }

    public int getNumDP() {
        return numDP;
    }

    public void setNumDP(int numDP) {
        this.numDP = numDP;
    }

    public int getCodeP() {
        return codeP;
    }

    public void setCodeP(int codeP) {
        this.codeP = codeP;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
    
      
    
}
