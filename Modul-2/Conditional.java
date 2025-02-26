/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul1;

import java.util.Scanner;

/**
 *
 * @author Khulika Malkan
 */
public class Conditional {

    public static void main(String[] args) {    

        Scanner myObj = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai;
        nilai = myObj.nextInt();
        System.out.println("Nilai yang dimasukkan: " + nilai);

        // If-else statement
        if (nilai >= 90) {
            System.out.println("Nilai A");
        } else if (nilai >= 80) {
            System.out.println("Nilai B");
        } else if (nilai >= 70) {
            System.out.println("Nilai C");
        } else {
            System.out.println("Nilai D");
        }

        // Switch statement
        System.out.println("Pilih angka 1, 2, atau 3: ");
        int pilihan = myObj.nextInt();
        myObj.close();
        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih 1");
                break;
            case 2:
                System.out.println("Anda memilih 2");
                break;
            case 3:
                System.out.println("Anda memilih 3");
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }
    }
}