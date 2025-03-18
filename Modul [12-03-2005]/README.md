# <h1 align="center">Clinic Management System</h1>
<p align="center">Khulika Malkan</p>
<p align="center">2311110057</p>

# 📖 Deskripsi
Clinic Management System ini dibuat untuk mengelola data dokter, pasien, dan janji temu secara terstruktur. Sistem ini mencakup Encapsulation (private fields, getter/setter), Packages (unguided2.entities), dan Class Relationships (Appointment menghubungkan Doctor, Patient eatures, DataChecker & DiagnosisCounter) untuk memastikan keamanan dan keteraturan data.

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
## 1. Class Doctor
### Atribut:
- id (String) → ID unik dokter.
- name (String) → Nama dokter.
- specialty (String) → Spesialisasi dokter.
- appointments (List) → Daftar janji temu dokter.
### Method:
- Konstruktor untuk inisialisasi dokter.
- Getter dan setter untuk akses data dokter.
- addAppointment(Appointment appointment) → Men

## 2. Class Patient
### Atribut:
- id (String) → ID unik pasien.
- name (String) → Nama pasien.
- age (int) → Usia pasien.
### Method:
- Konstruktor untuk inisialisasi pasien.
- Getter dan setter untuk akses data pasien.

## 3. Class Appointment (Hubungan antara Dokter dan Pasien)
### Atribut:
- doctor (Doctor) → Dokter yang bertanggung jawab.
- patient (Patient) → Pasien yang membuat janji temu.
- date (LocalDate) → Tanggal janji temu.
- diagnosis (String) → Diagnosis yang diberikan.
### Method:
- Konstruktor untuk inisialisasi janji temu.
- Getter dan setter untuk akses data janji temu.

## 4. Class DataChecker (Validasi Data)
### Method:
- isValidName(String name) → Memvalidasi apakah nama hanya berisi huruf dan spasi.
- isValidAge(int age) → Memvalidasi apakah usia pasien valid (misalnya antara 0-120).

## 5. Class DiagnosisCounter (Menghitung Jumlah Diagnosis)
### Atribut:
- totalDiagnoses (static int) → Menyimpan jumlah total diagnosis.
### Method:
- addDiagnosis() → Menambahkan jumlah diagnosis.
- getTotalDiagnoses() → Mengembalikan jumlah total diagnosis.

## 6. Class Main (Entry Point Program)
### Fungsi:
- Membuat objek dokter dan pasien.
- Memvalidasi data pasien menggunakan DataChecker.
- Membuat janji temu menggunakan Appointment.
- Menampilkan informasi dokter, pasien, dan janji temu.
- Menghitung total diagnosis yang diberikan menggunakan DiagnosisCounter.

# 🔍 Penjelasan Konsep OOP yang Diterapkan
## A. Encapsulation (Enkapsulasi)
Menggunakan private fields agar data tidak dapat diakses langsung dari luar dan Menggunakan getter dan setter untuk memberikan kontrol terhadap akses serta modifikasi data.
## B. Packages
Semua kelas dikelompokkan dalam paket Unguided2.entities untuk menjaga keteraturan dan modularitas.
## C. Class Relationships (Hubungan Antar Kelas)
- Association: Appointment menghubungkan Doctor dan Patient.
- Aggregation: Appointment memiliki referensi ke Doctor dan Patient.
- Static Methods & Variables: DiagnosisCounter menggunakan static variable untuk menyimpan jumlah total diagnosis.

# ✅ Output
![image](https://github.com/user-attachments/assets/13e20ebe-9a60-4347-81d5-a0db49022421)

# 🏆 Kesimpulan
Proyek Clinic Management System ini membantu saya memahami konsep Encapsulation, Packages, dan Class Relationships dalam OOP untuk membangun sistem yang aman, terstruktur, dan mudah dikembangkan. Encapsulation diterapkan dengan menjadikan atribut dalam kelas bersifat private, sehingga data tetap terlindungi dan hanya dapat diakses melalui metode getter dan setter, yang memastikan validitas serta keamanan data. Packages digunakan untuk mengorganisasi kode secara sistematis, sedangkan Class Relationships mencerminkan hubungan antarobjek dalam sistem, di mana kelas Appointment berperan sebagai penghubung antara Doctor dan Patient, yang menunjukkan penerapan konsep Association dan Aggregation.
