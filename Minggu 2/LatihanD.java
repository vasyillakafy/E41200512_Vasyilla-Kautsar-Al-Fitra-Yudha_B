/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;

public class d {
    public static void main(String[] args){
    //buat scanner
        Scanner s1 = new Scanner (System.in);
    
    //ambil nilai dari keyboard
        System.out.print("Masukkan Nilai1 = ");
        int Nilai1 = s1.nextInt();
        
        System.out.print("Masukkan Nilai2 = ");
        int Nilai2 = s1.nextInt();
        
    //hitung dan print
        int jumlah = Nilai1 + Nilai2;
        System.out.println("Jumlah = " + jumlah);
        
    }
 }
    
