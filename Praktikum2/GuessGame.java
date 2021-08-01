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
public class GuessGame {
    Player p1;
    Player p2;
    Player p3;
    
    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        
        int guessP1 = 0;
        int guessP2 = 0;
        int guessP3 = 0;
        
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;
        
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Aku Mikirin Angka Antara 0-9...");
        
        while (true) {
            System.out.println("Angka Yang Harus Ditebak Adalah " +targetNumber);
            
            p1.guess();
            p2.guess();
            p3.guess();
            
            guessP1 = p1.number;
            System.out.println("Pemain pertama menebak angka"+guessP1);
            
            guessP2 = p2.number;
            System.out.println("Pemain kedua menebak angka"+guessP2);
            
            guessP3 = p3.number;
            System.out.println("Pemain ketiga menebak angka "+guessP3);
            
            if (guessP1 == targetNumber) {
                p1isRight = true;
            }
            if (guessP2 == targetNumber) {
                p2isRight = true;
            }
            if (guessP3 == targetNumber) {
                p3isRight = true;
            }
            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("Mantapp sudah ada yang menang!");
                System.out.println("Apa pemain 1 yang menang? "+p1isRight);
                System.out.println("Apa pemain 2 yang menang? "+p2isRight);
                System.out.println("Apa pemain 3 yang menang? "+p3isRight);
                System.out.println("Permainan selesai");
                break;
            } else {
                System.out.println("Hayuu... coba tebak lagi..");
            }
        }
    }
}
