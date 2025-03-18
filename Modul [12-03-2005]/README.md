# <h1 align="center">Clinic Management System</h1>
<p align="center">Khulika Malkan</p>
<p align="center">2311110057</p>

# 📖 Deskripsi
Clinic Management System ini dibuat untuk mengelola data dokter, pasien, dan janji temu secara terstruktur. Sistem ini mencakup fitur Encapsulation (private fields, getter/setter), Packages (unguided2.entities), dan Class Relationships (Appointment menghubungkan Doctor, Patient eatures, DataChecker & DiagnosisCounter) untuk memastikan keamanan dan keteraturan data.

# 📂 Project Structure
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

# 📜 Detailed Project Explanations
## Class Doctor
- Menyimpan data dokter seperti id, name, dan specialty.
- Menggunakan Encapsulation dengan private fields serta getter/setter.
- Memiliki daftar janji temu pasien.

## Patient
- Menyimpan data pasien seperti id, name, dan age.
- Menggunakan Encapsulation untuk melindungi data pasien.

## Appointment (Hubungan antara Dokter dan Pasien)
- Menghubungkan Class Doctor dengan Patient.
- Menyimpan informasi janji temu seperti date dan diagnosis.
- Memastikan hubungan antar objek berjalan sesuai konsep Class Relationships.

## DataChecker (Validasi Data)
- Mengecek apakah nama pasien valid (hanya huruf dan spasi).
- Mengecek apakah umur pasien berada dalam rentang yang diperbolehkan.
- Meningkatkan keamanan data melalui validasi input.

## DiagnosisCounter (Total Diagnosis)
- Menghitung jumlah total diagnosis yang telah diberikan.
- Menyediakan metode statis addDiagnosis() untuk menambah jumlah diagnosis.
- Memanfaatkan konsep static method untuk mengelola data global.

## Main (Entry Point Program)
- Membuat beberapa Doctor dan Patient untuk di jalankan (run).
- Membuat Appointment dan menghubungkan Doctor dengan Patient.
- Menampilkan informasi dokter, pasien, dan janji temu.
- Menghitung total diagnosis yang diberikan menggunakan DiagnosisCounter.

## ✅ Output
