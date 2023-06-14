package com.Florean_Desvita_Cindirahayu.pbo.pertemuan5;
import java.util.ArrayList;
public class Barang {
    String nama;
    int harga;
    boolean sudahDitambahkan; //tambahkan atribut untuk menandai apakah barang sudah ditambahkan ke keranjang atau belum
    public Barang () {}
    public Barang (String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }
    public void showInfo(){
        System.out.println("Nama : " + nama );
        System.out.println("Harga : " + harga);
    }
    //tambahkan fungsi keranjang untuk menambahkan barang ke keranjang
    public void isi_keranjang(ArrayList<Barang> keranjang){
        if (!sudahDitambahkan) { //cek apakah barang sudah ditambahkan ke keranjang sebelumnya
            keranjang.add(this); //tambahkan objek Barang ke dalam ArrayList keranjang
            sudahDitambahkan = true; //set nilai atribut sudahDitambahkan menjadi true
            System.out.println("Barang " + nama + " telah ditambahkan ke keranjang.");
        } else {
            System.out.println("Barang " + nama + " sudah ditambahkan ke keranjang sebelumnya.");
        }
    }
}
