/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zalna16122022;

/**
 *
 * @author DELL
 */
public class PersegiPajang {
    public static void main(String[] args){
        Relation myLuas =  new Luas();
        Luas P1 = new Luas(6,3);
        Luas P2= new Luas(2,8);
        System.out.println("Line A > Line B "+ myLuas.isGreater(P1, P2));       
 
    }
}
