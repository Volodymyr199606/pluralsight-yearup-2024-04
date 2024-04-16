package com.pluralsight;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)

    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter a name: ");
        String inputName = userInput.nextLine().trim();

        String[] nameParts = inputName.split("\\s+");

        if (nameParts.length < 2 || nameParts.length > 3) {
            System.out.println("Invalid name format. Please enter either 'first last' or 'first middle last'.");
            return;
        }

        System.out.println("First Name: " + nameParts[0]);
        if (nameParts.length == 3) {
            System.out.println("Middle Name: " + nameParts[1]);
        }
        System.out.println("Last Name: " + nameParts[nameParts.length - 1]);
    }



    }
