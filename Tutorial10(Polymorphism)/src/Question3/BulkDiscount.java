/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question3;

/**
 *
 * @author LIEW
 */
public class BulkDiscount extends DiscountPolicy{
    
    //create instance variables
    private double minimum;
    private double discountRate;
    
    //create constructor with 2 parameters
    public BulkDiscount (double minimum, double discountRate){
        this.minimum = minimum;
        this.discountRate = discountRate;
    }
    
    @Override
    public double computeDiscount (int count, double itemCost){
        if (count > minimum)
            return itemCost * discountRate;
        else if (count == minimum)
            return 0;
        else
            return -1;
    }
    
}
