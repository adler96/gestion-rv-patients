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

/**
 *
 * @author pc
 */
public class Utiles {
    //NEVER TRUST USER INPUT
    
    //methode authentification des utilisateurs
    public static boolean testLogin(String login, String password, String profile) {
        boolean ok = false;
        
        //connection a la base
        ConnectionBase cb = new ConnectionBase();
        cb.connect();       
        
        
        //ecrire la requete sql
        String req = "SELECT * FROM utilisateurs WHERE login='"+login+"' AND password='"+password+"' AND profile='"+profile+"' " ;
        
        try {
            //executer la requete
            ResultSet rs = cb.st.executeQuery(req);
            
            if(rs.next()) {
                ok = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Utiles.class.getName()).log(Level.SEVERE, null, ex);
        }        
        
        return ok;
    }
    
    //methode de verification des dates
    public static boolean dateValide(int y, int m, int d) {
        
        //see later after checking the internet
        //si annee bissextile
        if(y%4 == 0 ) {
            //si fevrier va au dela de 29
            if(m == 2 && d > 29) {
                return false;
            }
            //si les mois de 30j ont + de 30j
            if((m==4 || m==6 || m==9 || m==11) && d>30) {
                return false;
            }
        } else { //si annee non bissextile
            //fevrier se limite a 28
            if(m==2 && d>28) {
                return false;
            }
            //les mois a 30j restent a 30j
            if((m==2 || m==4 || m==6 || m==9 || m==11) && d>30) {
                return false;
            }
        }
        //si ce qui precede n'a pas lieu, la date est bonne
        return true;
    }
    
    //formater la date pour la requete
    public static String formaterDate(int y,int m,int d) {      
        return (Integer.toString(y)+"-"+Integer.toString(m)+"-"+Integer.toString(d));
    } 
    
    //get ready string to be searched    
    public static String formaterChaine(String chaine) {
        return chaine+"%";
    }
    
    //METHODE POUR REFORMATER LES DATES EN JJ/MM/AAAA
    public static String toDisplayedDate(String date) {
        String[] tab=date.split("-");
        
        return tab[2]+"-"+tab[1]+"-"+tab[0];
    }
    
    //REAJUSTER LA DECREMENTATION DE LA DATE DE RS
    public static String toDisplayedDateRS(String date) {
        String[] tab=date.split("-");
        
        return (Integer.toString(Integer.parseInt(tab[2])+1))+"-"+tab[1]+"-"+tab[0];
    }
    
    //fix hours decrement 
    public static String toDisplayedTimeRs(String time) {
        String[] tab = time.split(":");        
            
        return (Integer.toString(Integer.parseInt(tab[0])+1))+":"+tab[1]+":"+tab[2];  
    }
    
}
