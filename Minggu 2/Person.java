/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author Administrator
 */
public class Person {

    public static void main(String[] args) {
        //variable
        String fName, IName, stuStatus ;
        int stuID ;
        
        fName = "Lisa " ;
        IName = "Palombo" ;
        stuID = 123456789 ;
        stuStatus = "Active" ;
        
        //tampilkan
        System.out.println ("Student Name = " + fName + IName);
        System.out.println ("Student ID = " + stuID) ;
        System.out.println ("Student Status = " + stuStatus);
    }
}
    