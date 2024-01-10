/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question1;

import java.util.Arrays;

/**
 *
 * @author LIEW
 */
public class Tester {
    
    public static void main(String[] args) {
        
        Person [] name = {
        new Person ("Starry"),
        new Person ("Bunny"),
        new Person ("Honey"),
        new Person ("Sweetie"),
        new Person ("Cutie"),
    };
    
    //display unsorted array
    System.out.println("Unsorted Array Name: ");
    for (Person person: name){
        person.displayName();
    }
    
    Arrays.sort(name);
    
    
    //display sorted array in ascending order
    System.out.println("Sorted Array Name (Ascending Order): ");
    for (Person person: name){
        person.displayName();
    }
   
    }
}
