/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LATIHAN;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class Selection_sort {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    //input data
    System.out.print("Masukkan Jumlah Data : ");
    int jml = scan.nextInt();
    
    //input nilai tiap data
    int[] data = new int[jml];
    System.out.println();
        for(int i = 0; i < jml; i++){
            System.out.print("Input data ke- " + (i+1) + " : ");
            data[i] = scan.nextInt();
        }
        
    //tampilkan data sebelum di sorting
    System.out.println();
    System.out.print("Data sebelum di Sorting : ");
        for(int i =0; i < jml; i++){
            System.out.print(data[i] + "  ");
       }        
    System.out.println(); 
    System.out.println();  
    
    //SELECTION SORT
    System.out.println("Proses Selection Sort");
         for(int i = 0; i < jml-1; i++)
         {
            System.out.println("Iterasi ke-" + (i+1) + " : ");
            for(int j = 0; j < jml; j++)
                System.out.print(data[j]+ "  ");
                        
                System.out.println("  Apakah data " + data[i] + " sudah benar pada urutannya?");
                
                boolean tukar = false;
                int index = 0;
                int min = data[i];
                String pesan = "  Tidak Ada pertukaran";
                     
                    for(int j = i+1; j < jml; j++){
                        if(min > data[j]){
                            tukar = true;
                            index = j;
                            min = data[j];
                }
            }
                if(tukar == true) {
                //tukar data
                pesan = "  Data " + data[i] + " ditukar dengan data " + data[index];
                int temp = data[i];
                data[i] = data[index];
                data[index] = temp;
                }
                
            for (int j = 0; j < jml; j++)
                System.out.print(data[j]+"  ");
            
            System.out.println(pesan + "\n" );
         }       
    //tampilkan data setelah disorting
    System.out.print("Data setelah di Sorting : ");
        for(int i = 0; i < jml; i++){
            System.out.print(data[i]+ "  ");
             }            
         }           
    }

