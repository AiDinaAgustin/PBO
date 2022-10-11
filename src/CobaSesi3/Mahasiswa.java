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
public class Mahasiswa extends Manusia{
	
	public String nim;
	public int nuts,nuas;
	
	void getDataMahasiswa(){
		System.out.println("+++++ Data Mahasiswa +++++");
		System.out.println("NIM          : "+nim);
		System.out.println("Nilai UTS    : "+nuts);
		System.out.println("Nilai UAS    : "+nuas);
	}
}
