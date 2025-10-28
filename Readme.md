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

## 📂 Struktur Package (com.pcbuilder)