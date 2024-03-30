/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import dao.ConnectionBase;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modele.DossierPatient;
import modele.SuiviDossier;

/**
 *
 * @author pc
 */
public class GestionDM {
    
    //ajouter un nouveau dossier medical
    public void ajouterDM(DossierPatient dp) {
        String chaineDate = Utiles.formaterDate(dp.getDateCreation().getYear()+1900,dp.getDateCreation().getMonth()+1, dp.getDateCreation().getDate());
        
        //connection base
        ConnectionBase cb = new ConnectionBase();
        cb.connect();
        
        //ecrire requete
        String req = "INSERT INTO dossier_patient(codeP, dateCreation) VALUES ('"+dp.getCodeP()+"', '"+chaineDate+"') ";
        
        try {
            //executer requete
            cb.st.executeUpdate(req);
            
            //message popup
            JOptionPane.showMessageDialog(null, "Dossier cree avec succes!");
        } catch (SQLException ex) {
            Logger.getLogger(GestionDM.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    //modifier un DM existant
    public void modifierDM(DossierPatient dp) {
        String chaineDate = Utiles.formaterDate(dp.getDateCreation().getYear(),dp.getDateCreation().getMonth()+1, dp.getDateCreation().getDate());
        
        //connection base
        ConnectionBase cb = new ConnectionBase();
        cb.connect();
                
        //ecrire requete
        String req = "UPDATE dossier_patient SET codeP='"+dp.getCodeP()+"', dateCreation='"+chaineDate+"' WHERE numDP='"+dp.getNumDP()+"' ";
        
        try {
            //executer requete
            cb.st.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(GestionDM.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    //afficher un dossier medical
    public DossierPatient afficherDossier(int codeP) {
        DossierPatient dp = null;
        ResultSet rs = null;
        
        //connection base
        ConnectionBase cb = new ConnectionBase();
        cb.connect();
        
        //ecrire requete
        String req = "SELECT * FROM dossier_patient WHERE codeP='"+codeP+"' ";
        
        try {
            //executer requete
            rs = cb.st.executeQuery(req);
            
            //si resultat
            if(rs.next()) {
                dp = new DossierPatient();
                dp.setNumDP(rs.getInt("numDP"));
                dp.setCodeP(rs.getInt("codeP"));
                dp.setDateCreation(rs.getDate("dateCreation"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestionDM.class.getName()).log(Level.SEVERE, null, ex);
        }        
        
        return dp;
    }
    
    //lister toutes les observations en fonction de id dossier
    public ResultSet listerSD(int numDP) {
        ResultSet rs = null;
        
        //connection base
        ConnectionBase cb = new ConnectionBase();
        cb.connect();
        
        //ecrire requete
        String req = "SELECT * FROM suividossier WHERE numDP='"+numDP+"'";
        
        try {
            //executer requete
            rs = cb.st.executeQuery(req);
            
        } catch (SQLException ex) {
            Logger.getLogger(GestionDM.class.getName()).log(Level.SEVERE, null, ex);
        }       
                
        return rs;        
    }
    
    //methode d'ajout d'observation
    public static void ajouterObs(SuiviDossier sd) {
        //connection base
        ConnectionBase cb = new ConnectionBase();
        cb.connect();
        
        //ecrire requete
        String req = "INSERT INTO suividossier(numDP,observation,dateObs) VALUES ('"+sd.getNumDP()+"', '"+sd.getObservation()+"', '"+Utiles.formaterDate(sd.getDateObs().getYear()+1900, sd.getDateObs().getMonth()+1, sd.getDateObs().getDate())+"') ";
                
        try {
            //executer requete
            cb.st.executeUpdate(req);
            
            JOptionPane.showMessageDialog(null, "Mise a jour enregistree!");
        } catch (SQLException ex) {
            Logger.getLogger(GestionDM.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
