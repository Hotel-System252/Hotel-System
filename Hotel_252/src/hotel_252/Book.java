/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_252;

import java.util.*;
<<<<<<< Updated upstream
public abstract class Book {

    int Room_No;
    int Room_Price;
    int Book_ID;
    int Customer_ID;
    int Payment_ID;
    int Night_No;
    Date Check_In;
    Date Check_Out;
    int price;
    int b;
    int g;
    int d;
    int v;
    
    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public Book() {
    }
    public int getRoom_Price() {
        return Room_Price;
    }

    public void setRoom_Price(int Room_Price) {
        this.Room_Price = Room_Price;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
=======

public class Book {

    private int Room_No;
    private int Book_ID;
    private int Customer_ID;
    private int Payment_ID;
    private int Night_No;
    private Date Check_In;
    private Date Check_Out;
    private int totalPrice;
    private boolean breakFast;
    private  boolean gym;
    private boolean dinner;
    private boolean vallet;
    private String type;
    
    public void totalPrice() {
        if (type.equalsIgnoreCase("singel")) {
            Room r = new SingelRoomType();
            if (breakFast) {
                r = new BreakFast(r);
            }
            if (gym) {
                r = new Gym(r);
            }
            if (dinner) {
                r = new Dinner(r);
            }
            if (vallet) {
                r = new Valet(r);
            }
            totalPrice = r.cost();
        } else if (type.equalsIgnoreCase("double")) {
            Room r = new SingelRoomType();
            if (breakFast) {
                r = new BreakFast(r);
            }
            if (gym) {
                r = new Gym(r);
            }
            if (dinner) {
                r = new Dinner(r);
            }
            if (vallet) {
                r = new Valet(r);
            }
            totalPrice = r.cost();
        }
    }

    public Book() {
>>>>>>> Stashed changes
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isBreakFast() {
        return breakFast;
    }

    public void setBreakFast(boolean breakFast) {
        this.breakFast = breakFast;
    }

    public boolean isGym() {
        return gym;
    }

    public void setGym(boolean gym) {
        this.gym = gym;
    }

    public boolean isDinner() {
        return dinner;
    }

    public void setDinner(boolean dinner) {
        this.dinner = dinner;
    }

    public boolean isVallet() {
        return vallet;
    }

    public void setVallet(boolean vallet) {
        this.vallet = vallet;
    }


    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }



    public int getRoom_No() {
        return Room_No;
    }

    public void setRoom_No(int Room_No) {
        this.Room_No = Room_No;
    }

    public int getBook_ID() {
        return Book_ID;
    }

    public void setBook_ID(int Book_ID) {
        this.Book_ID = Book_ID;
    }

    public int getCustomer_ID() {
        return Customer_ID;
    }

    public void setCustomer_ID(int Customer_ID) {
        this.Customer_ID = Customer_ID;
    }

    public int getPayment_ID() {
        return Payment_ID;
    }

    public void setPayment_ID(int Payment_ID) {
        this.Payment_ID = Payment_ID;
    }

    public int getNight_No() {
        return Night_No;
    }

    public void setNight_No(int Night_No) {
        this.Night_No = Night_No;
    }

    public Date getCheck_In() {
        return Check_In;
    }

    public void setCheck_In(Date Check_In) {
        this.Check_In = Check_In;
    }

    public Date getCheck_Out() {
        return Check_Out;
    }

    public void setCheck_Out(Date Check_Out) {
        this.Check_Out = Check_Out;
    }

}
