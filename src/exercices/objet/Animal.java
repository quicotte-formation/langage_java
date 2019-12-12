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
public class Animal {

    private String nom;
    private String genre;
    private int nbPattes;

    public Animal(String nom, int nbPattes) {
        this.nom = nom;
        this.nbPattes = nbPattes;
    }

    public Animal() {
    }

    /**
     * Crée 1 nouv animal sur base des params passés.
     * @param nom
     * @param genre
     * @param nbPattes 
     */
    public Animal(String nom, String genre, int nbPattes){
        
        this.genre=genre;
        this.nbPattes=nbPattes;
        this.nom=nom;
    }
    
    public void affiche() {

        System.out.println(this.nom + " " + this.genre + " " + this.nbPattes);
    }

//    public Animal(int nbPattes, String genre, String nom) {
//
//        
//    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbPattes() {
        return nbPattes;
    }

    public void setNbPattes(int nbPattes) {
        this.nbPattes = nbPattes;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}
