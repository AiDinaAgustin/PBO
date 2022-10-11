/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Mahasiswa21A extends Mahasiswa{
    Mahasiswa21A(String nim, String nama, int nilai){
        super(nim, nama, nilai);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan NIM :");
        String nim = input.nextLine();
        
        System.out.print("Masukan Nama : ");
        String nama = input.nextLine();
        
        System.out.print("Masukan Nilai :");
        int nilai = Integer.parseInt(input.nextLine());
        
        Mahasiswa21A dina = new Mahasiswa21A(nim, nama, nilai);
        
        dina.info();
    }
}
