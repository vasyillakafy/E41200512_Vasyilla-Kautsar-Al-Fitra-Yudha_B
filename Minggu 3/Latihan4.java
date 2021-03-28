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
public class Latihan4 {
    public static void main(String[] args){
    int Nilai;
    String Grade;
    Scanner scan = new Scanner (System.in);
    //mengambil input
    System.out.print("Inputkan Nilai : ");
    Nilai = scan.nextInt();
    
    //hitung grade
    if (Nilai>=90) {
        Grade = "Nilai A";   
    } else if (Nilai>=80) {
        Grade = ("Nilai B");
    } else if (Nilai>=70) {
        Grade = ("Nilai C");
    } else if (Nilai>=60) {
        Grade = ("Nilai D");
    }  else  {Grade = ("Nilai E");
    }
    System.out.println("Grade: " + Grade );
    System.out.print("    ");
}
}