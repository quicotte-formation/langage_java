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
public class Oiseau extends Animal{

    public Oiseau(String nom, int x, int y) {
        
        this.nom = nom;
        this.x = x;
        this.y = y;
    }
    
    public Oiseau(String nom) {
        
        this.nom = nom;
    }

    @Override
    public void bouger() {
        this.x = this.x + 2;
        this.y = this.y + 2;
        System.out.println( String.format("%s vole vers position: %d %d", this.nom, this.x, this.y) );
    }

    @Override
    public void manger() {
        
        System.out.println( String.format("%s mange une graine", this.nom) );
    }
    
}
