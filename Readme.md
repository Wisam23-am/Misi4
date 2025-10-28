# 🖥️ PC Builder Tycoon - Core Engine v1.0

### 👥 Tim
- 3124600032 Muhammad Mahdavikia Abdillah
- 3124600041 Aqila Wisam Madani Ma'murri

---

## 💡 Deskripsi Arsitektur
Arsitektur sistem kami berfokus pada prinsip **Information Expert** dan **Separation of Concerns** (Pemisahan Tanggung Jawab).

* **Refactoring Utama:** Logika untuk membuat laporan telah dipindahkan dari kelas *generator* (`PCReportGenerator` dan `SalesReport`) langsung ke dalam kelas data yang relevan (`PC` dan `Customer`).
* **Modularitas:** Kode diorganisir ke dalam *package* yang jelas: `core`, `components` (dengan sub-package `maincomponents`, `peripheral`, `storage`), `customer`, `sales`, dan `reporting`.

---

## 🚀 Fitur Showcase
Demo di `Main.java` mendemonstrasikan fungsionalitas inti:

* **PC Building:** Membuat instance `PC` baru dengan komponen inti (CPU, Motherboard, RAM) dan komponen tambahan (Storage, Peripheral).
* **PC Report:** Memanggil metode `pc.generateReport()` yang telah direfaktor untuk mencetak laporan build yang rapi.
* **Customer Sales:** Menunjukkan fungsionalitas kedua dengan membuat `Customer` dan memanggil `cust.generateSalesReport()` untuk laporan penjualan.
* **Output:** Menghasilkan output konsol yang bersih dan jelas, mensimulasikan ringkasan rakitan PC.

---

## ⚙️ Cara Menjalankan (Compile & Run)

Pastikan Anda memiliki **Java Development Kit (JDK)** terinstal di sistem Anda.

1.  **Buka Terminal/Command Prompt**
    Arahkan terminal Anda ke *root folder* proyek (folder yang berisi direktori `com`).

2.  **Compile Semua File .java**
    Jalankan perintah berikut untuk meng-compile semua file source code:

    ```bash
    javac com\pcbuilder\core\Main.java
    ```

3.  **Jalankan Showcase Demo**
    Setelah kompilasi berhasil (tidak ada error), jalankan kelas `Main` dengan *fully qualified name* (termasuk nama package):

    ```bash
    java com.pcbuilder.core.Main
    ```

4.  **Output yang Diharapkan**
    Anda akan melihat output laporan build PC dari `Main.java` (dan laporan customer) tercetak di konsol Anda.

---

## 📖 Refleksi Tim (Team Reflections)

### 💡 Momen “Aha!” Terbesar
* **Wisam (3124600041):** Berhasil membuat tampilan `Readme.md` yang sebelumnya dikira sulit.
* **Mahda (3124600032):** Berhasil melakukan refactoring dengan pola *move method* dan mengerti perbedaan praktis antara agregasi dan komposisi dalam relasi kelas Java.

### ⚠️ Kelemahan Terbesar
* **Wisam (3124600041):** Kurang teliti dalam menata dan mengatur package dan import dalam direktori.
* **Mahda (3124600032):** Terlalu fokus pada misi 1 sehingga misi 2 tertinggal, dan sempat bingung menentukan hubungan komposisi/agregasi di UML.

### 🏆 Skill Baru Paling Berharga
* **Wisam (3124600041):** Menata package dan import file, serta pemahaman yang lebih baik tentang relasi Class Diagram.
* **Mahda (3124600032):** Membuat Class Diagram dari nol dan menulis dokumentasi `README.md` yang baik.

---

## 📂 Struktur Package (com.pcbuilder)