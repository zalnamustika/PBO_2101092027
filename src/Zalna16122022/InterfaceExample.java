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
public class InterfaceExample {
   public static void main(String[] args){
        Relation myInteger = new MyInteger();
        Relation myDouble = new MyDouble();
        boolean hasilInt = myInteger.isGreater(5, 6);
        boolean hasilDbl = myDouble.isEqual(6.4, 2.2);
        System.out.println("Hasil Integer: "+hasilInt);
        System.out.println("Hasil Double : "+hasilDbl);
       
        Relation myline = new Line();
        Line line2 = new Line(6.0, 2.0, 1.0, 2.0);
        Line line1 = new Line(2.0, 3.0, 4.0, 5.0);
        line1.getLength();
        boolean lineA_lineB =  myline.isGreater(line1, line2);
        System.out.println("Line A > Line B "+ lineA_lineB);
        
        System.out.println(line1.getLength());
        System.out.println(line2.getLength());
    } 
}
