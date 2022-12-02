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
public class bukualamat {
    private String name;
    private String address;
    private String email;
    private String no;
    
    public void setName(String name){
        this.name = name;
    }
    public void setAddress (String address){
        this.address = address;
    }
    public void setEmail (String email){
        this.email = email;
    }
    public void setNo (String no){
        this.no = no;
    }
    
////////////////////////////////////////////////////////////////////////////////    
    
    public bukualamat(){
    }
    
    
    public bukualamat(String name, String address,String email, String no){
        this.name = name;
        this.address = address;
        this.email = email;
        this.no = no;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    
    public String getNo(){
        return no;
    }
    
    public String getEmail(){
        return email;
    }
    
    
}
