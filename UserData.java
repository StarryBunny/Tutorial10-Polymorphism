/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fop.assignment;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class UserData {
    public static void main(String[] args) {
        
        Scanner k = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String email = k.nextLine();

        System.out.print("Enter your username: ");
        String username = k.nextLine();

        System.out.print("Enter your password: ");
        String password = k.nextLine();

        User newUser = new User(email, username, password);

        newUser.saveUser();  //save user details to a TXT file in saveUser in User.java

        k.close();  //close the scanner
        
    }
}
