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
public class Diamond extends Parents {
    private double preorder;
    private int tanggalBeli;
    
    Diamond(double harga, int jumlahTempat,int tanggal,String akun,String nama,int id,int jumlahPesanan,int tanggalBeli){
    super(harga,jumlahTempat,tanggal,akun,nama,id,jumlahPesanan); 
    this.tanggalBeli = tanggalBeli;
}

    public int getTanggalBeli(){
        return tanggalBeli;
    }
    public double getBonus(){
        if(((int)(Math.random()*((10-1)+1))+1)==2){
            return 0.5;
        }else{
            return 0;
        }
    }
    
    public double getPreorder(){
        if((getTanggal()-getTanggalBeli())<=3){
            return 0.1;
        }if((getTanggal()-getTanggalBeli())>3&&(getTanggal()-getTanggalBeli())<=5){
            return 0.15;
        }if((getTanggal()-getTanggalBeli())>5&&(getTanggal()-getTanggalBeli())<=7){
            return 0.2;
        }return 0;
}

    @Override
    public double totalHarga() {
        return getHarga()-(getBonus()*getHarga())+(getPreorder()*getHarga());
    }
    public String toString(){
        return String.format(super.toString()+"\nTotal harga : $"+totalHarga());
    }
}
