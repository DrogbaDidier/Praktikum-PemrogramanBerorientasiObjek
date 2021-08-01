/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemlan.tugas;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Main {
public static void main(String[] args) throws CloneNotSupportedException {
    Scanner masukan = new Scanner(System.in);
    

    System.out.print("Masukan Warna : ");
    String warna = masukan.next();
    System.out.print("Apakah SegiDelapan tersebut mau diisi warna ? (true/false) : " );
    String isi = masukan.next();
    boolean filled = false;
    if (isi.equals("true")) {
      filled = true;}
    else{
        filled = false;
    }
    System.out.print("Masukan nilai sisi : ");
    double sisi = masukan.nextDouble();
    
    
    Octogon SegiDelapan = new Octogon(sisi,warna);
    Octogon SegiDelapan2 = (Octogon)SegiDelapan.clone();

    System.out.println("\nColor : " + SegiDelapan.getWarna());
    System.out.println("Area: " + SegiDelapan.getArea());
    System.out.println("Perimeter: " + SegiDelapan.getPerimeter());
    if (SegiDelapan.compareTo(SegiDelapan2) == 0) {
      System.out.println("Octogon 1 dan Octogon 2 sama");} 
    else {
      System.out.println("Octogon 1 dan Octogon 2 tidak sama");
    }
    }
    
}

