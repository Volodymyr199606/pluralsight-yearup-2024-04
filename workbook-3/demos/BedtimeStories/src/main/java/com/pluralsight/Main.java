package com.pluralsight;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Which story would you like to read?");
        System.out.println("1. Goldilocks");
        System.out.println("2. hansel_and_gretel ");
        System.out.println("3 mary_had_a_little_lamb ");
        System.out.println("Choose here: ");

        // Get user input
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();

        String filePath = "";


        switch (choice) {
            case 1:
                filePath = "files/goldilocks.txt";
                break;
            case 2:
                filePath = "files/hansel_and_gretel.txt";
                break;
            case 3:
                filePath = "files/mary_had_a_little_lamb.txt";
                break;
            default:
                System.out.println("Invalid choice. Exiting program.");
                return;
        }


        File file = new File(filePath);

        try (Scanner fileScanner = new Scanner(file)) {

            while (fileScanner.hasNext()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("File not found: " + ex.getMessage());
        }

    }
}