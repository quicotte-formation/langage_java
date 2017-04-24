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
public class Employe extends Personne {
    
    private double salaire;

    @Override
    public String toString() {
        return "Employé: " + super.toString() + " " + this.salaire;
    }

    
    
    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
    
    
}
