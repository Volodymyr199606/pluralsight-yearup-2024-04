package com.pluralsight;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        loadEmployeesAndDisplay();
    }

    public static void loadEmployeesAndDisplay() {
        File file = new File("Files/employees.csv");

        try (Scanner fileScanner = new Scanner(file)) {
            fileScanner.nextLine(); // Skip header

            while (fileScanner.hasNext()) {
                String line = fileScanner.nextLine();
                String[] columns = line.split("[|]");

                int employeeId = Integer.parseInt(columns[0]);
                String name = columns[1];
                double hoursWorked = Double.parseDouble(columns[2]);
                double payRate = Double.parseDouble(columns[3]);

                Employee employee = new Employee(employeeId, name, hoursWorked, payRate);

                // Display employee information
                System.out.printf("Employee ID: %d, Name: %s, Hours Worked: %.2f, Gross Pay: $%.2f%n",
                        employee.getEmployeeId(), employee.getName(), employee.getHoursWorked(), employee.getGrossPay());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}