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
public class BreakFast {

    String Breakfast;
    int Price;

    public BreakFast(String BreakFast, int Price) {
        this.Breakfast = BreakFast;
        this.Price = Price;
    }

    public String getBreakfast() {
        return Breakfast;
    }

    public void setBreakfast(String Breakfast) {
        this.Breakfast = Breakfast;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

}
