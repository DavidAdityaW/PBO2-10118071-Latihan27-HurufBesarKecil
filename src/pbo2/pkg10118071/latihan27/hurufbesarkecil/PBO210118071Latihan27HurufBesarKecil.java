/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan27.hurufbesarkecil;
// package scanner
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA              : David Aditya Winarto
 * KELAS             : PBO2
 * NIM               : 10118071
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 *                     formatting kalimat menjadi huruf besar dan huruf kecil  
 * 
 */
public class PBO210118071Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // membuat objek dari class scanner
        Scanner input = new Scanner(System.in);
        // variabel untuk menyimpan input dari user
        String kalimat;
        
        System.out.print("Masukkan Kalimat : ");
        kalimat = input.nextLine();
        
        System.out.println("\n=====Hasil Formatting=====");
        //Nilai Yang DImanipulasi Menjadi Kapital dan Kecil
        String UpKalimat = kalimat.toUpperCase();
        String DownKalimat = kalimat.toLowerCase();
        
        //Mencetak Hasil
        System.out.println("Huruf Besar : " + UpKalimat);
        System.out.println("Huruf Kecil : " + DownKalimat);
    }
    
}
