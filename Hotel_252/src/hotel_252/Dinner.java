/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_252;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nero
 */
public class Dinner extends ExtraServicesDecorator {

    public Dinner(Room room) {
        this.room = room;
    }
    int price;

    @Override
    public int cost() {

        DataBaseConnection dbCon = DataBaseConnection.getconnnection();

        try {
            Statement stmt = dbCon.getCon().createStatement();
            ResultSet result1 = stmt.executeQuery("select Serv_price from extra_services where Serv_name = 'dinner'");
            result1.next();
            price = result1.getInt("Serv_price");
        } catch (SQLException ex) {
            Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
        }
        return price + room.cost();
    }
}
