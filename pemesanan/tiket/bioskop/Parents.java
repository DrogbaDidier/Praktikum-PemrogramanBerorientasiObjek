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
public abstract class Parents extends Bioskop{
private String nama;
private int id;
int jumlahPesanan;
private int harga;
private String akun;

Parents(double harga, int jumlahTempat,int tanggal,String akun,String nama,int id,int jumlahPesanan){
    super(harga,jumlahTempat,tanggal);
    this.nama = nama;
    this.id = id;
    this.jumlahPesanan = jumlahPesanan;
    this.akun = akun;
}

public String getNama(){
    return nama;
}
public int getId(){
    return id;
}
public int getJumlahPesanan(){
    return jumlahPesanan;
}
public String getAkun(){
    return akun;
}
public String toString(){
    return super.toString()+"\n===Pesanan Anda===\nJenis akun = "+ getAkun()+"\nNama : "+getNama()+"\nID : "+
            getId()+"\nJumlah kursi yang dipesan : "+getJumlahPesanan();
}
public abstract double totalHarga();
}
