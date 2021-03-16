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
public class ManagingPeople {
    String name ;
    int age ;
   
//set and get method
    public void set (String name, int age) {
        this.name= name ;
        this.age= age ;
    }
    
    public String getName () {
        return this.name ;
    }
    
    public int getAge () {
        return this.age ;
    }
}

class People {
    
    public static void main (String[]args) {
    person p1 = new person ();
        p1.set ("Arial", 37);
    person p2 = new person ();
        p2.set ("Joseph", 15);   
        
//tampilkan
    if (p1.getAge() != p2.getAge()) {
        System.out.println(p1.getName()+ "Is the same age as " + p2.getName());
    } 
    else {
        System.out.println(p1.getName()+"Is NOT the same age as "+ p2.getName());
    }
  }
}