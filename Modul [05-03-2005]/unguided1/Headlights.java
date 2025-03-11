/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modul2;

/**
 *
 * @author Khulika Malkan
 */

public class Headlights {
    private boolean on;

    public void turnOn() {
        on = true;
        System.out.println("Headlights turned on.");
    }

    public void turnOff() {
        on = false;
        System.out.println("Headlights turned off.");
    }
}