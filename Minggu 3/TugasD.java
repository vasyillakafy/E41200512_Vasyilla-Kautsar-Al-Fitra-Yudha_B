/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MINGGU_3;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class TugasD {
   
  public static void main(String[] args) {
    //1
    Scanner scan = new Scanner(System.in);
    
    System.out.println("____________________________________________________");
    System.out.println("|             Kharisma Agung Plaza(KAP)            |");
    System.out.println("|              Promo Belanja Berhadiah             |");
    System.out.println("|          Khusus Pembelian 5 Barang Pertama       |");
    System.out.println("|           Dengan Harga Minimum Rp.100.000        |");
    System.out.println("____________________________________________________");
        String Nama;
        System.out.print("|  Nama Pembeli = ");
        Nama = scan.nextLine();
        System.out.println("|  ");
        
    //2    
    int sum  =0 ;
    int harga [] = new int [5];
        System.out.print("|  Harga Barang 1 = ");
        harga [0] = scan.nextInt();
        System.out.print("|  Harga Barang 2 = ");
        harga [1] = scan.nextInt();
        System.out.print("|  Harga Barang 3 = ");
        harga [2] = scan.nextInt();
        System.out.print("|  Harga Barang 4 = ");
        harga [3] = scan.nextInt();
        System.out.print("|  Harga Barang 5 = ");
        harga [4] = scan.nextInt();
        
    for(int i=0; i < harga.length; i++){
        sum = sum + harga[i];}
    
    System.out.println("|  Total Belanjaan " + Nama + " = Rp." + sum);
    System.out.println("|  ");
        
     //3
     String hadiah;
     if (sum >= 300000){
        hadiah = "Tumblr Custom";}
     
        else if (sum >= 250000){
        hadiah = "Mangkuk Cantik";}
     
        else if (sum >= 200000){
        hadiah = "Piring Cantik";}
        
        else if (sum >= 150000){
        hadiah = "Mug Cantik";}
     
        else if (sum >= 100000){
        hadiah = "Gelas Cantik";}
     
        else {hadiah = "Maaf, Anda Tidak Mendapat Hadiah";
        }
     
     System.out.println("|  Selamat...");
     System.out.println("|  Anda Mendapatkan Hadiah 1 buah " + hadiah + "!");
     System.out.println("____________________________________________________");
     System.out.println("|                   TERIMA KASIH                   |");
     System.out.println("|             Anda Sudah Belanja Di KAP            |");
     System.out.println("____________________________________________________");
     
}
  }
    
 

  
   
  
            


