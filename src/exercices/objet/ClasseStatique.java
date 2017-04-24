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
public class ClasseStatique {

    static{
        
        singleton = null;
        nbInstances = 0;
    }
    
    private static ClasseStatique singleton;
    private static int nbInstances;

    private ClasseStatique() {

        nbInstances++;
    }

    public static ClasseStatique getInstance(){
        
        if( singleton!=null )
            return singleton;// Si déjà diff de null, alors il existe déjà
        
        // Existe pas encore
        singleton = new ClasseStatique();
        
        return singleton;
    }
    
    public static void afficheNbInstances() {

        System.out.println("Instances: " + ClasseStatique.nbInstances);
    }
}
