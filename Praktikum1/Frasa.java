/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

/**
 *
 * @author kevin
 */
public class Frasa {

    public static void main(String[] args) {
        String[] kata1 = {"rumah", "sepeda", "ayam", "jam", "baju", "mobil", "laptop", "smartphone"};
        String[] kata2 = {"canggih", "nyaman", "enak", "terbaru", "besar", "hitam", "bagus", "luas"};
        String[] kata3 = {"itu", "di atas", "milikmu", "miliknya", "ditoko", "baru", "putih"};
        
        int kataone = kata1.length;
        int katatwo = kata2.length;
        int katathree = kata3.length;
        
        System.out.println("Jumlah List 1 = "+ kataone);
        System.out.println("Jumlah List 2 = "+ katatwo);
        System.out.println("Jumlah List 3 = "+ katathree);
        
        int random1 = (int) (Math.random() * kata1.length);
        int random2 = (int) (Math.random() * kata2.length);
        int random3 = (int) (Math.random() * kata3.length);
        
        String a = kata1[random1];
        String b = kata2[random2];
        String c = kata3[random3];
        System.out.println("Saya menginginkan sebuah "+a+" "+b+" "+c+" ");
        
        }
    
    }
