/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PerSesi3;

/**
 *
 * @author ASUS
 */
public class Mobil {
    
    String merk;
    int tahun_pembuatan;
    
    public Mobil(String merk, int tahun_pembuatan){
        this.merk = merk;
        this.tahun_pembuatan = tahun_pembuatan;
    }

     public void setMerk(String merk_mobil){
        merk = merk_mobil;
    }
    
    public void setTahunBuat(int tahun_buat){
        tahun_pembuatan = tahun_buat;
    }

    public String getMerk() {
        return merk;
    }

    public int getTahunBuat() {
        return tahun_pembuatan;
    }
    
    public void infoMobil(){
        System.out.println("Merk : "+getMerk());
        System.out.println("Tahun Pembuatan : "+getTahunBuat());
    }
   
}
