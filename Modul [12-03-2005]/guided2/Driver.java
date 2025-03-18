/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guided2;

/**
 *
 * @author Khulika Malkan
 */

public class Driver {
        public static void main(String args[]){
        LibraryBook lb = new LibraryBook();
        lb.setTitle("Petualangan Lika");
        lb.setAuthor("KhuLika");
        lb.setisBorrowed(true);
        
        System.out.println("Title: " + lb.getTitle());
        System.out.println("Aouthor: " + lb.getAuthor());   
        System.out.println("Is Borrowed: " + lb.getStatus());
    }    
}
