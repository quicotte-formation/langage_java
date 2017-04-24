/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.test;

import exercices.objet.Employe;
import org.junit.Test;

/**
 *
 * @author formation
 */
public class EmployeTest {
    
    @Test
    public void test(){
        
        Employe e = new Employe();
        e.setNom("Kaplan");
        e.setPrenom("Yunus");
        e.setSalaire(5000);
        
        System.out.println( e );
    }

}
