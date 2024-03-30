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
public class Patient {
    private int codeP;
    private String prenom, nom;
    private int age;
    private String sexe, adresse;
    private int tel;

    public Patient() {
    }

    public Patient(int codeP, String prenom, String nom, int age, String sexe, String adresse, int tel) {
        this.codeP = codeP;
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        this.sexe = sexe;
        this.adresse = adresse;
        this.tel = tel;
    }

    public Patient(String prenom, String nom, int age, String sexe, String adresse, int tel) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        this.sexe = sexe;
        this.adresse = adresse;
        this.tel = tel;
    }

    public int getCodeP() {
        return codeP;
    }

    public void setCodeP(int codeP) {
        this.codeP = codeP;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }
    
    
}
