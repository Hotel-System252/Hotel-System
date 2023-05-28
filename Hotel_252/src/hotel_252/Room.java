/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_252;

import java.util.ArrayList;

/**
 *
 * @author Nero
 */
public class Room {

    private int Room_No;
    private String Room_Type;
    private int price;
    private boolean check;
    private ArrayList books;

    public Room(int Room_No, String Room_Type, int price, ArrayList books) {
        this.Room_No = Room_No;
        this.Room_Type = Room_Type;
        this.price = price;
        this.books = books;
    }

    public int getRoom_No() {
        return Room_No;
    }

    public void setRoom_No(int Room_No) {
        this.Room_No = Room_No;
    }

    public String getRoom_Type() {
        return Room_Type;
    }

    public void setRoom_Type(String Room_Type) {
        this.Room_Type = Room_Type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public ArrayList getBooks() {
        return books;
    }

    public void setBooks(ArrayList books) {
        this.books = books;
    }

    public boolean checkAvailable() {

        return false;
    }
}
