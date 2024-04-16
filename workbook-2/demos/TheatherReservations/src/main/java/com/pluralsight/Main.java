package com.pluralsight;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        // prompt for full name
        System.out.print("Enter your full name: ");
        String fullName = userInput.nextLine();

        // split full name into first and last
        String[] nameParts = fullName.split("\\s+");
        String firstName = nameParts[0];
        String lastName = nameParts[nameParts.length - 1];

        // prompt for the date of show

        System.out.print("Enter the date of show: ");
        String dateOfShow = userInput.nextLine();

        // prompt for the number of tickets needed

        System.out.print("Enter the number of tickets you need: ");
        int numberOfTickets = userInput.nextInt();

        // display confirmation message

        if (numberOfTickets > 1 ){
            System.out.print("s");
        }
        System.out.println(numberOfTickets + " ticket" + (numberOfTickets > 1 ? "s" : "") + " reserved");
        System.out.println("Date: " + dateOfShow);
        System.out.println("Under: " + lastName + " " + firstName);



    }
}