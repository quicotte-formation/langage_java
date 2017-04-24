/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.objet;

import java.util.ArrayList;

/**
 *
 * @author formation
 */
public class Client {
    
    private String nom;
    private String prenom;
    private int age;
    private Commande commande;

    public Client(String nom, String prenom, int age, Commande commande) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.commande = commande;
    }

    @Override
    public String toString() {
        return "Client: " + prenom + " " + nom  + " " + commande;
    }

    

    
    
    public void afficher(){
        System.out.println( "Client: " + prenom + " " + nom + " " + age );
        commande.afficher();
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }
    
    
}
