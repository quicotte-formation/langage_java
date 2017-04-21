/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices;

import java.util.Random;

/**
 * Ma classe Tableaux et sa javadoc.
 * @author formation
 */
public class Tableaux {
    
    public static void afficheTableau(String[][] tab){
        
        for(int i=0;i<tab.length;i++){
            for(int j=0;j<tab[i].length;j++){
                System.out.print( tab[i][j] );
            }
            System.out.println();
        }
    }
    
    /**
     * Place des caratères ds le tableau, à des emplacements aléatoires.
     * @param tab
     * @param c
     * @param nbCarracteres 
     */
    public static void placeCaracteres(String[][] tab, char c, int nbCarracteres){
        
        for(int i=0;i<nbCarracteres;i++){
            
            Random random = new Random();
            
            int x = random.nextInt(tab.length);
            int y = random.nextInt(tab[0].length);
            
            tab[x][y] = Character.toString(c);
        }
    }
    
    /**
     * Cree un nouveau tableau contenant des "*"
     * @param cote
     * @return Un nouveau tab à 2 dim, dont la largeur et heuteur est cote.
     */
    public static String[][] creerTab(int cote){
        
        String[][] tab = new String[cote][cote];
        
        // Remplit itérativement tab avec des étoiles.
        for(int i=0;i<cote;i++){
            for(int j=0;j<cote;j++)
                tab[i][j] = "*";
        }
        
        return tab;
    }
    
    public static void main(String[] args) {
        
        String[][] tab = creerTab(10);
        String[][] tab2 = creerTab(100);
        
        placeCaracteres(tab, '$', 5);
        
        afficheTableau(tab);
    }
}
