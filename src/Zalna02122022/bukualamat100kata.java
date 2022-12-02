/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zalna02122022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author DELL
 */
public class bukualamat100kata {
    public static void main(String[] args) {
    {
        EntryBukuAlamat[] dba = new EntryBukuAlamat[100];
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        int pil=0;
        int idx=0;
        
        try{
            while (pil != 5) {
                System.out.println(" \nMenu ");
                System.out.println(" 1. Memasukkan Data ");
                System.out.println(" 2. Menghapus Data ");
                System.out.println(" 3. Menampilkan Data ");
                System.out.println(" 4. Update Data ");
                System.out.print("\n Pilihan Anda [1-4] : ");
                pil = Integer.parseInt(dataIn.readLine());
                switch (pil) {
                    case 1 :
                        EntryBukuAlamat input = new EntryBukuAlamat();
                        System.out.println(" Nama Lengkap    : ");
                        input.setNama(dataIn.readLine());
                        System.out.println(" Alamat Lengkap  : ");
                        input.setAlamat(dataIn.readLine());
                        System.out.println(" Nomor Telepon   : ");
                        input.setNotelp(dataIn.readLine());
                        System.out.println(" Email           : ");
                        input.setEmail(dataIn.readLine());
                        dba[idx] = input;
                        idx++;
                        break;
                        
                    case 2:
                        System.out.print(" Input index data yang akan di hapus :");
                        int del = Integer.parseInt(dataIn.readLine());
                        
                        for (int i=del;i<idx;i++){
                            EntryBukuAlamat temp = dba[i];
                            dba[i] = dba[i+1];
                            dba[i+1]= temp;
                        }
                        idx--;
                        System.out.println(" \nData ke-"+(del+1)+" Berhasil di Delete !");
                        break;
                        
                    case 3:
                        for(int i=0; i<idx; i++)
                        {
                            System.out.println("Data ke-"+ (i+1));
                            System.out.println("Nama Lengkap    :" + dba[i].getNama());
                            System.out.println("Alamat Lengkap  :" + dba[i].getAlamat());
                            System.out.println("Nomor Telepon   :" + dba[i].getNotelp());
                            System.out.println("Email           :" + dba[i].getEmail());
                            System.out.println();
                        }
                        break;
                        
                    case 4:
                        System.out.print("Input index data yang akan di edit [0-]: " + idx);
                        int index = Integer.parseInt(dataIn.readLine());
                        System.out.println("Data Ke ---> " + (index+1));
                        
                        System.out.println("\nSilahkan input data baru");
                        System.out.println("Nama Lengkap    :");
                        dba[index].setNama(dataIn.readLine());
                        System.out.println("Alamat Lengkap  :");
                        dba[index].setAlamat(dataIn.readLine());
                        System.out.println("Nomor Telepon   :");
                        dba[index].setNotelp(dataIn.readLine());
                        System.out.println("Email           :");
                        dba[index].setEmail(dataIn.readLine());
                        
                        System.out.println("Data ke-" + (index+1) + "Sudah Diupdate");
                        break;
                        
                    default:
                        break;
                }
            }
        } catch (IOException | NumberFormatException ex) {

        }
    }
      }
}
