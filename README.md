# Minpro 2 - Pemrograman Berbasis Objek

## Identitas

Nama  : Akhmad Rafliansyah

NIM   : 2509116045

Prodi : Sistem Informasi 25'B

Tema  : Sistem Informasi Manajemen Pencucian Kendaraan

## Deskripsi Program

Sistem Informasi Manajemen Pencucian Kendaraan merupakan program berbasis Java yang digunakan untuk mengelola data pencucian kendaraan.
Program ini membantu pengguna dalam menambahkan, menampilkan, mengubah, dan menghapus data transaksi pencucian kendaraan. Program dibuat
dengan menerapkan konsep Object-Oriented Programming (OOP) seperti class, object, constructor, encapsulation, serta penggunaan ArrayList 
untuk menyimpan data transaksi selama program berjalan.

## Alur Program

Program dimulai dengan menampilkan menu utama yang berisi beberapa pilihan, yaitu tambah data, tampilkan data, ubah data, hapus data, dan keluar
dari program. Pengguna dapat memilih salah satu menu dengan memasukkan angka sesuai pilihan yang tersedia.

<img width="249" height="173" alt="image" src="https://github.com/user-attachments/assets/debd8380-dfc8-4dec-bca4-225aaff1eae8" />

1. Tambah Data Pencucian
   
   Pada bagian Tambah Data Pencucian, Proses dimulai dengan memilih menu 1. Tambah Data Pencucian, kemudian pengguna menginput ID
   transaksi, ID pelanggan, nama pelanggan, nomor telepon, nomor plat, merek kendaraan, dan warna kendaraan. Selanjutnya pengguna memilih
   jenis kendaraan, yaitu mobil atau motor, kemudian memasukkan jumlah roda kendaraan. Setelah itu, sistem menampilkan pilihan layanan
   pencucian beserta harganya, seperti Cuci Reguler Motor, Cuci Reguler Mobil, Cuci Premium Motor, dan Cuci Premium Mobil. Pengguna
   memilih layanan yang diinginkan, kemudian sistem menyimpan seluruh data tersebut dan menampilkan pesan “Data Pencucian Berhasil
   Ditambahkan!” sebagai tanda bahwa data berhasil disimpan.

   <img width="270" height="595" alt="image" src="https://github.com/user-attachments/assets/d7ab37aa-435b-441f-a2c5-ab16e04498d8" />

2. Tampilkan Data Pencucian
   
   Pada menu **Tampilkan Data Pencucian**, sistem akan memeriksa apakah terdapat data transaksi di dalam `ArrayList`. Jika belum            terdapat data, sistem akan menampilkan informasi bahwa belum ada data pencucian. Jika terdapat data, sistem menggunakan perulangan       untuk mengambil setiap transaksi dan menampilkan informasi transaksi, pelanggan, kendaraan, serta layanan yang dipilih.

   <img width="272" height="627" alt="image" src="https://github.com/user-attachments/assets/1c09b457-8d12-41da-bdd6-e4fd154b8927" />

3. Ubah Data Pencucian
   
   Pada menu **Ubah Data Pencucian** pengguna diminta memasukkan ID transaksi yang ingin diubah. Sistem kemudian mencari ID tersebut di     dalam `ArrayList`. Jika ID ditemukan, pengguna dapat memasukkan data baru untuk nama pelanggan, nomor telepon, nomor plat kendaraan ,    merk kendaraan, warna kendaraan, jenis kendaraan, dan layanan kendaraan. Data tersebut kemudian diperbarui menggunakan setter yang       terdapat pada masing-masing class. Jika ID transaksi tidak ditemukan, sistem akan menampilkan pesan bahwa data tidak ditemukan.

   <img width="271" height="617" alt="image" src="https://github.com/user-attachments/assets/34701ebd-a97f-4d33-b697-7433ccdd7320" />

4. Hapus Data Pencucian
   
   Pada menu **Hapus Data Pencucian**, pengguna memasukkan ID transaksi yang ingin dihapus. Sistem mencari transaksi berdasarkan ID         tersebut. Jika transaksi ditemukan, data akan dihapus dari `ArrayList`. Jika ID tidak ditemukan, sistem akan menampilkan pesan bahwa     data tidak ditemukan.

   
