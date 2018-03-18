package ru.bogdanium.hitting_database.kevin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcApp {

    public static final String PASSWORD = "spring";
    public static final String USER = "spring";

    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", USER, PASSWORD);

            String sql = "" +
                    "INSERT INTO rental_location(name, address1, address2, city, state, postal_code)" +
                    " VALUES(?, ?, ?, ?, ?, ?)";

            statement = connection.prepareStatement(sql);

            statement.setString(1, "Gas Station");
            statement.setString(2, "Address1");
            statement.setString(3, "Address2");
            statement.setString(4, "City");
            statement.setString(5, "State");
            statement.setString(6, "PostalCode");

            statement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {

                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (connection != null) {

                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
