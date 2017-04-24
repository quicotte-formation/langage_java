/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.objet;

/**
 *
 * @author formation
 */
public class Commande {
    
    private String description;
    private double prix;

    public Commande(String description, double prix) {
        this.description = description;
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Commande{" + "description=" + description + ", prix=" + prix + '}';
    }

    
    
    public void afficher(){
        System.out.println( "Commande: " + description + " " + prix );
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    
    
}
