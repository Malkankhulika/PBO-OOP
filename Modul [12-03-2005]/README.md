# <h1 align="center">Clinic Management System</h1>
<p align="center">Khulika Malkan</p>
<p align="center">2311110057</p>

# Deskripsi
Clinic Management System ini dibuat untuk mengelola data dokter, pasien, dan janji temu secara terstruktur. Sistem ini mencakup fitur Encapsulation (private fields, getter/setter), Packages (unguided2.entities), dan Class Relationships (Appointment menghubungkan Doctor, Patient eatures, DataChecker & DiagnosisCounter) untuk memastikan keamanan dan keteraturan data.

# Project Structure
```
Modul [12-03-2025]/
├── src/
│   └── guided2/
│       └── drive/
│           ├── TestPackages.java
│       └── hargabuku/
│           ├── KelasHarga.java
│       └── hargatoken/
│           ├── KelasToken.java
│       └── Animal.java
│       └── Cat.java
│       └── Driver.java
│       └── LibraryBook.java
│   └── unguided2/           # Root package (REQUIRED)
│       └── entities/       # Core classes
│           ├── Appointment.java
│           ├── DataChecker.java
│           ├── DiagnosisCounter.java
│           ├── Doctor.java
│           ├── MainClinic.java
│           └── Patient.java
└── README.md  (Detailed Project Explanations)
```

# Penjelasan Kelas
## Doctor
- Menyimpan data dokter seperti id, name, dan specialty.
- Menggunakan Encapsulation dengan private fields serta getter/setter.
- Memiliki daftar janji temu pasien.

## Patient
- Menyimpan data pasien seperti id, name, dan age.
- Menggunakan Encapsulation untuk melindungi data pasien.

