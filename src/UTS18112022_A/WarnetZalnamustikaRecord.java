/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS18112022_A;

/**
 *
 * @author DELL
 */
public class WarnetZalnamustikaRecord {
    public static void main(String[] args) {
        WarnetZalnamustika pelanggan = new WarnetZalnamustika();
        
        pelanggan.setKode(1);
        pelanggan.setNamaPelanggan("Zalna Mustika");
        pelanggan.setJenisPelanggan(1);
        pelanggan.setTglMasuk(2);
        pelanggan.setJamMasuk(5);
        pelanggan.setJamKeluar(8);
        pelanggan.setLama(2);
        
        pelanggan.Print();
        pelanggan.Pembayaran();
        
        
        
        
    }
}
