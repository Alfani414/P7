/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.p7_pbo;

/**
 *
 * @author A-9
 */

class buku{
        String judul;
        String author;
        int tahun_terbit = 2023;
        harga harga= new harga();
        perusahaan penerbit =  new perusahaan();
}
class harga{
        double jual = 10000.00;
        double beli = 80000.00;
}

public class latihan_kelas {
    public static void main(String[] args) {
       
        buku buku1 = new buku();
        buku buku2 = new buku();
        buku1.judul = "java 1";
        buku1.author = "a";
        buku2.judul = "java 2";
        buku2.author = "b";
        
        System.out.println(buku1.judul);
        System.out.println(buku1.author);
        System.out.println(buku1.tahun_terbit);
        System.out.println(buku1.harga.jual);
        System.out.println(buku2.judul);
        System.out.println(buku2.author);
        System.out.println(buku1.tahun_terbit);
        System.out.println(buku1.penerbit);
        
    }
}