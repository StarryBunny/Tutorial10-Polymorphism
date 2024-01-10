/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question3;

/**
 *
 * @author LIEW
 */
public class Tester {
    
    public static void main(String[] args) {
        
        //create instances of diff discount policies
        DiscountPolicy bulkDiscount = new BulkDiscount (5, 16);
        DiscountPolicy otherDiscount = new OtherDiscount ();
        DiscountPolicy combineDiscount = new CombineDiscount(bulkDiscount, otherDiscount);
        
        double cost = 22.5;
        int itemCount = 6;
        
        System.out.println("Bulk Discount: RM" + bulkDiscount.computeDiscount(itemCount, cost));
        System.out.println("Other Discount: RM " + otherDiscount.computeDiscount(itemCount, cost));
        System.out.println("Combine Discount: RM " + combineDiscount.computeDiscount(itemCount, cost));
    }
}
