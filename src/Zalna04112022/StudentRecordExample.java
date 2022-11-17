/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zalna04112022;

/**
 *
 * @author DELL
 */
public class StudentRecordExample {
    public static void main (String[] args){
     StudentRecord student1 = new StudentRecord();
     //
     student1.setName("Ani");
     student1.setAddress("Padang");
     student1.setAge(20);
     student1.setMathGrade(70);
     student1.setEnglishGrade(80);
     student1.setScienceGrade(90);
     //
        System.out.println("Nama            :"+student1.getName());
        System.out.println("Alamat          :"+student1.getAddress());
        System.out.println("Umur            :"+student1.getAge());
        System.out.println("Matematika      :"+student1.getMathGrade());
        System.out.println("Bahasa Inggris  :"+student1.getEnglishGrade());
        System.out.println("Pengetahuan     :"+student1.getScienceGrade());
        System.out.println("Rata -Rata      :"+student1.getAverage());
        System.out.println("Nilai Tebesar   :"+student1.getMax());
    }
}
