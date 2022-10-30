/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zalna07102022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 *
 * @author DELL
 */
public class Latihan6 {
    public static void main (String[] args) throws IOException{
       BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
       DecimalFormat formatdata = new DecimalFormat("#.###"); 
       int bilangan,pangkat,hasil = 0;
       
       
        try{
            
        //input
        System.out.print("Masukkan Bilangan :");
        bilangan = Integer.parseInt(dataIn.readLine());
        System.out.print("Masukkan Pangkat Bilangan :");
        pangkat = Integer.parseInt(dataIn.readLine());
        
        //proses
        int n=1;
        int m=1;
        while(n<=pangkat){
            //pangkat=bilangan*pangkat;
            m=m*bilangan;
            n++; 
        }
        
        System.out.println(bilangan+"^"+pangkat+" Hasil = "+m);
           
        }catch( IOException e ){
            System.out.println("Error!");
         }   
       
    }
}
