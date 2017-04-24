/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.test;

import exercices.objet.Client;
import exercices.objet.Commande;
import org.junit.Test;

/**
 *
 * @author formation
 */
public class ClientCmdTest {
    
    @Test
    public void test(){
        
        Commande cmd = new Commande("macbook pro", 1000);
        Client cli = new Client("kaplan", "yunus", 24, cmd);
        
//        cli.afficher();
        System.out.println( cli );
    }
}
