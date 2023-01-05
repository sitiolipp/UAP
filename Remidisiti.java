/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package remidisiti;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Remidisiti {
    public static void main(String[] args) {
        //soal nomor 1
        String nim;
        String nama;
        String jurusan;
        String pilih;
        int tahun;
        Scanner masukan = new Scanner(System.in);
        System.out.println("Masukkan NIM : ");
        nim = masukan.nextLine();
        System.out.println("Masukkan Nama : ");
        nama = masukan.nextLine();
        
        //soal nomor 2
        System.out.println("Masukkan NIM = " +nim);
        System.out.println("Masukkan Nama = " +nama);
        
        //soal nomor 3
        String[] arrayke = nim.split("\\.");
            tahun = Integer.parseInt(arrayke[0]); 
            System.out.println("Tahun Ajaran Masuk = " + "20" + tahun + "-20" + (tahun + 1) );
        
        //soal nomor 4
        jurusan = nim.substring(3, 5);
        System.out.println(jurusan);
        if (jurusan.equals("52")) {
            System.out.println("jurusan = S1-Teknologi Informasi");
        } else if (jurusan.equals("51")) {
            System.out.println("prodi = S1-Sistem Informasi");
        } else if (jurusan.equals("31")) {
            System.out.println("prodi = D3-Sistem Informasi");
        } else {
            System.out.println("prodi tidak ada");
        }
        
        //soal nomor 5
            System.out.println("No Urut Masuk = " +   arrayke[2].replaceAll("\\b0+(?!\\b)", ""));
            
        //soal nomor 6
        System.out.print("Apakah Anda Ingin Memasukkan Data Lagi [Ya/Tidak]:");
            pilih = masukan.nextLine(); 
            do{
        }while(pilih.equals("ya") ||  pilih.equals("YA") || pilih.equals("y") );
            System.exit(0);
    }
    
}
