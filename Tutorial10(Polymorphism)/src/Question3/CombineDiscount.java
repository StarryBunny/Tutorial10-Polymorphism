/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question3;

/**
 *
 * @author LIEW
 */
public class CombineDiscount extends DiscountPolicy{

    public DiscountPolicy dp1;
    public DiscountPolicy dp2;
    
    //create constructor 
    public CombineDiscount (DiscountPolicy dp1, DiscountPolicy dp2){
        this.dp1 = dp1;
        this.dp2 = dp2;
    }
    
    @Override
    public double computeDiscount(int count, double itemCost){
        double discount1 = dp1.computeDiscount(count, itemCost);
        double discount2 = dp2.computeDiscount(count, itemCost);
        
        return Math.max(count, itemCost);
    }
    
}
