/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_252;

import java.util.*;
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
