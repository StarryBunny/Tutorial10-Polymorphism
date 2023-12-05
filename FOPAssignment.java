/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fop.assignment;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class FOPAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Yeefong
        System.out.println("Hellow World");
        System.out.println("HI jsajj");
        try {
            PrintWriter merchandiseWriter = new PrintWriter(new FileWriter("MerchandiseOrder.txt"));
            PrintWriter treeWriter = new PrintWriter(new FileWriter("TreePlantOrder.txt"));
            Scanner scanner = new Scanner(System.in);

            String username = ""; // Initialize username variable

            // Greeting the user
            System.out.println("Welcome to the Points Shop!");

            // Asking if the user wants to use points for merchandise
            System.out.print("Do you want to use your points to purchase merchandise? (yes/no): ");
            String response = scanner.nextLine();

            if (response.equalsIgnoreCase("yes")) {
                // Getting user input for merchandise
                System.out.print("Enter username: ");
                username = scanner.nextLine();

                System.out.print("Enter merchandise ID: ");
                String merchandiseID = scanner.nextLine();

                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                System.out.print("Enter delivery address: ");
                String address = scanner.nextLine();

                // Writing merchandise order to the text file
                merchandiseWriter.println(username + " orders " + quantity + " " + merchandiseID + " to " + address);
                merchandiseWriter.close();

                System.out.println("Order placed successfully in MerchandiseOrder.txt.");
            } else {
                System.out.println("No merchandise order placed.");
            }

            // Asking if the user wants to plant a tree
            System.out.print("Do you want to plant a tree? (yes/no): ");
            String treeResponse = scanner.nextLine();

            if (treeResponse.equalsIgnoreCase("yes")) {
                if (username.isEmpty()) {
                    // If username is empty, prompt for username for tree planting
                    System.out.print("Enter username for the tree: ");
                    username = scanner.nextLine();
                }

                System.out.print("Enter the name for the tree: ");
                String treeName = scanner.nextLine();

                // Writing tree planting order to the text file
                treeWriter.println(username + " plants a tree with the name \"" + treeName + "\"");
                treeWriter.close();

                System.out.println("Tree planting order placed successfully in TreePlantOrder.txt.");
                System.out.println("Thanks for shopping!");
            } else {
                System.out.println("No tree planting order placed.");
                System.out.println("Thanks for shopping!");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
