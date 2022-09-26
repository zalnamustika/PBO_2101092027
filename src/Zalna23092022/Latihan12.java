/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zalna23092022;

/**
 *
 * @author DELL
 */
public class Latihan12 {
    public static void main (String[] arg){
        int number1 = 10;
        int number2 = 23;
        int number3 = 5;
        int status;
        
        System.out.println("number 1 = " + number1);
        System.out.println("number 2 = " + number2);
        System.out.println("number 3 = " + number3);
        
        status = (number1 >=number2 )?number1:number2;
        status = (number3 >=status )?number3:status;
        System.out.println("Nilai tertingginya adalah angka = " + status);
    }
}
