package ru.bogdanium.hitting_database.kevin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SpringDatasourceApp {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        DataSource dataSource = context.getBean("datasource", DataSource.class);

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = dataSource.getConnection();

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
