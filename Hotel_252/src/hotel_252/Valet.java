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
public class Valet {

    String Valet;
    int Price;

    public Valet(String Valet, int Price) {
        this.Valet = Valet;
        this.Price = Price;

    }

    public String getValet() {
        return Valet;
    }

    public void setValet(String Valet) {
        this.Valet = Valet;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

}
