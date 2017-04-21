/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices;

import java.util.Scanner;

/**
 *
 * @author formation
 */
public class Variables {
    
    public static long exposant(long n, long p){
        
        long res=1;
        
        for(int i=0;i<p;i++){
            
            res = res * n;
        }
        
        return res;
    }
    
    public static void main(String[] args) {

        double d = 12.34;
        
        d = Math.round(d);
        
        int i = (int) d;
        
        String s = "123";
        
        i = Integer.parseInt(s);
        
        Integer integer = new Integer(123);
        integer.toString();
       
        
//        // Entiers
//        byte b = 1;
//        short s = 32000;
//        int i=123182971;
//        long l=1219287982;
//        
//        // Décimal
//        double d = 123.456;
//        float f = (float) 123.456;
//        
//        // Texte
        String str = "coucou";
        String a = "Bonjour";
        String b = "tout le monde";
        
        System.out.println( a + " " + b );
//        
//        // Booléen
//        boolean bool = true;
        

        System.out.println("Entrez un texte :");
        Scanner scanner = new Scanner( System.in );
        
        String txtConsole = scanner.nextLine();

        System.out.println( "Vous avez entré: "  + txtConsole );
    }
}
