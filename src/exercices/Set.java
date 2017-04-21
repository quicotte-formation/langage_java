/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices;

import java.util.Arrays;
import java.util.LinkedHashSet;

/**
 *
 * @author formation
 */
public class Set {
    
    public static void main(String[] args) {
        
        //java.util.List<String> l = Arrays.asList( "a", "b", "c" );
        
        LinkedHashSet<String> set = new LinkedHashSet<>();
        
        set.add("a");
        set.add("b");
        set.add("a");

        System.out.println( set );
    }
}
