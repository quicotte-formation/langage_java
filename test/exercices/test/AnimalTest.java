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
        
        
        Animal renard = new Animal("rox", "renards", 4);
//        Animal corbeau = new Animal("croa", "corbeau", 2);


        Animal corbeau = new Animal();
        corbeau.setNom("Corbeau");
        corbeau.setNbPattes(2);
        
    }
}
