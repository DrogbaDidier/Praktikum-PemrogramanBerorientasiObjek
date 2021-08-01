/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum3;

/**
 *
 * @author kevin
 */
public class Song {
    String title;
    String genre;
}
    class SongtestDrive{
        public static void main(String[] args) {
            Song[] mySong = new Song[3];
            mySong[0] = new Song();
            mySong[1] = new Song();
            mySong[2] = new Song();
            
            int x = 0;
            mySong[0].title = "Tanpa Cinta";
            mySong[1].title = "Malaikat Juga Tahu";
            mySong[2].title = "Asal Kau Bahagia";
            mySong[0].genre = "Yovie & Nuno";
            mySong[1].genre = "Glenn Fredly";
            mySong[2].genre = "Armada";
            
            while (x < mySong.length) {
                System.out.print(mySong[x].title);
                System.out.print(" Karya ");
                System.out.println(mySong[x].genre);
                x++;
        }
    }
}
