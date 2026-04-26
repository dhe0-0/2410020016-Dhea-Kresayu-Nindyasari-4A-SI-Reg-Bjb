/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas02;

/**
 *
 * @author Asus
 */
public class Tugas02 {

    public static void main(String[] args) {
         // Object 1 (constructor kosong)
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.tampil();

        System.out.println("Tes");

        // Object 2 (constructor isi)
        Mahasiswa mhs2 = new Mahasiswa("Zayn Malik", "001");
        mhs2.tampil();
    }
}
