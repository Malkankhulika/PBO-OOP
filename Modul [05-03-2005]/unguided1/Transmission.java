/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul2;

/**
 *
 * @author Khulika Malkan
 */
public class Transmission {
    private String type;
    private int gears;

    public Transmission(String type, int gears) {
        this.type = type;
        this.gears = gears;
    }

    public void shiftGear(int gear) {
        if (gear > 0 && gear <= gears) {
            System.out.println("Shifting to gear: " + gear);
        } else {
            System.out.println("Invalid gear!");
        }
    }

    public String getType() {
        return type;
    }
}

