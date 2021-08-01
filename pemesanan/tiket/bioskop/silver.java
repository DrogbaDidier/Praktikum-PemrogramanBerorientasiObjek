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
public class silver extends Parents {
    private double diskon;
   
silver(double harga, int jumlahTempat,int tanggal,String akun,String nama,int id,int jumlahPesanan){
    super(harga,jumlahTempat,tanggal,akun,nama,id,jumlahPesanan); 
}
public double getDiskon(){
    if(jumlahPesanan >=5){
        diskon = 0.1;
    }
    return 0;
}
    @Override
    public double totalHarga() {
     return getJumlahPesanan()*getHarga()-(getJumlahPesanan()*getHarga()*getDiskon());
    }
    public String toString(){
        return String.format(super.toString()+"\nTotal harga : $"+totalHarga());
    }
}


