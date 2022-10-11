/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sesi1;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */

public class TugasDua {
    public static void main(String[] args) {
        //Membuat variabel string untuk menampung input dialog
        String belajar = JOptionPane.showInputDialog(null,"Anda sedang belajar apa ?");
        
        //untuk menampilkan hasil dari input yaitu berupa Message
        JOptionPane.showMessageDialog(null, "Belajar "+belajar+" sangat mudah");
    }
}
