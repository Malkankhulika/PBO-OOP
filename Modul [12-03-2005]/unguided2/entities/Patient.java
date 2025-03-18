/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided2.entities;

/**
 *
 * @author Khulika Malkan
 */
// Patient class
import java.util.ArrayList;
import java.util.List;

public class Patient {
    private String id;
    private String name;
    private int age; // FIXED: Tidak mencoba mengubah int ke String
    private List<Appointment> appointments;

    public Patient(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.appointments = new ArrayList<>();
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; } // FIXED: Tetap menggunakan int

    public void addAppointment(Appointment appointment) {
        this.appointments.add(appointment);
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }
}

