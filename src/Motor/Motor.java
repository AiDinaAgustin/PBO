/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Motor;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Motor {
    Scanner masuk = new Scanner(System.in);
    Scanner masuk2 = new Scanner(System.in);
    int kecepatan;
    boolean nyala = false;
    String porsenelling;
    
    public void hidupkan(){
        nyala = true;
        System.out.println("Motor Dihidupkan");
    }
    
    public void matikan(){
        nyala = false;
        System.out.println("Motor dalam keadaan mati");
    }
    
    public void tambahKecepatan(){
        if(nyala == false){
            System.out.println("Motor Mati");
        }
        else{
            if(nyala == true){
            kecepatan += 10;
        }
            else{
                System.out.println("motor kecepatan maksimal");
            }
    }
    }
    
    public void kurangiKecepatan(){
        if(nyala == true){
            kecepatan -= 10;
        }
        else{
            System.out.println("Tidak bisa mengurangi kecepatan motor mati");
        }
    }
    
    public void infoKecepatan(){
        if (kecepatan > 1 && kecepatan < 50){
            System.out.println("Kecepatan Rendah");
        }
        else if(kecepatan > 51 && kecepatan < 70){
            System.out.println("Kecepatan sedang");
        }
        else if(kecepatan > 71){
            System.out.println("Kecepatan Tinggi");
        }
        else {
            System.out.println("Motor Mati");
        }
        
        if(nyala == true){
            System.out.print("Motor Menyala");
        }
        else{
            System.out.println("Motor Mati");
        }
        System.out.println(" dengan kecepatan Motor : "+kecepatan);
    }
    
    public void menu(){
        char ulang = 't';
        do {
      System.out.println("lallalalalla");
      System.out.println("============================");
      System.out.println("1. hidup");
      System.out.println("2. mati");
      System.out.println("3. cek");
      System.out.println("4. tambahkece");
      System.out.println("5. kurangkece");
      System.out.println();
       
      System.out.print("Pilihan anda: ");
      int pilihan = masuk.nextInt();
    
      switch(pilihan){
        case 1:
          hidupkan();
          break;
        case 2:
          matikan();
          break;
        case 3:
          infoKecepatan();
          break;
        case 4:
          tambahKecepatan();
          break;
        case 5:
          kurangiKecepatan();
          break;
        default:
          System.out.println("Menu tidak tersedia");
      }
    
      System.out.println();
    
      System.out.print("Ingin memilih menu lain (y/t)? ");
      ulang = masuk2.next().charAt(0);
       
      System.out.println();
    }
    while (ulang != 't');
    
    System.out.println("Terimakasih...");
  
  }
    
public static void main(String[] args) {
        Motor motor1 = new Motor();
        
        motor1.tambahKecepatan();
        motor1.tambahKecepatan();
        
        motor1.hidupkan();
        motor1.tambahKecepatan();
        motor1.tambahKecepatan();
        motor1.kurangiKecepatan();
        motor1.infoKecepatan();
    }
}
