# <h1 align="center">Clinic Management System</h1>
<p align="center">Module: Encapsulation, Packages, Class Relationships</p>
<p align="center">Khulika Malkan</p>
<p align="center">2311110057</p>

## Project Structure
Antrean prioritas adalah jenis antrian khusus yang setiap elemennya dikaitkan dengan nilai prioritas . Dan, elemen dilayani berdasarkan prioritasnya. Artinya, elemen dengan prioritas lebih tinggi dilayani terlebih dahulu. Namun, jika elemen dengan prioritas yang sama muncul, maka elemen tersebut akan dilayani sesuai urutannya dalam antrian.
Menetapkan Nilai Prioritas Umumnya, nilai elemen itu sendiri dipertimbangkan untuk menetapkan prioritas. Misalnya, Elemen dengan nilai tertinggi dianggap sebagai elemen dengan prioritas tertinggi. 

# Priority Queue


Gambar diatas menunjukkan pohon biner dengan kunci terendah dan kunci tertinggi [3].
- Kunci terendah adalah kunci yang paling dekat dengan bagian bawah pohon.
- Kunci tertinggi adalah kunci yang paling dekat dengan bagian atas pohon.
- Kunci bawah adalah kunci yang paling dekat dengan tengah pohon.
- Kunci tengah adalah kunci yang paling dekat dengan bagian bawah pohon.
- Kunci tertinggi adalah kunci yang paling dekat dengan bagian atas pohon.


Pohon tersebut adalah heap biner, yang merupakan jenis struktur data heap yang memiliki sifat-sifat berikut:
- Setiap node memiliki paling banyak dua node anak.
- Nilai setiap node lebih besar dari atau sama dengan nilai node anaknya (untuk heap maks) atau lebih kecil dari atau sama dengan nilai node anaknya (untuk heap min).
- Sifat heap dipertahankan untuk semua node di pohon.

## Unguided 
### 1. Modifikasi guided diatas yang mana heap dikonstruksi secara manual berdasarkan user

#### Kode Program
```C++
#include <iostream>

```
#### Full Code Screenshot
![image](https://github.com/Malkankhulika/Modul-8/assets/149793653/c63fd870-e28a-471c-ae8d-40b59eb62a62)


#### Output:
![image](https://github.com/Malkankhulika/Modul-8/assets/149793653/087d0bc2-3c3f-4476-aa8d-684c4b58429c)


#### Penjelasan:
##### Struktur Data:
- H: vector<int> yang menyimpan elemen-elemen dalam antrian prioritas. Vector adalah sebuah array yang ukurannya dapat bertambah secara dinamis.
- heapSize: Variabel integer yang melacak jumlah elemen yang saat ini ada di antrian. Variabel ini mencatat berapa banyak elemen yang terisi dalam vector H.
##### Fungsi:
- parent(i): Menghitung indeks node induk dari node pada indeks i di heap. Fungsi ini menghitung indeks induk dari node yang diberikan pada indeks i.
- leftChild(i): Menghitung indeks node anak kiri dari node pada indeks i di heap. Fungsi ini menghitung indeks anak kiri dari node yang diberikan pada indeks i.
- rightChild(i): Menghitung indeks node anak kanan dari node pada indeks i di heap. Fungsi ini menghitung indeks anak kanan dari node yang diberikan pada indeks i.

- remove(i): Menghapus elemen pada indeks i dari antrian prioritas. Ia mengganti nilai pada indeks i dengan nilai yang lebih tinggi daripada elemen lain di antrian (dicapai dengan menambahkan 1 ke maksimum saat ini). Kemudian, ia memanggil shiftUp untuk memindahkan elemen ini dengan prioritas tinggi secara artifisial ke atas di heap. Terakhir, ia memanggil extractMax untuk secara efektif menghapus elemen pada indeks i yang didorong ke atas. Fungsi ini menghapus elemen dari antrian dengan indeks yang diberikan.

## Kesimpulan

