/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices;

import java.util.HashMap;
import java.util.Set;


/**
 *
 * @author formation
 */
public class ExempleMap {
    
    public static void main(String[] args) {
        
        
        // 0. Ajoute 2 elem ds map
        HashMap<String, String> map = new HashMap<>();
        
        map.put("intrinsèque", "qui est inhérent à qqn, à qqch");
        map.put("ésotérique", "qui ne peut être compris que par les initiés");
        
        // 1. Itère sur ttes clés et affiche chaque clé : déf
        Set<String> cles = map.keySet();
        for(String cle:cles){// ou directement et sans variablie intermédiaire: for(String cle:map.keySet())
            
            System.out.println(cle + " : " + map.get(cle));
        }
        
        // 2. Supprime "ésotérique"
        map.remove("ésotérique");
        
        // 3. Affiche tte la map
        System.out.println( map );
    }
}
