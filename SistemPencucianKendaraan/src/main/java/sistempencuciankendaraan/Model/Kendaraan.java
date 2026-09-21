/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistempencuciankendaraan.Model;

/**
 *
 * @author Lenovo GK
 */
public class Kendaraan {
    
    private String noPlat;
    private String merk;
    private String warna;
    
    public Kendaraan(String noPlat, String merk, String warna){
        this.noPlat = noPlat;
        this.merk = merk;
        this.warna = warna;
    }
    public String getDetailKendaraan(){
        return "kendaraan";
    }
    public String getNoPlat(){
        return noPlat;
    }
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }
    public String getMerk(){
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    } 
    public String getWarna(){
        return warna;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    } 
}

