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
public class Motor extends Kendaraan{
    
    private int cc;
    
    public Motor(String noPlat, String merk, String warna, int cc){
        super(noPlat, merk, warna);
        this.cc = cc;
    }
    
    @Override
    public void tampilkanData(){
        super.tampilkanData();
   
System.out.println("Jenis Kendaraan : Motor");

System.out.println("CC : " + cc);
    }
}