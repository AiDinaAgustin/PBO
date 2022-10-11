/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CobaSesi3;

import java.util.Scanner;


class Test{
	
	public static void main (String[] args){
		
		Scanner inp=new Scanner(System.in);
		Mahasiswa mah=new Mahasiswa();
		String nama,alamat,tlp,jkel;
		System.out.println("++++++ inputan data mahasiswa ++++++");
		System.out.print("nama          : ");
		nama=inp.next();
		System.out.print("alamat        : ");
		alamat=inp.next();
		System.out.print("tlp           : ");
		tlp=inp.next();
		System.out.print("jenis kelamin : ");
		jkel=inp.next();
		System.out.print("NIM           : ");
		mah.nim=inp.next();
		System.out.print("Nilai UTS     : ");
		mah.nuts=inp.nextInt();
		System.out.print("Nilai UAS     : ");
		mah.nuas=inp.nextInt();
		
		
		mah.setData(nama, alamat, tlp, jkel);
		mah.getData();
		mah.getDataMahasiswa();
	}
}
