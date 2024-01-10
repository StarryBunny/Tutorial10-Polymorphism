/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2;

/**
 *
 * @author LIEW
 */
public class Tester {
    
    public static void main(String[] args) {
        
        SavingAccount sa = new SavingAccount (6000.00) {};
        FixedAccount fa = new FixedAccount (9000);
        
        System.out.println("Annual Interest Saving Account : RM" + sa.computeInterest(6000.00));
        System.out.println("Annual Interest Fixed Account: RM" + fa.computeInterest(9000.00));
    }
}
