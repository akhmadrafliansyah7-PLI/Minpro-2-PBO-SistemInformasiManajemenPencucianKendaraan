/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistempencuciankendaraan.Model;

import sistempencuciankendaraan.Model.Kendaraan;
/**
 *
 * @author Lenovo GK
 */
public class Mobil extends Kendaraan{
    
    private int jumlahRoda;
    
    public Mobil(String noPlat, String merk, String warna, int jumlahRoda){
        super(noPlat, merk, warna);
        this.jumlahRoda = jumlahRoda;
    }
    @Override
    public String getDetailKendaraan(){
        return "Mobil - " + jumlahRoda + " Roda";
    }
    public int getJumlahRoda(){
        return jumlahRoda;
    }
    public void setJumlahRoda(int jumlahRoda) {
        this.jumlahRoda = jumlahRoda;
    }
}
