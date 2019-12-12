/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.test;

import exercices.objet.Animal;
import org.junit.Test;

/**
 *
 * @author formation
 */
public class AnimalTest {
    
    @Test
    public void testConstructeur(){
        
        
        Animal renard = new Animal("rox", "renards", 4);// Constructeur avec 3 params

        Animal corbeau = new Animal();// Constructeur sans param
        corbeau.setNom("Corbeau");
        corbeau.setNbPattes(2);
        
    }
}
