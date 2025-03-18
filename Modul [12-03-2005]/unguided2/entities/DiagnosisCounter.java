/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided2.entities;

/**
 *
 * @author Khulika Malkan
 */
public class DiagnosisCounter {
    private static int totalDiagnoses = 0;

    public static void addDiagnosis() {
        totalDiagnoses++;
    }

    public static int getTotalDiagnoses() {
        return totalDiagnoses;
    }
}


