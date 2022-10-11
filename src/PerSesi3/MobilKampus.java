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
public class MobilKampus {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", 2020);
        Mobil mobil2 = new Mobil("Honda", 2022);
        
        /* mobil1.setMerk("Toyota");
        mobil1.setTahunBuat(2020);
        
        mobil2.setMerk("Honda");
        mobil2.setTahunBuat(2022); */
        
        mobil1.infoMobil();
        System.out.println("------------------------------------------------");
        mobil2.infoMobil();
    }
}
