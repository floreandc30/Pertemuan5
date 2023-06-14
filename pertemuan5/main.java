package com.Florean_Desvita_Cindirahayu.pbo.pertemuan5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Barang[] keranjang = new Barang[10];
        int indeksKeranjang = 0;

        Barang[] etalase = {
                new Barang("Indomie", 3000),
                new Barang("Baju", 150000),
                new Barang("Beras",12000),
                new Barang("Sosis", 15000),
                new Barang("Celana", 200000)
        };
        System.out.println("Jumlah Barang di Etalase : "+ etalase.length);
        System.out.println("Daftar Barang di Etalase : ");
        int i = 1;
        for(Barang b : etalase){
            System.out.println("Barang ke-"+ i);
            b.showInfo();
            i++;
        }

        Scanner input = new Scanner(System.in);
        int pilihan = 0;
        do {
            System.out.print("\nMasukkan nomor barang yang ingin dimasukkan ke keranjang (0 untuk keluar): ");
            pilihan = input.nextInt();
            if (pilihan >= 1 && pilihan <= etalase.length && indeksKeranjang < keranjang.length) {
                keranjang[indeksKeranjang] = etalase[pilihan-1];
                System.out.println(keranjang[indeksKeranjang].nama + " telah dimasukkan ke keranjang.");
                indeksKeranjang++;
            } else if (pilihan < 0 || pilihan > etalase.length) {
                System.out.println("Pilihan tidak valid. Silakan masukkan nomor yang sesuai dengan barang di etalase.");
            } else if (indeksKeranjang >= keranjang.length) {
                System.out.println("Keranjang sudah penuh.");
            }
        } while (pilihan != 0);

        System.out.println("Barang di Keranjang : ");
        for (int j = 0; j < indeksKeranjang; j++) {
            System.out.println(keranjang[j].nama + " - Harga: " + keranjang[j].harga);
        }
    }
}
