/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.hierearchiepers;

import java.util.HashSet;

/**
 *
 * @author formation
 */
public class Responsable extends Employe {
    

    protected HashSet<Employe> employes = new HashSet<>();

    @Override
    public String toString() {
        return String.format( "Responsable: %s Liste des employés: %s", 
                super.toString(),
                this.employes );
    }
    
    public HashSet<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(HashSet<Employe> employes) {
        this.employes = employes;
    }
    
    
}
