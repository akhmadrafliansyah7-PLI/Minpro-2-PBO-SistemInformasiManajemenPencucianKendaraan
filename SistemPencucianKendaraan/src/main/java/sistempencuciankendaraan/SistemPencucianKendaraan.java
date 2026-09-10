/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistempencuciankendaraan;

/**
 *
 * @author Lenovo GK
 */

import java.util.ArrayList;
import java.util.Scanner;

public class SistemPencucianKendaraan {
    
    static ArrayList<Transaksi> daftarTransaksi = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    
    static void tambahData(){
        
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
                System.out.println("ID Transaksi Tidak Boleh Kosong!");
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
        
        System.out.print("Jenis Kendaraan: ");
        String jenisKendaraan = input.nextLine();
        
        System.out.print("Merk Kendaraan: ");
        String merk = input.nextLine();
        
        System.out.println("\nPilih Layanan: ");
        System.out.println("1. Cuci Reguler - Rp50000");
        System.out.println("2. Cuci Premium - Rp75000");
        System.out.println("3. Cuci + vacum - Rp90000");
        
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
            layanan = new Layanan("LY001", "Cuci Reguler", 50000);
                break;
            
            }else if (pilihanLayanan == 2){
                layanan = new Layanan("LY002", "Cuci Premium", 75000);
                break;
            
            }else if (pilihanLayanan == 3){
                layanan =new Layanan("LY003", "Cuci + Vacum", 90000);
                break;
            
            }else{
                System.out.println("Pilihan Layanan Tidak Valid! pilih 1-3.");
            }
        }
        Pelanggan pelanggan = new Pelanggan(idPelanggan, nama, noTelepon);
        Kendaraan kendaraan = new Kendaraan(noPlat, jenisKendaraan, merk);
        Transaksi transaksi = new Transaksi(idTransaksi, pelanggan, kendaraan, layanan);
        
        daftarTransaksi.add(transaksi);
        
        System.out.println("\nData Pencucian Berhasil Ditambahkan!");
    }
    static void tampilkanData(){
        
        System.out.println("\n=== Data Pencucian Kendaraan ===");
        
        if(daftarTransaksi.isEmpty()){
            System.out.println("Belum Ada Data Pencucian");
        }else {
            
            for (Transaksi transaksi : daftarTransaksi){
                transaksi.tampilkanData();
                
    System.out.println("---------------------------------");
            }
        }
    }
    static void ubahData(){
        
        System.out.println("\n=== Ubah Data Pencucian ===");
        
        System.out.println("Masukan ID Transaksi: ");
        String idTransaksi = input.nextLine();
        
        for (Transaksi transaksi : daftarTransaksi){
            
            if(transaksi.getIdTransaksi().equals(idTransaksi)) {
                
                            System.out.print("Nama Pelanggan Baru: ");
                            String nama = input.nextLine();
                            
                            System.out.print("Nomor Telepon Baru: ");
                            String noTelepon = input.nextLine();
                            
    transaksi.getPelanggan().setNama(nama);
    transaksi.getPelanggan().setNoTelepon(noTelepon);
                            
                            System.out.print("Jenis Kendaraan Baru: ");
                            String jenisKendaraan = input.nextLine();
                            
                            System.out.print("Merk Kendaraan Baru: ");
                            String merk = input.nextLine();
                            
    transaksi.getKendaraan().setJenisKendaraan(jenisKendaraan);
    transaksi.getKendaraan().setMerk(merk);
        
                            System.out.print("\nData Berhasil Diubah");
                            return;
            }
        }
        System.out.println("ID Transaksi Tidak Ditemukan.");
    }
    static void hapusData(){
        
        System.out.println("\n=== Hapus Data Pencucian ===");
        
        System.out.println("Masukan ID Transaksi");
        String idTransaksi = input.nextLine();
        
        for (int i = 0; i < daftarTransaksi.size(); i++){
            
            if(daftarTransaksi.get(i).getIdTransaksi().equals(idTransaksi)) {
                
                daftarTransaksi.remove(i);
                System.out.print("\nData Berhasil Dihapus");
                return;
            }
        }
        System.out.println("ID Transaksi Tidak Ditemukan.");
    }
                
        
    public static void main(String[] args){
        
        int pilihan;
        
        do{

System.out.println("\n=================================");
            System.out.println("Sistem Pencucian Kendaraan");
System.out.println("=================================");
            System.out.println("1. Tambah Data Pencucian");
            System.out.println("2. Tampilkan Data Pencucian");
            System.out.println("3. Ubah Data Pencucian");
            System.out.println("4. Hapus Data Pencucian");
            System.out.println("5. Keluar");
            
System.out.println("=================================");
            System.out.print("pilih menu: ");
            
            pilihan = input.nextInt();
            input.nextLine();
            
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
}
