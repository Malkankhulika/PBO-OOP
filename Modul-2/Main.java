/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modul1;

import java.util.Scanner;

/**
 *
 * @author Khulika Malkan
 */
public class Main {

    public static void main(String[] args) {
        // Declare the variables
        int a,b,c;
        // input the integer
        System.out.println("Enter your number: ");
        // create scanner object
        Scanner input = new Scanner(System.in);
        // Read the next integer from the screen
        a = input.nextInt();
        b = input.nextInt();
        c = a + b;
        //display the integer
        System.out.println("entered integer is: " + (a) +  "entered integer" + (b));
        System.out.println("hasil jumlah a+b adalah: " + (c));
    }
}
