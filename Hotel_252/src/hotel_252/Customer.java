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
public class Customer {

    int ID;
    String Name;
    int Age;
    int Phone;

    public Customer(int ID, String Name, int Age, int Phone) {
        this.ID = ID;
        this.Name = Name;
        this.Age = Age;
        this.Phone = Phone;

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;
    }

}
