/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import dao.ConnectionBase;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modele.RV;

/**
 *
 * @author pc
 */
public class GestionRV {    
    
    //ajouter un nouveau rdv
    public void ajouterRV(RV rdv) {
        //connection base
        ConnectionBase cb = new ConnectionBase();
        cb.connect();        
        // dateRV='"+Utiles.formaterDate(rdv.getDateRV().getYear(), rdv.getDateRV().getMonth(), rdv.getDateRV().getDate())+"', heureRV='"+rdv.getHeure().toString()+"'
        //ecrire requete
        String req = "INSERT INTO rv(dateRV, heureRV, codeP, motif, matricule) VALUES('"+Utiles.formaterDate(rdv.getDateRV().getYear(), rdv.getDateRV().getMonth()+1, rdv.getDateRV().getDate())+"', '"+rdv.getHeure().toString()+"', '"+rdv.getCodeP()+"', '"+rdv.getMotif()+"', '"+rdv.getMatricule()+"')";
        
        try {
            //executer requete
            cb.st.executeUpdate(req);
            
            //message popup
            JOptionPane.showMessageDialog(null, "Rendez-vous ajoute avec succes!");
        } catch (SQLException ex) {
            Logger.getLogger(GestionRV.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    //modifier un rdv
    public void modifierRV(RV rdv) {
        //connection base
        ConnectionBase cb = new ConnectionBase();
        cb.connect();        
        
        //ecrire requete
        String req = "UPDATE rv SET dateRV='"+Utiles.formaterDate(rdv.getDateRV().getYear(), rdv.getDateRV().getMonth()+1, rdv.getDateRV().getDate())+"', heureRV='"+rdv.getHeure().toString()+"', codeP='"+rdv.getCodeP()+"', motif='"+rdv.getMotif()+"', matricule='"+rdv.getMatricule()+"' WHERE id='"+rdv.getId()+"' ";
        
        try {
            //executer requete
            cb.st.executeUpdate(req);
            
            //message popup
            JOptionPane.showMessageDialog(null, "Modifications effectuees!");
        } catch (SQLException ex) {
            Logger.getLogger(GestionRV.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }    
    
    //rechercher rdv par id
    public ResultSet rechercherRV(int id) {
        ResultSet rs = null;
        
        //connection base
        ConnectionBase cb = new ConnectionBase();
        cb.connect();
        
        //ecrire requete
        String req = "SELECT rv.id as id, rv.dateRV as date, rv.heureRV as heure, rv.motif as motif, patient.codeP as codeP, patient.prenom as prenomP, patient.nom as nomP, utilisateurs.matricule as matricule, utilisateurs.prenom as prenomM, utilisateurs.nom as nomM FROM rv,patient,utilisateurs WHERE id='"+id+"' AND rv.codeP=patient.codeP AND rv.matricule=utilisateurs.matricule ";
                
        try {
            //executer requete
            rs = cb.st.executeQuery(req);
        } catch (SQLException ex) {
            Logger.getLogger(GestionRV.class.getName()).log(Level.SEVERE, null, ex);
        }          
               
        return rs;
    }
    
    
    //rechercher rdv par nom du patient
    public ResultSet rechercherRV(String nom) {
        ResultSet rs = null;
        String nomF = Utiles.formaterChaine(nom);
        
        //connection base
        ConnectionBase cb = new ConnectionBase();
        cb.connect();
        
        //ecrire requete
        //elle renverra pas seulement les donnees de la table concernee
        //il y aura des infos sur le patient et le medecin
        String req = "SELECT rv.id as id,rv.dateRV as date,rv.heureRV as heure,rv.motif,patient.codeP as codeP,patient.nom as nomP,patient.prenom as prenomP,utilisateurs.matricule as matricule,utilisateurs.nom as nomM,utilisateurs.prenom AS prenomM  FROM rv,patient,utilisateurs WHERE rv.codeP=patient.codeP AND rv.matricule=utilisateurs.matricule AND patient.nom LIKE '"+nomF+"' ";
        
        try {
            //executer requete
            rs = cb.st.executeQuery(req);
        } catch (SQLException ex) {
            Logger.getLogger(GestionRV.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
    
    
    //rechercher rdv par date
    public ResultSet rechercherDateRV(String chaineDate) {
        ResultSet rs = null;
        
        //connection Base
        ConnectionBase cb = new ConnectionBase();
        cb.connect();
        
        //ecrire requete
        String req = "SELECT rv.id as id,rv.dateRV as date,rv.heureRV as heure,rv.motif as motif,patient.codeP as codeP,patient.nom as nomP,patient.prenom as prenomP,utilisateurs.matricule as matricule,utilisateurs.prenom AS prenomM,utilisateurs.nom as nomM FROM rv,patient,utilisateurs WHERE rv.codeP=patient.codeP AND rv.matricule=utilisateurs.matricule AND rv.dateRV='"+chaineDate+"' ";
        
        try {
            //executer requete
            rs = cb.st.executeQuery(req);
        } catch (SQLException ex) {
            Logger.getLogger(GestionRV.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
    
    
    //lister tous les rdv
    public ResultSet listerRVs() {
        ResultSet rs = null;
        
        //connection Base
        ConnectionBase cb = new ConnectionBase();
        cb.connect();
        
        //ecrire requete
        String req = "SELECT rv.id as id, rv.dateRV as date, rv.heureRV as heure, rv.motif as motif, patient.codeP as codeP, patient.prenom as prenomP, patient.nom as nomP, utilisateurs.matricule as matricule, utilisateurs.prenom as prenomM, utilisateurs.nom as nomM FROM rv,patient,utilisateurs WHERE rv.codeP=patient.codeP AND rv.matricule=utilisateurs.matricule ORDER BY dateRV DESC ";
        
        try {
            //executer requete
            rs = cb.st.executeQuery(req);
        } catch (SQLException ex) {
            Logger.getLogger(GestionRV.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
    
    
    //annuler un rdv par id
    public void annulerRV(int id) {
        //Connection base
        ConnectionBase cb = new ConnectionBase();
        cb.connect();
        
        //ecrire requete
        String req = "DELETE FROM rv WHERE id='"+id+"' ";
        
        try {
            //executer requete
            cb.st.executeUpdate(req);
            
            //message popup
            JOptionPane.showMessageDialog(null, "Rendez-vous annule");
            
        } catch (SQLException ex) {
            Logger.getLogger(GestionRV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    //annuler un rdv
    public void annulerDateRV(String chaineDate) {
        //connection base
        ConnectionBase cb = new ConnectionBase();
        cb.connect();
       
        //ecrire requete
        String req = "DELETE FROM rv WHERE dateRV='"+chaineDate+"' ";
       
        try {
            //executer requete
            cb.st.executeUpdate(req);
            
            //afficher popup
            JOptionPane.showMessageDialog(null, "Les rendez vous ont ete annules");
        } catch (SQLException ex) {
            Logger.getLogger(GestionRV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
