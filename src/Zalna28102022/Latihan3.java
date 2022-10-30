/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zalna28102022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author DELL
 */
public class Latihan3 {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );   
        int batas, i,max;
        int arr[] = new int[100];
        System.out.println("== Program Menampilkan Nilai Terbesar ==");
        
        try{
            System.out.print("Masukkan batas = ");
            batas = Integer.parseInt(dataIn.readLine());
           
            for(i=1;i<batas+1;i++){
                System.out.print("Masukkan Nilai ke-"+i+" =");
                arr[i] = Integer.parseInt(dataIn.readLine());
            }
            max=arr[1];
            i=1;
            for(i=0;i<max;i++){
                if(arr[i] > max){
                    max= arr[i];
                  }
            }
            System.out.println("Nilai Terbesar = "+max);
        }catch( IOException e ){
        System.out.println("Error!");
        }
        
         
    }
}
