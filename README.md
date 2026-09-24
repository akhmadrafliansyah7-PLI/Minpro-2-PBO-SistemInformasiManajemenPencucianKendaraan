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

   <img width="246" height="284" alt="image" src="https://github.com/user-attachments/assets/6719a602-58de-4956-b72f-aebff07182f5" />

5. Keluar dari Program
   
   Setelah setiap proses selesai, program kembali menampilkan menu utama sehingga pengguna dapat memilih proses lainnya. Program akan       terus berjalan selama pengguna belum memilih menu **Keluar**. Ketika pengguna memilih menu keluar, program akan menampilkan pesan        bahwa program selesai dan menghentikan proses.

   <img width="250" height="190" alt="image" src="https://github.com/user-attachments/assets/9305a3db-ca4e-4bd3-9138-36e5f0609500" />

## Encapsulation dan Inheritance

1. Encapsulation
   
   Encapsulation diterapkan dengan membatasi akses langsung terhadap atribut pada class menggunakan access modifier private. Contohnya      pada class Pelanggan, atribut idPelanggan, namaPelanggan, dan noTelepon dibuat private sehingga tidak dapat diakses secara langsung      dari class lain. Untuk mengambil nilai dari atribut tersebut digunakan method getter, seperti getIdPelanggan(), getNamaPelanggan(),      dan getNoTelepon(). Dengan demikian, data pada objek Pelanggan dapat terlindungi dan akses terhadap data dilakukan melalui method        yang telah disediakan.

   <img width="612" height="566" alt="image" src="https://github.com/user-attachments/assets/b4697fbf-8a66-480c-9e6b-feae72dd66ed" />

2. Inheritance

   Inheritance diterapkan dengan menjadikan class Kendaraan sebagai superclass, kemudian class Mobil dan Motor sebagai subclass. Class      Mobil dan Motor menggunakan extends Kendaraan sehingga dapat mewarisi atribut dan method yang terdapat pada class Kendaraan.

   - Mobil

   <img width="348" height="19" alt="image" src="https://github.com/user-attachments/assets/4539d74b-0b4a-4445-a3ac-972e85dbd496" />

   - Motor
  
   <img width="327" height="17" alt="image" src="https://github.com/user-attachments/assets/c180bf23-c7b1-4b11-badc-54ee6863e010" />

## Nilai Tambah

1. Struktur MVC

   Program Sistem Pencucian Kendaraan menerapkan struktur MVC (Model, View, Controller) untuk memisahkan fungsi setiap bagian program.      Bagian Model berisi class yang mengelola data dan objek sistem, seperti Kendaraan, Mobil, Motor, Pelanggan, Layanan, dan Transaksi.      Bagian View berisi MenuView yang digunakan untuk menampilkan menu dan menerima input dari pengguna, sedangkan bagian Controller          berisi MenuController yang mengatur alur dan proses program, seperti menambah dan menampilkan data. Dengan menerapkan MVC, program       menjadi lebih terstruktur dan setiap bagian memiliki fungsi yang jelas.

   <img width="395" height="270" alt="image" src="https://github.com/user-attachments/assets/965ca434-6573-442d-9f2a-9c9c9cc366cc" />

2. Polymorphism - Overriding

   Contoh Pada program ini, polymorphism berupa overriding diterapkan pada method tampilkanData(). Class Mobil meng-override method         tampilkanData() yang berasal dari superclass Kendaraan dengan menggunakan anotasi @Override. Di dalam method                             tersebut,super.tampilkanData() digunakan untuk menampilkan data umum kendaraan, kemudian ditambahkan data khusus seperti jenis           kendaraan dan jumlah roda. Dengan demikian, method yang sama dapat memiliki perilaku yang berbeda sesuai dengan subclass yang            digunakan.

   <img width="438" height="167" alt="image" src="https://github.com/user-attachments/assets/d853c61b-bf70-4fbc-940a-c5538566528e" />
   
