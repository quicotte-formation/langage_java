package exercices;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author formation
 */
public class List { 
    
    public static void main(String[] args) {
        
        
        // Exercices avec ArrayList
        
        // 1. Ajouter a,b,c à listeA
        ArrayList<String> listeA = new ArrayList<>();
        
        listeA.add("a");
        listeA.add("b");
        listeA.add("c");
        
        // 2. Ajouter a,b,c à listeB
        ArrayList<String> listeB = new ArrayList<>();
        
        listeB.add("d");
        listeB.add("e");
        listeB.add("f");
        
        // 3. Crée listeC = listeA + listeB
        ArrayList<String> listeC = new ArrayList<>();
        listeC.addAll(listeA);
        listeC.addAll(listeB);
        
        // 4. Supprime "a" de listeC
        listeC.remove("a");
        
        // 5. Vérifie si 'a' existe ds listeC
        System.out.println( "C contient 'a' : " + listeC.contains("a") );
        
        // 6. Affichie listeC
        listeC.addAll( listeA );
        System.out.println( listeC );
        
        for(String elem:listeC)
            System.out.println(elem);
        
        for(int i=0;i<listeC.size();i++)
            System.out.println( listeC.get(i) );
        
        // Liste typée
//        ArrayList<String> titres = new ArrayList<String>();
        
        
        
//        titres.add("le chat et la souris");
//        titres.add("renée la taupe");
//        titres.add("kaplan");
//        
//        for( String s : titres )
//            System.out.println(s);
        
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
