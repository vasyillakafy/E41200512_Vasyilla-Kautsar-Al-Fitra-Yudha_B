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
public class Binary_search {
    public static int[] data = null;
        public static int awal, tengah, akhir, temp, count;
        public static void main(String[] args){
    
        Scanner scan = new Scanner(System.in);
        
        //input jml data
        System.out.print("Jumlah data : ");
        int jml = scan.nextInt();
        
        //input tiap nilai dan simpan dalam array
        data = new int[jml];
        for(int i = 0; i < data.length; i++){
            System.out.print("Masukkan data ke-" + (i+1) + " = ");
            data[i] = scan.nextInt();
        }
        
        //menampilkan data sebelum di sorting
        System.out.println();
        System.out.print("Data : ");
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i]+ "   ");
        }
        
        //SORTING
        sorting();
        
        //menampilkan data setelah di sorting
        System.out.println();
        System.out.print("Sorting : ");
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + "   ");
        }
        
        //input data yang akan dicari
        System.out.println();
        System.out.print("Data yang dicari : ");
        int cari = scan.nextInt();
        
        //metode binary search
        System.out.println();
        boolean temu = false;
        awal = 0;
        akhir = data.length-1;
        temp = 0;
        count = 0;
        while(temu != true) {
            tengah = (awal + akhir) / 2;
            
            //value = cari
            if(data[tengah] == cari){
               temu = true;
               break;
            }        
            //value < cari
            else if(data[tengah] < cari){
                awal = tengah + 1;
            }
            //value > cari
            else if(data[tengah] > cari){
            }
            
            //cek worst case
            if(temp != data[tengah])
                    temp = data[tengah];
            else
                    count++;
            //batasan untuk worst case
            if(count == 3)
                break;
        }
        
    //output
    if(temu == true)
            System.out.println("Data " + cari + " ditemukan pada index ke-" + tengah);
    else   
            System.out.println("Data " + cari + " tidak ditemukan");    
    }
        
    public static void sorting(){
        int temp = 0;
        for(int i = 0 ; i < data.length; i++){
            for(int j = 0; j < data.length; j++){
                if(i == j)
                continue;
                else {
                        if (data[i] < data[j]){
                            temp = data[j];
                            data[j] = data[i];
                            data[i] = temp;
                        }
                }
            }
        }
    }
}
