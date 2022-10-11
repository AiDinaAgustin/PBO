/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CobaSesi3;

/**
 *
 * @author ASUS
 */
public class Manusia{
	
	protected String nama,alamat,tlp,jkel;
	
	void setData (String nama, String alamat, String tlp,String jkel){
		this.nama=nama;
		this.alamat=alamat;
		this.tlp=tlp;
		this.jkel=jkel;
	}
	
	void getData (){
		System.out.println("+++++ Data Manusia +++++");
		System.out.println("nama          : "+nama);
		System.out.println("alamat        : "+alamat);
		System.out.println("tlp           : "+tlp);
		System.out.println("jenis kelamin : "+jkel);
	}
}
