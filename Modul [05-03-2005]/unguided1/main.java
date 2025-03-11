/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul2;

/**
 *
 * @author Khulika Malkan
 */
public class main {
    public static void main(String[] args) {
        // Mobil pertama dengan karakteristik tertentu
        Engine engine1 = new Engine("V8", 500);
        Transmission transmission1 = new Transmission("Automatic", 6);
        Color color1 = new Color("Merah");
        Headlights headlights1 = new Headlights();
        Car car1 = new Car("Ferrari F8", engine1, transmission1, color1, headlights1);

        // Mobil kedua dengan karakteristik berbeda
        Engine engine2 = new Engine("Electric", 700);
        Transmission transmission2 = new Transmission("Single-Speed", 1);
        Color color2 = new Color("pink");
        Headlights headlights2 = new Headlights();
        Car car2 = new Car("Tesla Model S", engine2, transmission2, color2, headlights2);

        // Menampilkan informasi kedua mobil
        System.out.println("Informasi Mobil 1:");
        car1.displayCarInfo();
        System.out.println("Informasi Mobil 2:");
        car2.displayCarInfo();

        // Menjalankan fitur mobil pertama
        System.out.println("Testing Mobil 1:");
        car1.startCar();
        car1.shiftGear(3);
        car1.shiftGear(6);
        car1.toggleHeadlights(true);
        car1.toggleHeadlights(false);
        car1.stopCar();

        System.out.println();
        
        // Menjalankan fitur mobil kedua dengan output berbeda
        System.out.println("Testing Mobil 2:");
        car2.startCar();
        car2.shiftGear(1);
        car2.toggleHeadlights(true);
        car2.toggleHeadlights(false);
        car2.stopCar();
    }
}