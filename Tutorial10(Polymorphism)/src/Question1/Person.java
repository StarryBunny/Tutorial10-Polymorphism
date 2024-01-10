/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question1;

/**
 *
 * @author LIEW
 */

//create a class Person implements the ccomparable interface
public class Person implements Comparable <Person>{
    
    //create instance variables
    protected String name;
    
    //create constructor that initializes the name
    public Person (String name){
        this.name = name;
    }
    
    //create accessor method
    public String getName(){
        return name;
    }
    
    //create display method to display the name
    public void displayName (){
        System.out.println("Name: " + this.name);
    }

    /*
        When the current obj "equals" to the specified obj, return 0 (zero)
        When the current obj is "greater than" the specified obj, return 1 (positive)
        WHen the current obj is "less than" the specified obj, return -1 (negative)
    */  
    
    @Override
    public int compareTo(Person o) {
        if (getName().compareTo(o.getName())==0)
            return 0;
        else if (getName().compareTo(o.getName())>0)
            return 1;
        else
            return -1;
            
    }
}
