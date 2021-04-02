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
public class TugasB_4 {
    public static void main(String[] args) { 
    
        System.out.println("         "+"Do_While");
        System.out.println("Bilangan Kelipatan 2 (1-100)");
        System.out.println("============================");
        //KELIPATAN 2 ADALAH BILANGAN YANG HABIS DI BAGI 2.
           
    int i = 1;
    
    do {
        System.out.print(i*2 + " ");
      i++;
    } while ( i <= 50);
    
    
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("         "+"Do_While");
        System.out.println("============================");
        System.out.println("Bilangan Perpangkatan 2 (1-100)");
        System.out.println("============================");
        // 2^1, 2^2, 2^3. . . 
    
        
     int pangkat = 5;
     int hasil = 1;
     
     for(int n=0; n<=pangkat; n++){
            hasil = hasil * 2;
        
            System.out.println(2 + "^" + n + "=" + hasil);
     }  
    }
    
    }            


