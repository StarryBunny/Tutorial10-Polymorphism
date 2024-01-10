/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2;

/**
 *
 * @author LIEW
 */
public class FixedAccount implements Interest {
    
    //create instance variable
    public double balance;
    
    //create constructor
    public FixedAccount(double balance){
        this.balance = balance;
    }
    
    //method to compute interest
    public double computeInterest(double balance){
        //interest rate for fixed account is 3% per year
        double interestRate = 0.03;
        return balance * interestRate ;
    } 

    @Override
    public double computeInterest() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
