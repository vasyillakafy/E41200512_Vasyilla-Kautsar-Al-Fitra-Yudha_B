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
public class TugasB {
    public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
         System.out.print("Masukkan Banyaknya Angka : ");
         int jumlah = scan.nextInt();
         
    int [] array = new int [jumlah];
        for(int i=0; i < array.length; i++){
        array [i]= (int)(Math.random()*100);
        System.out.print(array[i] + " ");
        }
            
    }
}
