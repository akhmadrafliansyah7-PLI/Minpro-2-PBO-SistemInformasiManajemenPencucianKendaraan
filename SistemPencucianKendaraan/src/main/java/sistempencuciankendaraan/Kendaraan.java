/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistempencuciankendaraan;

/**
 *
 * @author Lenovo GK
 */
public class Kendaraan {
    private String noPlat;
    private String jenisKendaraan;
    private String merk;
    
    public Kendaraan(String noPlat, String jenisKendaraan, String merk){
        this.noPlat = noPlat;
        this.jenisKendaraan = jenisKendaraan;
        this.merk = merk;
    }
    
    public String getNoPlat(){
        return noPlat;
    }
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }
    public String getJenisKendaraan(){
        return jenisKendaraan;
    }
    public void setJenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }
    public String getMerk(){
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    } 
}
