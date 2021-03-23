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
public class TugasE {
    public static void main(String[] args) {
     System.out.println("--------------------");
     System.out.println("|    CAFE CERIA    |");
     System.out.println("|   ANEKA MINUMAN  |");
     System.out.println("====================");
     System.out.println("|   SPECIAL MENU:  |");
     System.out.println("|  1. Soft Drinks  |");
     System.out.println("|  2. Mix Juice    |");
     System.out.println("|  3. Nescafe      |");
     System.out.println("|  4. Soda Milk    |");
     System.out.println("|  5. Tea          |");
     System.out.println("--------------------");
     
    String Nama;
    Scanner scan = new Scanner (System.in);
    System.out.print("| Masukkan Nama Pembeli = ");
    Nama = scan.nextLine ();
    System.out.println("|  ");
    
    int pesan;
    Scanner scanner = new Scanner (System.in);
    System.out.print("| Masukkan Nomor Pesanan = ");
    pesan = scan.nextInt();
    
        switch (pesan){
            case 1 :
                System.out.println("| Minuman yang anda pesan adalah SOFT DRINKS");
                break;
            case 2 :
                System.out.println("| Minuman yang anda pesan adalah MIX JUICE");
                break;
            case 3 :
                System.out.println("| Minuman yang anda pesan adalah NESCAFE");
                break;
            case 4 :
                System.out.println("| Minuman yang anda pesan adalah SODA MILK");
                break;
            case 5 :
                System.out.println("| Minuman yang anda pesan adalah TEA");
                break;
            default:
                System.out.println("| PESANAN TIDAK TERSEDIA");
            }
            
    System.out.println("| PESANAN AKAN SEGERA KAMI ANTAR");
    System.out.println("| Terima Kasih " + Nama + " Telah Berkunjung di Cafe Ceria!");


    
    }
}
