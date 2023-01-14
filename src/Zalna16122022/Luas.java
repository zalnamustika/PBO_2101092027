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
public class Luas implements Relation{
    private int panjang;
    private int lebar;
    
    
    public Luas(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public Luas() {
       
    }

    Luas(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public double getLength(){
        double length = panjang*lebar;
        return length;
    }

   
    public boolean isGreater( Object a, Object b){
        double aL = ((Luas)a).getLength();
        double bL = ((Luas)b).getLength();
        return (aL > bL);
    }
    public boolean isLess( Object a, Object b){
        double aL = ((Luas)a).getLength();
        double bL = ((Luas)b).getLength();
        return (aL < bL);
    }

    @Override
    public boolean isEqual( Object a, Object b){
        double aL = ((Luas)a).getLength();
        double bL = ((Luas)b).getLength();
        return (aL == bL);
    }

    
}
