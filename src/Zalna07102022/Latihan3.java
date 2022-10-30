/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zalna07102022;

/**
 *
 * @author DELL
 */
import java.io.*;
import java.text.DecimalFormat;
public class Latihan3 {
    public static void main (String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
        DecimalFormat formatdata = new DecimalFormat("#.###"); 
        int pil,JamKerja,GajiLembur,GajiPokok,GajiPerJam = 0,JumlahAnak,JumlahJam,Tunjangan,TunjanganGol;
        double Pajak,GajiKotor = 0,GajiBersih,TahunKerja;
        System.out.println( "1. Golongan 1A\n2. Golongan 2A" );
        System.out.println( "3. Golongan 1B\n4. Golongan 2B\n5. Golongan 3B\n" );
        
        try{
        System.out.print("Masukkan Pilihan Golongan :");
        pil = Integer.parseInt(dataIn.readLine());
      
        switch(pil){
        case 1:
        //input
        System.out.print("Jumlah Jam :");
        JumlahJam = Integer.parseInt(dataIn.readLine());
        System.out.print("Jumlah Anak :");
        JumlahAnak = Integer.parseInt(dataIn.readLine());
   
        //rumus
        if(GajiPerJam >= 160){
            GajiPokok = 500000;
            GajiPerJam = 2000*160;
            GajiLembur = (JumlahJam - 160)*3500;
            
            if(JumlahAnak <=2){
            Tunjangan = JumlahAnak*25000;
            GajiKotor = GajiPokok+GajiPerJam+GajiLembur+Tunjangan;
            
            }else{
                Tunjangan = 0;
                GajiKotor = GajiPokok+GajiPerJam+GajiLembur+Tunjangan;
            }
        Pajak = 0.1 * GajiKotor;
        GajiBersih = GajiKotor - Pajak;
        
        //output
        System.out.println("== Golongan 1A ==");
        System.out.println("Total Gaji = Rp."+formatdata.format(GajiBersih));
        }else{
            System.out.println("\n== Maaf,Jumlah Jam Kerja Anda Tidak Cukup. ==");
        }
        
        break;
        
        case 2:
        //input
        System.out.print("Jumlah Jam :");
        JumlahJam = Integer.parseInt(dataIn.readLine());
        System.out.print("Jumlah Anak :");
        JumlahAnak = Integer.parseInt(dataIn.readLine());
        System.out.print("Jumlah Tahun Kerja :");
        TahunKerja = Integer.parseInt(dataIn.readLine());
        //rumus
        if(GajiPerJam >= 160){
            GajiPokok = 600000;
            GajiPerJam = 3000*160;
            GajiLembur = (JumlahJam - 160)*3500;
            
            if(JumlahAnak <=2){
            Tunjangan = JumlahAnak*25000;
            if(TahunKerja>5){
                TunjanganGol=100000;
                GajiKotor = GajiPokok+GajiPerJam+GajiLembur+Tunjangan+TunjanganGol;
            }else{
                TunjanganGol=0;
                GajiKotor = GajiPokok+GajiPerJam+GajiLembur+Tunjangan+TunjanganGol;
            } 
            }else{
            Tunjangan = 0;
            if(TahunKerja>5){
                TunjanganGol=100000;
                GajiKotor = GajiPokok+GajiPerJam+GajiLembur+Tunjangan+TunjanganGol;
            }else{
                TunjanganGol=0;
                GajiKotor = GajiPokok+GajiPerJam+GajiLembur+Tunjangan+TunjanganGol;
            } }
        Pajak = 0.1 * GajiKotor;
        GajiBersih = GajiKotor - Pajak;
       
        //output
        System.out.println("== Golongan 2A==");
        System.out.println("Total Gaji = Rp."+formatdata.format(GajiBersih));
        }
        break;
        
        case 3:
        //input
        System.out.print("Jumlah Jam :");
        JumlahJam = Integer.parseInt(dataIn.readLine());
        System.out.print("Jumlah Anak :");
        JumlahAnak = Integer.parseInt(dataIn.readLine());
   
        //rumus
        if(GajiPerJam >= 160){
            GajiPokok = 700000;
            GajiPerJam = 4000*160;
            GajiLembur = (JumlahJam - 160)*3500;
            
            if(JumlahAnak <=2){
            Tunjangan = JumlahAnak*25000;
            GajiKotor = GajiPokok+GajiPerJam+GajiLembur+Tunjangan;
            
            }else{
                Tunjangan = 0;
                GajiKotor = GajiPokok+GajiPerJam+GajiLembur+Tunjangan;
            }
        Pajak = 0.1 * GajiKotor;
        GajiBersih = GajiKotor - Pajak;
        
        //output
        System.out.println("== Golongan 1B ==");
        System.out.println("Total Gaji = Rp."+formatdata.format(GajiBersih));
        }else{
            System.out.println("\n== Maaf,Jumlah Jam Kerja Anda Tidak Cukup. ==");
        }
        break;
        
        case 4:
        //input
        System.out.print("Jumlah Jam :");
        JumlahJam = Integer.parseInt(dataIn.readLine());
        System.out.print("Jumlah Anak :");
        JumlahAnak = Integer.parseInt(dataIn.readLine());
        System.out.print("Jumlah Tahun Kerja :");
        TahunKerja = Integer.parseInt(dataIn.readLine());
        if(GajiPerJam >= 160){
            GajiPokok = 800000;
            GajiPerJam = 5000*160;
            GajiLembur = (JumlahJam - 160)*3500;
            
            if(JumlahAnak <=2){
            Tunjangan = JumlahAnak*25000;
            if(TahunKerja>5){
                TunjanganGol=100000;
                GajiKotor = GajiPokok+GajiPerJam+GajiLembur+Tunjangan+TunjanganGol;
            }else{
                TunjanganGol=0;
                GajiKotor = GajiPokok+GajiPerJam+GajiLembur+Tunjangan+TunjanganGol;
            } 
            }else{
            Tunjangan = 0;
            if(TahunKerja>5){
                TunjanganGol=100000;
                GajiKotor = GajiPokok+GajiPerJam+GajiLembur+Tunjangan+TunjanganGol;
            }else{
                TunjanganGol=0;
                GajiKotor = GajiPokok+GajiPerJam+GajiLembur+Tunjangan+TunjanganGol;
            } }
        Pajak = 0.1 * GajiKotor;
        GajiBersih = GajiKotor - Pajak;
       
        //output
        System.out.println("== Golongan 2B==");
        System.out.println("Total Gaji = Rp."+formatdata.format(GajiBersih));
        }
        break;
        
        case 5:
        //input
        System.out.print("Jumlah Jam :");
        JumlahJam = Integer.parseInt(dataIn.readLine());
        System.out.print("Jumlah Anak :");
        JumlahAnak = Integer.parseInt(dataIn.readLine());
   
        //rumus
        if(GajiPerJam >= 160){
            GajiPokok = 900000;
            GajiPerJam = 6000*160;
            GajiLembur = (JumlahJam - 160)*3500;
            
            if(JumlahAnak <=2){
            Tunjangan = JumlahAnak*25000;
            GajiKotor = GajiPokok+GajiPerJam+GajiLembur+Tunjangan;
            
            }else{
                Tunjangan = 0;
                GajiKotor = GajiPokok+GajiPerJam+GajiLembur+Tunjangan;
            }
        Pajak = 0.1 * GajiKotor;
        GajiBersih = GajiKotor - Pajak;
        
        //output
        System.out.println("== Golongan 3B ==");
        System.out.println("Total Gaji = Rp."+formatdata.format(GajiBersih));
        }else{
            System.out.println("\n== Maaf,Jumlah Jam Kerja Anda Tidak Cukup. ==");
        }
        break;
        default:
        System.out.println("== Maaf, Pilihan Tidak Tersedia. == ");
        
        }
        }catch( IOException e ){
        System.out.println("Error!");
        }
  }
 }

