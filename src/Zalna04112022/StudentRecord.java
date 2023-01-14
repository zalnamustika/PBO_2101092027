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
public class StudentRecord {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int studentCount;
    private int max;
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress (String address){
        this.address = address;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge (int age){
        this.age = age;
    }
    
    public double getMathGrade(){
        return mathGrade;
    }
    
    public void setMathGrade(int mathGrade){
        this.mathGrade = mathGrade;
    }
    
    public double getEnglishGrade(){
        return englishGrade;
    }
    
    public void setEnglishGrade(int englishGrade){
        this.englishGrade = englishGrade;
    }
    
    public double getScienceGrade(){
        return scienceGrade;
    }
    
    public void setScienceGrade(int scienceGrade){
        this.scienceGrade = scienceGrade;
    }
    
    public double getAverage(){
        average = (mathGrade+englishGrade+scienceGrade)/3;
        return average;
    }
    public double getStudentCount(){
        return studentCount;
    }
    public double getMax(){
        max = (int) ((mathGrade>=englishGrade)?mathGrade:englishGrade);
        max = (int) (( scienceGrade>=max)? scienceGrade:max);
        return max;
    }
} 
