package com.pluralsight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main
{
    public static void main(String[] args)
    {

        try {
            Connection connection;
            connection =DriverManager.getConnection(
                    "jdbc:mysql:/ / localhost:33o6/northwind",
                    "root",
                    "YUm15510n"
            );
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}