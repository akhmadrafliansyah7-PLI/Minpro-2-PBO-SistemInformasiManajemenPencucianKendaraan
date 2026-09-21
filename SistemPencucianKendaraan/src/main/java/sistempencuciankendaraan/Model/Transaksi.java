/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistempencuciankendaraan.Model;

import sistempencuciankendaraan.Model.Pelanggan;
import sistempencuciankendaraan.Model.Layanan;
import sistempencuciankendaraan.Model.Kendaraan;

/**
 *
 * @author Lenovo GK
 */
public class Transaksi {
    
    private String idTransaksi;
    private Pelanggan pelanggan;
    private Kendaraan kendaraan;
    private Layanan layanan;
    
    public Transaksi(String idTransaksi, Pelanggan pelanggan, Kendaraan kendaraan, Layanan layanan){
        this.idTransaksi = idTransaksi;
        this.pelanggan = pelanggan;
        this.kendaraan = kendaraan;
        this.layanan = layanan;
    }
    
    public String getIdTransaksi(){
        return idTransaksi;
    }
    public void setIdTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }
    public Pelanggan getPelanggan(){
        return pelanggan;
    }
    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }
    public Kendaraan getKendaraan(){
        return kendaraan;
    }
    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }
    public Layanan getLayanan(){
        return layanan;
    }
    public void setLayanan(Layanan layanan) {
        this.layanan = layanan;
    }
    public void tampilkanData(){
        
        System.out.println("ID Transaksi : " + idTransaksi);
        System.out.println("ID Pelanggan : " + pelanggan.getIdPelanggan());
        System.out.println("Nama Pelanggan : " + pelanggan.getNama());
        System.out.println("No.Telepon : " + pelanggan.getNoTelepon());
        System.out.println("Nomor Plat : " + kendaraan.getNoPlat());
        System.out.println("Detail Kendaraan : " + kendaraan.getDetailKendaraan());
        System.out.println("Merk Kendaraan : " + kendaraan.getMerk());
        System.out.println("Kode Layanan : " + layanan.getKodeLayanan());
        System.out.println("Layanan : " + layanan.getNamaLayanan());
        System.out.println("Harga Rp : " + layanan.getHarga());
    }
}