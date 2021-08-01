/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemesanan.tiket.bioskop;

/**
 *
 * @author USER
 */
public class Main {
public static void main(String[] args) {
        silver s1 = new silver(25.0,25,100,"Silver","Budi",123,5);
        System.out.println(s1);
        System.out.println("");
        gold g1 = new gold(25.0,25,95,"Gold","Michael",456,5,20);
        System.out.println(g1);
        System.out.println("");
        Diamond d1 = new Diamond(25.0,25,90,"Gold","Jackson",789,5,19);
        System.out.println(d1);
    }
    
}