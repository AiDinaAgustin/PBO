/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TgsSesi3;

/**
 *
 * @author ASUS
 */
public class Manusia{
	int nim, nilai;
	String nama;
	
	void setData (int nim, String nama, int nilai){
                this.nim=nim;
		this.nama=nama;
                this.nilai=nilai;
		
	}
	
	void getData (){
		System.out.println("+++++ Data Manusia +++++");
                System.out.println("NIM           : "+nim);
		System.out.println("Nama          : "+nama);
                System.out.println("");
		
	}
}
