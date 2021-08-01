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
public class gold extends Parents {
private double diskon;
private double preOrder;
private int tanggalBeli;
gold(double harga, int jumlahTempat,int tanggal,String akun,String nama,int id,int jumlahPesanan,int tanggalBeli){
    super(harga,jumlahTempat,tanggal,akun,nama,id,jumlahPesanan); 
    this.tanggalBeli = tanggalBeli;
}
public double getDiskon(){
    if(jumlahPesanan >= 3){
        diskon = 0.15;
    }return 0;
}
public int getPreOrder(){
    if(getTanggal()- tanggalBeli >= 3 && getTanggal()- tanggalBeli < 5){
        diskon = 0.1;
    }else if(getTanggal()- tanggalBeli >= 5 && getTanggal()- tanggalBeli < 7){
        diskon = 0.15;
    }else if(getTanggal()- tanggalBeli >= 7){
        diskon = 0.20;
}return 0;
}
    @Override
    public double totalHarga() {
        return getJumlahPesanan()*getHarga()-(getJumlahPesanan()*getHarga()*(getDiskon() + getPreOrder()));
    }
     public String toString(){
        return String.format(super.toString()+"\nTotal harga : $"+totalHarga());
    }
}
