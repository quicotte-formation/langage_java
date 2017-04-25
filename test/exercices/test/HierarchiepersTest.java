/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.test;

import exercices.hierearchiepers.Employe;
import exercices.hierearchiepers.Responsable;
import org.junit.Test;

/**
 *
 * @author formation
 */
public class HierarchiepersTest {
    
    @Test
    public void testAjoutResponsableEtToString(){
        
        // Création responsable
        Responsable resp = new Responsable();
        
        resp.setNom("Digna");
        resp.setPrenom("Thomas");
        resp.setSalaire(5);
        resp.getEmployes().add( new Employe("nom1", "pre1", 2) );
        resp.getEmployes().add( new Employe("nom2", "pre2", 3) );
        
        // Affiche responsable
        System.out.println( resp );
    }
}
