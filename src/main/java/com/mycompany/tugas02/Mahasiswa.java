/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas02;

/**
 *
 * @author Asus
 */
public class Mahasiswa {
    String nama;
    String nim;
    
    // Constructor tanpa parameter
    public Mahasiswa() {
        nama = "Kim Juhoon";
        nim = "002";
        System.out.println("Constructor Jalan");
    }

    // Constructor dengan parameter
    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // Method tanpa return
    public void tampil() {
        System.out.println(nim);
        System.out.println(nama);
    }

    // Method dengan return
    public String getNama() {
        return nama;
    }
}
