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
public class TugasC_4 {
    public static void main(String[] args) { 
        Scanner minmax = new Scanner(System.in);
     
        int data;
        int a = 1;
        int min = 100;
        int max = 0;
        double sum=0;
        int avg=0;
                    
        System.out.print("Masukkan banyaknya Nilai : ");
            data = minmax.nextInt();
        
   while (a <= data){
    int bnyk = a + 1;
    int nilai [] = new int[bnyk];
    
        System.out.print("Masukkan Nilai ke-" + a + " : ");
        nilai[a] = minmax.nextInt();
        sum = nilai[a] + sum;
        
        if (nilai[a] > max) {  
            max = nilai[a];
        }
        if ((nilai[a] < min)&& (nilai[a] >= 1)){
            min = nilai[a];
        }
        a++;
        }
   
        avg = (int) (sum / data);
        System.out.println("Total: " + (int)Math.round(sum));
        System.out.println("Rata - Rata : " + avg);
        System.out.println("Nilai Terkecil : " + min);
        System.out.println("Nilai Terbesar : " + max);
    
}}
