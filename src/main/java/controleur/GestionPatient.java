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
import modele.Patient;

/**
 *
 * @author pc
 */
public class GestionPatient {
    // ajouter un nouveau patient
    public void ajouterPatient(Patient p) {
        //connection a la base
        ConnectionBase cb = new ConnectionBase();
        cb.connect();
        
        //ecrire requete
        String req = "INSERT INTO patient(prenom, nom ,age, sexe, adresse, tel) VALUES('"+p.getPrenom()+"', '"+p.getNom()+"', '"+p.getAge()+"', '"+p.getSexe()+"', '"+p.getAdresse()+"', '"+p.getTel()+"')";
        
        try {
            //executer la requete
            cb.st.executeUpdate(req);
            
            //afficher message
            JOptionPane.showMessageDialog(null, "Ajout effectue!");
        } catch (SQLException ex) {
            Logger.getLogger(GestionPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // modifier des infos d'un patient
    public void modifierPatient(Patient p) {
        //connection base
        ConnectionBase cb = new ConnectionBase();
        cb.connect();
        
        //ecrire requete
        String req = "UPDATE patient SET prenom='"+p.getPrenom()+"', nom='"+p.getNom()+"', age='"+p.getAge()+"', sexe='"+p.getSexe()+"', adresse='"+p.getAdresse()+"', tel='"+p.getTel()+"' WHERE codeP='"+p.getCodeP()+"'; ";
        
        try {
            //executer requete
            cb.st.executeUpdate(req);
            
            //afficher message
            JOptionPane.showMessageDialog(null, "Modifications enregistrees!");
        } catch (SQLException ex) {
            Logger.getLogger(GestionPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    //rechercher patient par id
    public Patient rechercherPatient(int codeP) {
        Patient p = null;
        //connection base
        ConnectionBase cb = new ConnectionBase();
        cb.connect();
        
        //ecrire requete
        String req = "SELECT * FROM patient WHERE codeP='"+codeP+"' ";
        
        try {
            //executer requete
            ResultSet rs = cb.st.executeQuery(req);
            
            if(rs.next()) {
                p = new Patient();
                p.setCodeP(rs.getInt("codeP"));
                p.setPrenom(rs.getString("prenom"));
                p.setNom(rs.getString("nom"));
                p.setAge(rs.getInt("age"));
                p.setSexe(rs.getString("sexe"));
                p.setAdresse(rs.getString("adresse"));
                p.setTel(rs.getInt("tel"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestionPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return p;
    }
    
    
    //rechercher des patients par nom
    public ResultSet rechercherPatients(String nom) {
        ResultSet rs = null;
        
        nom = Utiles.formaterChaine(nom);
        
        //connection base
        ConnectionBase cb = new ConnectionBase();
        cb.connect();
        
        //ecrire requete
        String req = "SELECT * FROM patient WHERE nom LIKE '"+nom+"' ";
        
        try {
            //executer requete
            rs = cb.st.executeQuery(req);
        } catch (SQLException ex) {
            Logger.getLogger(GestionPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
    
    
    //rechercher patients par date de rdv
    /*
    public ResultSet rechercherPatients(Date dateRV) {
        ResultSet rs = null;
        
        //connection base
        ConnectionBase cb = new ConnectionBase();
        cb.connect();
        
        String chaineDate = Utiles.formaterDate(dateRV);
        //ecrire requete
        String req = "SELECT codeP,prenom,nom,age,sexe,adresse,tel FROM patient,rv WHERE patient.codeP=rv.codeP AND rv.dateRV='"+chaineDate+"' ";
        
        try {
            //executer requete
            rs = cb.st.executeQuery(req);
        } catch (SQLException ex) {
            Logger.getLogger(GestionPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //le resultat correspond a l'ensemble des patients ayant rendez vous a cette date        
        return rs;
    }
    */
    

    //lister tous les patients
    public ResultSet listerPatients() {
        ResultSet rs = null;
        
        //connection Base
        ConnectionBase cb = new ConnectionBase();
        cb.connect();
        
        //ecrire requete
        String req = "SELECT * FROM patient ORDER BY nom";
        
        try {
            //executer requete
            rs = cb.st.executeQuery(req);
            
        } catch (SQLException ex) {
            Logger.getLogger(GestionPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
}
