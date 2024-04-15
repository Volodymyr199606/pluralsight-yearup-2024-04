package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Enter your first name: ");
        String firstName = userInput.nextLine();

        System.out.print("Enter your middle name (optional): ");
        String middleName = userInput.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = userInput.nextLine();

        System.out.print("Enter your suffix (optional): ");
        String suffix = userInput.nextLine();

        String fullName = firstName + (middleName.isEmpty() ? "" : " " + middleName) + " " + lastName + (suffix.isEmpty() ? "" : ", " + suffix);
        System.out.println("Full Name: " + fullName);

        userInput.close();

    }
}














