/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices;

/**
 *
 * @author formation
 */
public class ForEach {
    
    public static void main(String[] args) {
        
        String[] albums = {"thriller", "hybrid theory", "force et honneur", "celine dion", "abba", "stupeflip"};
        
//        for(int i=0;i<albums.length;i++)
//            System.out.println( albums[i] );
        
        for(String titre:albums)
            System.out.println( titre );
    }
}
