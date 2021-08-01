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
public class ProgramSederhana {

    public static void main(String[] args) {
        
    
        int x = 3;
        String name = "Dirk";
        x = x * 17;
        System.out.println("x is " + x);
        double d = Math.random();

        while (x > 12) {
            x = x - 1;
        }

        for ( x = 0; x < 10; x = x + 1) {
            System.out.println("x is now " + x);
        }

        if (x == 10) {
            System.out.println("x must be 10");
        } else {
            System.out.println("x isn't 10");
        }
        if ((x < 3) & (name.equals("Dirk"))) {
            System.out.println("Gently");
        }
    }
}
