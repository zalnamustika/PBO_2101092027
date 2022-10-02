/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zalna30092022;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
import javax.swing.JOptionPane; 
public class Latihan4 {
    public static void main( String[] args ){
        int angka1=0;
        int angka2=0;
        int jumlah=0;
        
        angka1 = Integer.parseInt(JOptionPane.showInputDialog("Angka 1 = "));
        angka2 = Integer.parseInt(JOptionPane.showInputDialog("Angka 2 = "));
        jumlah = angka1 + angka2;
       
        String msg = "Hasil = " + jumlah;

        JOptionPane.showMessageDialog(null, msg);

     } 
}
