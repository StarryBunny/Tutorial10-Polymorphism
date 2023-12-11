/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fop.assignment;

/**
 *
 * @author User
 */

import java.sql.Connection;
import java.util.logging.Level;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.sql.DriverManager;
public class MySQL {
    
    public static Connection connect() {

        try{
            //1. Register driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2. Create connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/account","root","password");
            return con;
        }catch(ClassNotFoundException ex){
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE,null,ex);
        }catch(SQLException ex){
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE,null,ex);
        }
        return null;
        
    }
}
