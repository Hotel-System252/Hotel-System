/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_252;

/**
 *
 * @author Nero
 */
public class CashStratgy implements Extra{

    @Override
    public int applyExtra(int totalPrice) {
                // Apply KSA discount logic
        double discountPercentage = 1.2; // 20% 
        double discountAmount = totalPrice * discountPercentage;
        return (int) Math.ceil(discountAmount);
    }
    
}
