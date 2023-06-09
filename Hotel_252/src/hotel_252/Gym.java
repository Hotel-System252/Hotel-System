package hotel_252;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Gym extends ExtraServicesDecorator {

    public Gym(Room room) {
        this.room = room;
    }
    int price;

    @Override
    public int cost() {

        DataBaseConnection dbCon = DataBaseConnection.getconnnection();

        try {
            Statement stmt = dbCon.getCon().createStatement();
            ResultSet result1 = stmt.executeQuery("select Serv_price from extra_services where Serv_name = 'gym'");
            result1.next();
            price = result1.getInt("Serv_price");
        } catch (SQLException ex) {
            Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
        }
        return price + room.cost();
    }
}
