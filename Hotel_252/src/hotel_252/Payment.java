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
public class Payment {

    private int totalPrice;
    private Extra ExtraStrategy;

    public Payment(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setExtraStrategy(Extra ExtraStrategy) {
        this.ExtraStrategy = ExtraStrategy;
    }

    public int applyExtra() {
        if (ExtraStrategy != null) {
            totalPrice = ExtraStrategy.applyExtra(totalPrice);
        }
        return totalPrice;
    }
}
