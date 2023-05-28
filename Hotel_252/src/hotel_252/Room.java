/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_252;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Nero
 */
public class Room {

    private int Room_No;
    private String Room_Type;
    private int price;
    private int numberOfNights;
    private Date checkIn;
    private Date tempCheckIn;
    private boolean check;
    private ArrayList books;

    public Room(int Room_No, String Room_Type, int price, int numberOfNights, Date checkIn, ArrayList books) {
        this.Room_No = Room_No;
        this.Room_Type = Room_Type;
        this.price = price;
        this.books = books;
        this.numberOfNights = numberOfNights;
        this.checkIn = checkIn;
        this.tempCheckIn = checkIn;
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
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        ArrayList x;
        for (int i = 0; i < books.size(); i++) {
            x = (ArrayList) this.books.get(i);
            checkIn = tempCheckIn;

            for (int j = 0; j < numberOfNights; j++) {
                if (checkIn.compareTo((Date) x.get(4)) == 0) {
                    check = true;
                    break;
                    
                } else {

                    checkIn = convertToDateViaSqlDate((convertToLocalDateTimeViaSqlTimestamp(checkIn).plusDays(1)).toLocalDate());

                }

            }
        }
        return !check;
        
    }

    public LocalDateTime convertToLocalDateTimeViaSqlTimestamp(Date dateToConvert) {
        return new java.sql.Timestamp(
                dateToConvert.getTime()).toLocalDateTime();
    }

    public Date convertToDateViaSqlDate(LocalDate dateToConvert) {
        return java.sql.Date.valueOf(dateToConvert);
    }
}
