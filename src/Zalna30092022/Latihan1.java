/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zalna30092022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author DELL
 */
public class Latihan1 {
    public static void main( String[] args ){

    BufferedReader dataIn = new BufferedReader(new
    InputStreamReader( System.in) );
    String name = "";
    String addres = "";
    String jurusan = "";
    
    try{
    System.out.print("Please Enter Your Name:");
    name = dataIn.readLine();
    System.out.print("Please Enter Your addres:");
    addres = dataIn.readLine();
    System.out.print("Please Enter Your Major:");
    jurusan = dataIn.readLine();
    }catch( IOException e ){
    System.out.println("Error!");
    }
    System.out.println("Hello " + name +"!"+"\n"+
            "Your Addres :"+addres+"\n"+
            "Your Major :"+jurusan);
 } 
}
