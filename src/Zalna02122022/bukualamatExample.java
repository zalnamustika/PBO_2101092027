/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zalna02122022;


/**
 *
 * @author DELL
 */
public class bukualamatExample {
    public static void main (String[] args){
        
     bukualamat student1 = new bukualamat();
     //
     student1.setName("Ani");
     student1.setAddress("Padang");
     student1.setNo("081240002606");
     student1.setEmail("ani@gmail.com");
     //
     System.out.println("Nama            :"+student1.getName());
     System.out.println("Alamat          :"+student1.getAddress());
     System.out.println("No Telepon      :"+student1.getNo());
     System.out.println("Email           :"+student1.getEmail());
     //
     
     bukualamat student2 = new bukualamat ("Zalna","Jambi","Zalnamustika111@gmail.com","082181522362");
     //
     System.out.println();
     System.out.println("Nama            :"+student2.getName());
     System.out.println("Alamat          :"+student2.getAddress());
     System.out.println("No Telepon      :"+student2.getNo());
     System.out.println("Email           :"+student2.getEmail());
     //
  
        
        
    } 
}
