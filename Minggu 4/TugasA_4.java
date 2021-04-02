/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class TugasA_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner angka = new Scanner(System.in);
        int awal, akhir;
        
        System.out.println("------------------------------");
        System.out.println("| " + "MENAMPILKAN BILANGAN GENAP |");
        System.out.println("------------------------------");
        
        System.out.print("Masukkan Angka Pertama : ");
        awal = angka.nextInt();
        
        System.out.print("Masukkan Angka Terakhir : ");
        akhir = angka.nextInt();
        
        System.out.println("------------------------------");
        System.out.println("JAWAB : ");
        
        for(int i = awal; i < akhir; i ++){
            if (i % 2==0)
        System.out.print(i+ "  ");
        }
        
        System.out.print("");
    }
    
}
