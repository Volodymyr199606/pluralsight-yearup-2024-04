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
            System.out.println("3) Display all categories.");
            System.out.println("0) Exit.");
            System.out.print("Select an option: ");
            int option = scanner.nextInt();

            if (option == 0) {
                System.out.println("Exiting...");
                break;
            }

            try (Connection connection = DriverManager.getConnection(url, user, password);
                 Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {

                switch (option) {
                    case 1:
                        displayAllProducts(statement);
                        break;
                    case 2:
                        displayAllCustomers(statement);
                        break;
                    case 3:
                        displayAllCategories(statement, scanner);
                        break;
                    default:
                        System.out.println("Invalid option. Please select 1, 2, 3, or 0.");
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }

    private static void displayAllProducts(Statement statement) {
        String query = "SELECT ProductID, ProductName, UnitPrice, UnitsInStock FROM Products";

        try (ResultSet resultSet = statement.executeQuery(query)) {
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
        }
    }

    private static void displayAllCustomers(Statement statement) {
        String query = "SELECT ContactName, CompanyName, City, Country, Phone FROM Customers ORDER BY Country";

        try (ResultSet resultSet = statement.executeQuery(query)) {
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
        }
    }

    private static void displayAllCategories(Statement statement, Scanner scanner) {
        String query = "SELECT CategoryID, CategoryName FROM Categories ORDER BY CategoryID";

        try (ResultSet resultSet = statement.executeQuery(query)) {
            // Display category information
            System.out.println("Displaying all categories:");
            while (resultSet.next()) {
                int categoryId = resultSet.getInt("CategoryID");
                String categoryName = resultSet.getString("CategoryName");
                System.out.printf("Category Id: %d, Category Name: %s\n", categoryId, categoryName);
            }

            System.out.print("Enter a Category Id to display products in that category: ");
            int categoryId = scanner.nextInt();
            displayProductsByCategory(statement, categoryId);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void displayProductsByCategory(Statement statement, int categoryId) {
        String query = String.format("SELECT ProductID, ProductName, UnitPrice, UnitsInStock FROM Products WHERE CategoryID = %d", categoryId);

        try (ResultSet resultSet = statement.executeQuery(query)) {
            // Display product information for the selected category
            System.out.printf("Products in Category Id: %d\n", categoryId);
            while (resultSet.next()) {
                int productId = resultSet.getInt("ProductID");
                String productName = resultSet.getString("ProductName");
                double unitPrice = resultSet.getDouble("UnitPrice");
                int unitsInStock = resultSet.getInt("UnitsInStock");
                System.out.printf("Product Id: %d, Name: %s, Price: %.2f, Stock: %d\n", productId, productName, unitPrice, unitsInStock);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
