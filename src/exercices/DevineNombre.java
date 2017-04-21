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
public class DevineNombre {
    
    public static void main(String[] args) {
        
        String recommencer;
        Scanner scanner = new Scanner(System.in);
        do{
            
            // Jouer
            partie();
            
            // Demande si util désire recommencer
            System.out.print("Nouvelle partie ? oui / non : ");
            recommencer = scanner.next();
            
        }while(recommencer.equals("oui"));
    }
    
    public static void partie(){
        
        // Déterminer aléatoirement nbre entre 1 et 100
        int x =  (int) ((Math.random() * 100) + 1);
        
        // Jouer tant que x n'a pas été trouvé
        Scanner scanner = new Scanner(System.in);
        int val;
        int nbEssais = 0;
        do{
            nbEssais ++;
            // Dempande util entrer 1 valeur
            System.out.print("Entrez un nombre : ");
            val = scanner.nextInt();
            
            // Check et affiche résultat
            if(x<val)
                System.out.println("x est plus petit");
            else if( x>val )
                System.out.println("x est plus grand");
        }while(val!=x);
        
        // Partie terminée
        
        // Calcule score
        if( nbEssais<3 )
            System.out.println("***");
        else if( nbEssais<6 )
            System.out.println("**");
        else
            System.out.println("Nul!");
    }
}
