/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

/**
 *
 * @author kevin
 */
class Movie {
    String title;
    String genre;
    int rating;
    void playIt() {
        System.out.println("playing the movie");
    }
}
public class MovieTestDrive {
    public static void main(String[] args) {
        Movie satu = new Movie();
        satu.title = "Harry Potter";
        satu.genre = "Magic";
        satu.rating = 8;
        
        Movie dua = new Movie();
        dua.title = "The Avengers";
        dua.genre = "Superhero";
        dua.rating = 4;
        dua.playIt();
        
        Movie tiga = new Movie();
        tiga.title = "Warkop DKI";
        tiga.genre = "Comedy";
        tiga.rating = 9;
    }
}
