/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2;

/**
 *
 * @author LIEW
 */
public class SavingAccount implements Interest{

    //create instance variables
    private double balance;
    
    //create constructor
    public SavingAccount (double balance){
        this.balance = balance;
    }
    
    //method to compute interest
    public double computeInterest(double balance) {
        double interestRate = 0.005;
        return balance * interestRate;
    }

    @Override
    public double computeInterest() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
