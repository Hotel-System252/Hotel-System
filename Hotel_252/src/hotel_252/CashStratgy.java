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
        double ExtraPercentage = 1.4;  
        double ExtraAmount = totalPrice * ExtraPercentage;
        return (int) Math.ceil(ExtraAmount);
    }
    
}
