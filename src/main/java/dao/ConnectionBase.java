/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class ConnectionBase {
    public Connection co = null;
    public Statement st = null;
    
    public void connect() {
        try {
            //charger le driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            //etablir la connection
            co = DriverManager.getConnection("jdbc:mysql://localhost/gestionrv patients", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionBase.class.getName()).log(Level.SEVERE, null, ex);
        }
               
        try {
            //creer le statement
            st = co.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
