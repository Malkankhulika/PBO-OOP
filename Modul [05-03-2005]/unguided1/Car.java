/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul2;

/**
 *
 * @author Khulika Malkan
 */
public class Car {
    private String brand;
    private Engine engine;
    private Transmission transmission;
    private Color color;
    private Headlights headlights;

    public Car(String brand, Engine engine, Transmission transmission, Color color, Headlights headlights) {
        this.brand = brand;
        this.engine = engine;
        this.transmission = transmission;
        this.color = color;
        this.headlights = headlights;
    }

    public void startCar() {
        System.out.println("Starting car: " + brand);
        engine.start();
    }

    public void stopCar() {
        System.out.println("Stopping car: " + brand);
        engine.stop();
    }

    public void shiftGear(int gear) {
        transmission.shiftGear(gear);
    }

    public void toggleHeadlights(boolean state) {
        if (state) {
            headlights.turnOn();
        } else {
            headlights.turnOff();
        }
    }

    public void displayCarInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Engine Type: " + engine.getType());
        System.out.println("Transmission Type: " + transmission.getType());
        System.out.println("Color: " + color.getColor());
        System.out.println("----------------------------");
    }
}
