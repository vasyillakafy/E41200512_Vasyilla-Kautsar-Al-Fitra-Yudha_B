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
public class Latihan5 {
    public static void main(String[] args){

        String lampu;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Warna Lampu : ");
        lampu = scan.nextLine();
        
    switch (lampu) {
        case "merah" :
        System.out.println("Lampu merah, berhenti!");
        break;
        case "kuning" :
        System.out.println("Lampu kuning, harap hati-hati!");
        break;
        case "hijau" :
        System.out.println("Lampu hijau, silahkan jalan!");
        break;
        default :
        System.out.println("Input tidak valid.");
        
    }
        
    }
}
