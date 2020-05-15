package introduction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {

    private Connection connection;
    private static DBManager dbManager;

    public DBManager() throws SQLException {
        this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/introduction?serverTimezone=Europe/Warsaw", "****", "");
    }

    public static DBManager getInstance() throws SQLException {
        if (dbManager == null){
            dbManager = new DBManager();
        }
        return dbManager;
    }

    public Connection getConnection(){
        return connection;
    }


}
