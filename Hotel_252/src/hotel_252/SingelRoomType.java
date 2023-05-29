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
public class SingelRoomType extends Room {

    int price;

    public int cost() {
        DataBaseConnection dbCon = DataBaseConnection.getconnnection();

        try {
            Statement stmt = dbCon.getCon().createStatement();
            ResultSet result1 = stmt.executeQuery("select price from room_types where type = 'Singel'");
            result1.next();
            price = result1.getInt("price");
        } catch (SQLException ex) {
            Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
        }
        return price;
    }

}
