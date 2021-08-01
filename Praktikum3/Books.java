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
public class Books {
    String title;
    String author;
}
    class BookstestDrive{
        public static void main(String[] args) {
            Books[] myBooks = new Books[3];
            myBooks[0] = new Books();
            myBooks[1] = new Books();
            myBooks[2] = new Books();
            
            int x = 0;
            myBooks[0].title = "Melawan Kemustahilan";
            myBooks[1].title = "Muhammad Al Fatih 1453";
            myBooks[2].title = "awe-Inspiring me";
            myBooks[0].author = "Dewa Eka Prayoga";
            myBooks[1].author = "Felix Siauw";
            myBooks[2].author = "Dewi Nur Aisyah";
            
            while (x < myBooks.length) {
                System.out.print(myBooks[x].title);
                System.out.print(" Karya ");
                System.out.println(myBooks[x].author);
                x++;
        }
    }
}
