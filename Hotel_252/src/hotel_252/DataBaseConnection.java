
package hotel_252;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DataBaseConnection {
    // Singielton its only one connection to DB
    private static DataBaseConnection connnection;
    private Connection Con;
    private DataBaseConnection() {
        try {
<<<<<<< Updated upstream
            this.Con=DriverManager.getConnection("jdbc:mariadb://localhost:3306/hotel_252", "root", "2040569");
=======
            this.Con=DriverManager.getConnection("jdbc:mariadb://localhost:3306/hotel_252", "root", "2036023");
>>>>>>> Stashed changes
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static DataBaseConnection getconnnection(){
        if (connnection == null) {
            connnection =new DataBaseConnection();
        }
        return connnection;
    }

    public Connection getCon() {
        return Con;
    }
    
}
