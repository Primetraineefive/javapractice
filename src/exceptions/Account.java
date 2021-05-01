package exceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Jay
 */
public class Account {

    public Connection getConn()  {
        String url = "jdbc:msql://localhost:3306/";
        String user = "abc";
        String password = "code";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url,user,password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return connection;
    }

    public void withdraw(int amount) {
        getConn();
        System.out.println("Withdraw :" +amount);
    }


}
