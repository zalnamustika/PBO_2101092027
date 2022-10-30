/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zalna07102022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Latihan5 {
    public static void main (String[] args){
        int pil;
        float Uts,Uas,tugas,nilaiAkhir = 0;
        
        Uts = Integer.parseInt(JOptionPane.showInputDialog("Nilai UTS = "));
        Uas = Integer.parseInt(JOptionPane.showInputDialog("Nilai UAS = "));
        tugas = Integer.parseInt(JOptionPane.showInputDialog("Nilai Tugas = "));
        nilaiAkhir=(Uts+Uas+tugas)/3;
            
        if(nilaiAkhir >=60){
                String msg = "Nilai Akhir = "+ nilaiAkhir +" :).";
                JOptionPane.showMessageDialog(null, msg);
        }else{
                String msg = "Nilai Akhir = "+ nilaiAkhir +" :(.";
                JOptionPane.showMessageDialog(null, msg);
        }
       
    }
}
