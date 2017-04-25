/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.animaux;

/**
 *
 * @author formation
 */
public class Poisson extends Animal{

    public Poisson() {
    }
    
    public Poisson(String nom) {
        
        this.nom = nom;
    }
    
    @Override
    public void bouger() {
        this.x++;
        System.out.println( String.format("%s nage vers position: %d %d", this.nom, this.x, this.y) );
    }

    @Override
    public void manger() {
        System.out.println( String.format("%s mange un plancton", this.nom) );
    }

}
