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
public class Latihan4 {
    public static void main (String[] args) throws IOException{
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
        float Uts,Uas,Tugas,NilaiAkhir = 0;
     
        
         try{
            
            //input
            System.out.print("Nilai UTS:");
            Uts = Integer.parseInt(dataIn.readLine());
            System.out.print("Nilai UAS:");
            Uas = Integer.parseInt(dataIn.readLine());
            System.out.print("Nilai Tugas:");
            Tugas = Integer.parseInt(dataIn.readLine());
            //proses
            NilaiAkhir=(Uts+Uas+Tugas)/3;
            //output
            if(NilaiAkhir >=60){
                System.out.println("Nilai Akhir : "+NilaiAkhir+" :).");
            }else{
                System.out.println("Nilai Akhir : "+NilaiAkhir+" :(.");
            }

            }catch( IOException e ){
            System.out.println("Error!");
            }
           
    }
}
