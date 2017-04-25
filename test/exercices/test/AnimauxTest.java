/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.test;

import org.junit.Test;
import exercices.animaux.Animal;
import exercices.animaux.Oiseau;
import exercices.animaux.Poisson;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author formation
 */
public class AnimauxTest {
    
    @Test
    public void testAnimaux(){
        
        List<Animal> animaux = new ArrayList<>();
        
        Poisson p1 = new Poisson("Némo");
        Poisson p2 = new Poisson("Carlo le mollusque");
        p2.setX(10);
        Poisson p3 = new Poisson();
        p1.setNom("Bob l'éponge");
        animaux.add( p1 );
        animaux.add( p2 );
        animaux.add( p3 );
        
        Oiseau o1 = new Oiseau("kaplan", 10, 10);
        Oiseau o2 = new Oiseau("sy", 5, 15);
        Oiseau o3 = new Oiseau("nahyane", 50, 50);
        
        animaux.add( o1 );
        animaux.add( o2 );
        animaux.add( o3 );
        
        // Itère sur liste
        for(Animal a : animaux){
            a.bouger();
            a.manger();
        }
        
        for(Animal a : animaux){
            a.bouger();
            a.manger();
        }
    }
}
