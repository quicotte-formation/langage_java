/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.test;

import exercices.interfaces.Bombardant;
import exercices.interfaces.BombardierFlottant;
import exercices.interfaces.Flottant;
import exercices.interfaces.HydravionMitrailleur;
import exercices.interfaces.Mitraillant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author formation
 */
public class InterfacesTest {
    
    @Test
    public void test1(){
        
        // 1. Crée 4 véhicules
        BombardierFlottant bf1 = new BombardierFlottant();
        BombardierFlottant bf2 = new BombardierFlottant();
        HydravionMitrailleur hm1 = new HydravionMitrailleur();
        HydravionMitrailleur hm2 = new HydravionMitrailleur();
        
        // 2. Ajoute ces véhicules aux listes appropiées
        List<Flottant> flottants = new ArrayList<>();
        List<Mitraillant> mitraillants = new ArrayList<>();
        List<Bombardant> bombardants = new ArrayList<>();
        
                                
        
        mitraillants.add(bf1);
        mitraillants.add(bf2);
        mitraillants.add(hm1);
        mitraillants.add(hm2);
        
        bombardants.add(bf1);
        bombardants.add(bf2);
        
        // 3. Itère sur chaque liste et apelle la fonction d'interface correspondante
        for(Flottant f : flottants){
            f.flotter();
        }
        
        for(Mitraillant m : mitraillants){
            m.mitrailler();
        }
        
        for(Bombardant b:bombardants){
            b.bombarder();
        }
    }
}
