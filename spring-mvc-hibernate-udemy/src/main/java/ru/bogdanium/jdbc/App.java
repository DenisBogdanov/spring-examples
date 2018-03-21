package ru.bogdanium.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {

        String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
        String user = "hbstudent";
        String password = "hbstudent";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
            System.out.println("Connection successful");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
