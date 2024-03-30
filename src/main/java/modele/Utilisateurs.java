/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author pc
 */
public class Utilisateurs {
    private int matricule;
    private String prenom, nom, login, password, profile;

    public Utilisateurs() {
    }

    public Utilisateurs(int matricule, String prenom, String nom, String login, String password, String profile) {
        this.matricule = matricule;
        this.prenom = prenom;
        this.nom = nom;
        this.login = login;
        this.password = password;
        this.profile = profile;
    }

    public Utilisateurs(String prenom, String nom, String login, String password, String profile) {
        this.prenom = prenom;
        this.nom = nom;
        this.login = login;
        this.password = password;
        this.profile = profile;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
    
}
