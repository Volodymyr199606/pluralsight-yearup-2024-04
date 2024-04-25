package com.pluralsight;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String projectDirectory = System.getProperty("user.dir");
        Path filesFolderPath = Paths.get(projectDirectory, "files");

        System.out.print("Enter the name of the file employee file to process: ");
        String inputFileName = scanner.nextLine();


        Path inputFilePath = filesFolderPath.resolve(inputFileName);

        System.out.print("Enter the name of the payroll file to create: ");
        String outputFileName = scanner.nextLine();


        Path outputFilePath = filesFolderPath.resolve(outputFileName);

        loadEmployeesAndWritePayroll(inputFilePath.toString(), outputFilePath.toString());

        scanner.close();
    }

    public static void loadEmployeesAndWritePayroll(String inputFileName, String outputFileName) {
        File inputFile = new File(inputFileName);
        File outputFile = new File(outputFileName);

        try {
            if (!inputFile.exists()) {
                System.out.println("Error: Input file not found.");
                return;
            }

            Scanner fileScanner = new Scanner(inputFile);
            FileWriter writer = new FileWriter(outputFile);


            fileScanner.nextLine();

            while (fileScanner.hasNext()) {
                String line = fileScanner.nextLine();
                String[] columns = line.split("[|]");

                int employeeId = Integer.parseInt(columns[0]);
                String name = columns[1];
                double hoursWorked = Double.parseDouble(columns[2]);
                double payRate = Double.parseDouble(columns[3]);

                Employee employee = new Employee(employeeId, name, hoursWorked, payRate);


                String payrollEntry = String.format("%d|%s|%.2f%n", employee.getEmployeeId(), employee.getName(), employee.getGrossPay());
                writer.write(payrollEntry);
            }

            System.out.println("Payroll report generated successfully.");

            fileScanner.close();
            writer.close();
        } catch (IOException ex) {
            System.out.println("Error: Unable to create or write to the output file.");
            ex.printStackTrace();
        }
    }
}