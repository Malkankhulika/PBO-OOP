/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided2;

/**
 *
 * @author Khulika Malkan
 */
import Unguided2.entities.Appointment;
import Unguided2.entities.DataChecker;
import Unguided2.entities.DiagnosisCounter;
import Unguided2.entities.Doctor;
import Unguided2.entities.Patient;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Membuat dokter
        Doctor doctor1 = new Doctor("D001", "Dr. Selvi Tuniawati", "Neurologist");
        Doctor doctor2 = new Doctor("D002", "Dr. Otong Munajat  ", "Dermatologist");
        Doctor doctor3 = new Doctor("D003", "Dr. Khulika Malkan ", "Cardiologist");
        
        // Membuat pasien  
        Patient patient1 = new Patient("P001", "Dzihni Alifah", 26);
        Patient patient2 = new Patient("P002", "Intan Dita   ", 25);
        Patient patient3 = new Patient("P003", "Hasna Aisyah ", 30);
        
        // Validasi menggunakan DataChecker
        if (!DataChecker.isValidName(patient1.getName()) || !DataChecker.isValidAge(patient1.getAge())) {
            System.out.println("Data pasien tidak valid!");
            return;
        }

        if (!DataChecker.isValidName(patient2.getName()) || !DataChecker.isValidAge(patient2.getAge())) {
            System.out.println("Data pasien tidak valid!");
            return;
        }

        // Membuat janji temu
        Appointment appointment1 = new Appointment(doctor1, patient1, LocalDate.of(2025, 3, 17), "Migraine");
        DiagnosisCounter.addDiagnosis(); 

        Appointment appointment2 = new Appointment(doctor2, patient2, LocalDate.of(2025, 3, 18), "Skin Rash");
        DiagnosisCounter.addDiagnosis(); 

        Appointment appointment3 = new Appointment(doctor3, patient3, LocalDate.of(2025, 3, 18), "High Blood Pressure");
        DiagnosisCounter.addDiagnosis();         
        
        // Menampilkan informasi
        System.out.println("\n=== Data Dokter ===");
        System.out.println("ID: " + doctor1.getId() + ", Nama: " + doctor1.getName() + ", Spesialisasi: " + doctor1.getSpecialty());
        System.out.println("ID: " + doctor2.getId() + ", Nama: " + doctor2.getName() + ", Spesialisasi: " + doctor2.getSpecialty());
        System.out.println("ID: " + doctor3.getId() + ", Nama: " + doctor3.getName() + ", Spesialisasi: " + doctor3.getSpecialty());
        
        System.out.println("\n=== Data Pasien ===");
        System.out.println("ID: " + patient1.getId() + ", Nama: " + patient1.getName() + ", Usia: " + patient1.getAge());
        System.out.println("ID: " + patient2.getId() + ", Nama: " + patient2.getName() + ", Usia: " + patient2.getAge());
        System.out.println("ID: " + patient3.getId() + ", Nama: " + patient3.getName() + ", Usia: " + patient3.getAge());
        
        System.out.println("\n=== Data Janji Temu ===");
        for (Appointment appointment : doctor1.getAppointments()) {
            System.out.println("Dokter: " + appointment.getDoctor().getName() + " | Pasien: " + appointment.getPatient().getName() + " | Tanggal: " + appointment.getDate() + " | Diagnosis: " + appointment.getDiagnosis());
        }

        for (Appointment appointment : doctor2.getAppointments()) {
            System.out.println("Dokter: " + appointment.getDoctor().getName() + " | Pasien: " + appointment.getPatient().getName() + " | Tanggal: " + appointment.getDate() + " | Diagnosis: " + appointment.getDiagnosis());
        }

        for (Appointment appointment : doctor3.getAppointments()) {
            System.out.println("Dokter: " + appointment.getDoctor().getName() + " | Pasien: " + appointment.getPatient().getName() + " | Tanggal: " + appointment.getDate() + " | Diagnosis: " + appointment.getDiagnosis());
        }        
        
        // Menampilkan total diagnosis
        System.out.println("\nTotal diagnosis yang diberikan: " + DiagnosisCounter.getTotalDiagnoses());
    }
}
