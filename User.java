/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fop.assignment;

/**
 *
 * @author User
 */

import java.sql.*;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    
    String email;
    String username;
    String password;
    Date registrationDate;
    int currentPoints;

    public User(String email, String username, String password){
        this.email = email;
        this.username = username;
        this.password = password;
        this.registrationDate = new Date();
        this.currentPoints = 0;
    }

    public String getEmail(){
        return email;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public Date getRegistrationDate(){
        return registrationDate;
    }

    public int getCurrentPoints(){
        return currentPoints;
    }

    public void setCurrentPoints(int currentPoints){
        this.currentPoints = currentPoints;
    }

    public void saveUser(){
        
        /////MySQL/////
        //try-catch allow define a block of code to be tested for exceptions (errors) while it is being executed
        try(Connection con = MySQL.connect()){
            try(PreparedStatement ps = con.prepareStatement("INSERT INTO `user data` (email,username,password) VALUES (?,?,?)")){
                ps.setObject(1, email);
                ps.setObject(2, username);
                ps.setObject(3, password);
                ps.executeUpdate();
                System.out.println("Success");
            }catch(Exception error){
                System.out.println("ps " + error);
            }
        }catch(Exception error){
            System.out.println(error);
        }
        
        /////txt file/////
        try(PrintWriter writer = new PrintWriter(new FileWriter("user_data.txt"))){
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/YY");
            writer.println("Email: " + email);
            writer.println("Username: " + username);
            writer.println("Password: " + password);
            writer.println("Registration Date: " + dateFormat.format(registrationDate));
            writer.println("Current Points: " + currentPoints);
            writer.close();  //if not write this, file only be created but nothing written to it
        }catch(IOException error){
            System.out.println(error);
        }
        
    }
    
}
