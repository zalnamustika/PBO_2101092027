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
public class Latihan6 {
    public static void main( String[] args ){
        String word1="";
        String word2="";
        String word3="";
        
        word1 = JOptionPane.showInputDialog("Enter word 1 ");
        word2 = JOptionPane.showInputDialog("Enter word 2 ");
        word3 = JOptionPane.showInputDialog("Enter word 3 ");
        
        String msg = word1 +" "+ word2 +" "+ word3;

        JOptionPane.showMessageDialog(null, msg);

     } 
}
