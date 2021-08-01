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
public class Bioskop {
    private double harga;
    private static int jumlahTempat;
    private int tanggal;       
           
    public Bioskop(double harga, int jumlahTempat, int tanggal) {        
        this.harga = harga;
        this.jumlahTempat = jumlahTempat;
        this.tanggal = tanggal;      
    }           
    
    public double getHarga() {
        return harga;
    }

    public int getJumlahTempat() {
        return jumlahTempat;
    }

    public int getTanggal() {
        return tanggal;
    }   
    
         

    public String toString() {        
        return "\n========Film Bioskop========"
                + "\nHarga tiket                           : $" + getHarga()
                + "\nTanggal Tayang                        : " + getTanggal()
                + "\nJumlah tempat duduk yang tersedia     : " + getJumlahTempat();
    }

}


