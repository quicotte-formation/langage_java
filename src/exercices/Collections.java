/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author formation
 */
public class Collections {
    
    public static void main(String[] args) {
        
        // Liste typée
        ArrayList<String> titres = new ArrayList<String>();
        
        titres.add("le chat et la souris");
        titres.add("renée la taupe");
        titres.add("kaplan");
        
        for( String s : titres )
            System.out.println(s);
        
        // Liste non typée
//        ArrayList liste = new ArrayList();
//        
//        liste.add("La fierte des notres");
//        liste.add( new Date() );
//        liste.add( 10 );
//        
//        for( Object object : liste ){
//            System.out.println( object );
//        }
    }
}
