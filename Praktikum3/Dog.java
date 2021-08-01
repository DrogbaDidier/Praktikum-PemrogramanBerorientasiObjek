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
public class Dog { //Membuat Class Dog
    String name; //Inisialisasi ariabel
    
    public static void main(String[] args){ //Deklarasi main method 
        Dog dog1 = new Dog();
        dog1.bark(); //Memanggil method bark
        dog1.name = "Ciko"; //Inisialisasi nama dog1
        
        Dog[] anjing = new Dog[3]; //Membuat array
        anjing[0] = new Dog();
        anjing[1] = new Dog();
        anjing[2] = dog1;
        
        anjing[0].name = "Dalma"; //Memberi nama anjing [0]
        anjing[1].name = "Doggy"; //Memberi nama anjing [1]
        
        System.out.println("nama anjing terakhir"); //Print "nama anjing terakhir
        System.out.println(anjing[2].name); //Print nama anjing [2]
        
        int x = 0; //Deklarasi x bernilai 0
        while (x < anjing.length) { //Looping x < jumlah anjing
            anjing[x].bark(); //Melakukan method bark
            x = x +1; //Nilai X akan terus bertambah
        }
    }

    private void bark() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
} 