/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistempencuciankendaraan.Controller;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Lenovo GK
 */
public class MenuController {
    
    private ArrayList<Transaksi> daftarTransaksi;
    private MenuView view;
    private Scanner input = new Scanner(System.in);
    
    public MenuController(MenuView view){
        this.view = view;
        this.daftarTransaksi = new ArrayList<>();
    }
    public void jalankanProgram(){
        
        int pilihan;
        
        do{
            view.tampilkanMenu();
            pilihan = view.inputMenu();
            
            switch (pilihan){
                case 1:
                    tambahData();
                    break;
                    
                case 2:
                    tampilkanData();
                    break;
                
                case 3:
                    ubahData();
                    break;
                    
                case 4:
                    hapusData();
                    break;
                    
                case 5:
System.out.println("Program Selesai");
                    break;
                    
                default:
                    
System.out.println("Pilihan Menu Tidak Tersedia");
                
            }
        }while (pilihan !=5);
    }
public void tambahData(){
        
    System.out.println("\n=== Tambah Data Pencucian ===");

    String idTransaksi;

    while (true){
        System.out.print("ID Transaksi : ");
        idTransaksi = input.nextLine();

        if (idTransaksi.isEmpty()){
            System.out.println("ID Transaksi Tidak Boleh Kosong!");
            continue;
        }
        boolean sudahAda = false;

        for (Transaksi transaksi : daftarTransaksi){
            if (transaksi.getIdTransaksi().equalsIgnoreCase(idTransaksi)) {
                sudahAda = true;
                break;
            }
        }

        if (sudahAda){
            System.out.println("ID Transaksi sudah digunakan!");
        } else {
            break;
        }
    }

    System.out.print("ID Pelanggan: ");
    String idPelanggan = input.nextLine();

    String nama;
    while (true){
        System.out.print("Nama Pelanggan: ");
        nama = input.nextLine();

        if (nama.isEmpty()){
            System.out.println("Nama Pelanggan Tidak Boleh Kosong!");
        } else {
            break;
        }
    }

    String noTelepon;
    while (true){
        System.out.print("Nomor Telepon: ");
        noTelepon = input.nextLine();

        if (noTelepon.isEmpty()){
            System.out.println("Nomor Telepon Tidak Boleh Kosong!");
        } else {
            break;
        }
    }

    System.out.print("Nomor Plat: ");
    String noPlat = input.nextLine();

    System.out.print("Merk Kendaraan: ");
    String merk = input.nextLine();

    System.out.print("Warna Kendaraan: ");
    String warna = input.nextLine();

    System.out.println("\nJenis Kendaraan: ");
    System.out.println("1. Mobil");
    System.out.println("2. Motor");

    int detailKendaraan;
    Kendaraan kendaraan = null;

    while (true){

        System.out.println("pilih: ");

        if (!input.hasNextInt()){
            System.out.println("Input Harus Berupa Angka");
            input.nextLine();
            continue;
        }
        detailKendaraan = input.nextInt();
        input.nextLine();

        if (detailKendaraan == 1){
            int jumlahRoda;

            while (true){
                System.out.print("Jumlah Roda: ");

                if (input.hasNextInt()){
                    jumlahRoda = input.nextInt();
                    input.nextLine();
                    break;
                }else{
                    System.out.println("Jumlah pintu harus berupa angka");
                    input.nextLine();
                }
            }
            kendaraan = new Mobil(noPlat, merk, warna, jumlahRoda);
            break;

        }else if (detailKendaraan == 2){
            int cc;

            while (true){
                System.out.print("cc : ");

                if (input.hasNextInt()){
                    cc = input.nextInt();
                    input.nextLine();
                    break;
                }else{
                    System.out.println("cc harus berupa angka");
                    input.nextLine();
                }
            }
            kendaraan = new Motor(noPlat, merk, warna, cc);
            break;
        
        }else{
            System.out.println("Pilihan Layanan Tidak Valid! pilih 1-2.");
        }
    }
    System.out.println("\nPilih Layanan: ");
    System.out.println("1. Cuci Reguler Motor - Rp20000");
    System.out.println("2. Cuci Reguler Mobil - Rp50000");
    System.out.println("3. Cuci Premium Motor - Rp35000");
    System.out.println("4. Cuci Premium Mobil - Rp75000");

    Layanan layanan;

    while (true){

        System.out.println("Pilihan Layanan: ");

        if (!input.hasNextInt()){
            System.out.println("Input Harus Berupa Angka");
            input.nextLine();
            continue;
        }

        int pilihanLayanan = input.nextInt();
        input.nextLine();

        if (pilihanLayanan == 1){
        layanan = new Layanan("LY001", "Cuci Reguler Motor", 20000);
            break;

        }else if (pilihanLayanan == 2){
            layanan = new Layanan("LY002", "Cuci Reguler Mobil", 50000);
            break;

        }else if (pilihanLayanan == 3){
            layanan =new Layanan("LY003", "Cuci Premium Motor", 35000);
            break;

        }else if (pilihanLayanan == 4){
            layanan =new Layanan("LY004", "Cuci Premium Mobil", 75000);
            break;

        }else{
            System.out.println("Pilihan Layanan Tidak Valid! pilih 1-4.");
        }
    }
    Pelanggan pelanggan = new Pelanggan(idPelanggan, nama, noTelepon);
    Transaksi transaksi = new Transaksi(idTransaksi, pelanggan, kendaraan, layanan);

    daftarTransaksi.add(transaksi);

    System.out.println("\nData Pencucian Berhasil Ditambahkan!");
}
