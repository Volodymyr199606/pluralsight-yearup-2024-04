package com.pluralsight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/northwind";
        String user = "root";
        String password = "YUm15510n";
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("What do you want to do?");
            System.out.println("1) Display all products.");
            System.out.println("2) Display all customers.");
            System.out.println("0) Exit.");
            System.out.print("Select an option: ");
            int option = scanner.nextInt();

            if (option == 0) {
                System.out.println("Exiting...");
                break;
            }

            Connection connection = null;
            Statement statement = null;
            ResultSet resultSet = null;

            try {
                connection = DriverManager.getConnection(url, user, password);
                statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

                switch (option) {
                    case 1:
                        displayAllProducts(statement);
                        break;
                    case 2:
                        displayAllCustomers(statement);
                        break;
                    default:
                        System.out.println("Invalid option. Please select 1, 2, or 0.");
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            } finally {
                try {
                    if (resultSet != null) resultSet.close();
                    if (statement != null) statement.close();
                    if (connection != null) connection.close();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        scanner.close();
    }

    private static void displayAllProducts(Statement statement) {
        ResultSet resultSet = null;
        try {
            String query = "SELECT ProductID, ProductName, UnitPrice, UnitsInStock FROM Products";
            resultSet = statement.executeQuery(query);

            // Option 1: Stacked Information
            System.out.println("Option 1: Stacked Information");
            while (resultSet.next()) {
                int productId = resultSet.getInt("ProductID");
                String productName = resultSet.getString("ProductName");
                double unitPrice = resultSet.getDouble("UnitPrice");
                int unitsInStock = resultSet.getInt("UnitsInStock");
                System.out.printf("Product Id: %d, Name: %s, Price: %.2f, Stock: %d\n", productId, productName, unitPrice, unitsInStock);
            }

            // Reset the cursor before re-reading the result set
            resultSet.beforeFirst();

            // Option 2: Rows of Information
            System.out.println("\nOption 2: Rows of Information");

            StringBuilder ids = new StringBuilder("Id(");
            StringBuilder names = new StringBuilder("Name(");
            StringBuilder prices = new StringBuilder("Price(");
            StringBuilder stocks = new StringBuilder("Stock(");

            while (resultSet.next()) {
                ids.append(resultSet.getInt("ProductID")).append(",");
                names.append(resultSet.getString("ProductName")).append(",");
                prices.append(resultSet.getDouble("UnitPrice")).append(",");
                stocks.append(resultSet.getInt("UnitsInStock")).append(",");
            }

            // Remove the trailing commas and close the parentheses
            if (ids.length() > 3) {
                ids.setLength(ids.length() - 1);
                names.setLength(names.length() - 1);
                prices.setLength(prices.length() - 1);
                stocks.setLength(stocks.length() - 1);
            }
            ids.append(")");
            names.append(")");
            prices.append(")");
            stocks.append(")");

            System.out.println(ids);
            System.out.println(names);
            System.out.println(prices);
            System.out.println(stocks);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (resultSet != null) resultSet.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void displayAllCustomers(Statement statement) {
        ResultSet resultSet = null;
        try {
            String query = "SELECT ContactName, CompanyName, City, Country, Phone FROM Customers ORDER BY Country";
            resultSet = statement.executeQuery(query);

            // Display customer information
            System.out.println("Displaying all customers:");
            while (resultSet.next()) {
                String contactName = resultSet.getString("ContactName");
                String companyName = resultSet.getString("CompanyName");
                String city = resultSet.getString("City");
                String country = resultSet.getString("Country");
                String phone = resultSet.getString("Phone");
                System.out.printf("Contact Name: %s, Company Name: %s, City: %s, Country: %s, Phone: %s\n",
                        contactName, companyName, city, country, phone);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (resultSet != null) resultSet.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
