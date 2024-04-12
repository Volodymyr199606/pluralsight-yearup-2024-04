package com.pluralsight;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner userInput = new Scanner(System.in);

        // Variables
        String username;
        float hoursWorked;
        float payRate;
        float grossPay;

        // UserName

        System.out.print("Greetings, enter your name please: ");
        username = userInput.nextLine();

        // Hours worked

        System.out.printf("Hello %s, how many hours did you work this week? ", username);
        hoursWorked = userInput.nextFloat();
        userInput.nextLine();

        // GrossPay

        System.out.println("What is your pay rate hourly? ");
        payRate = userInput.nextFloat();
        grossPay = payRate * hoursWorked;
        System.out.printf("Your gross %s for %.2f hours is $%.2f ",username, hoursWorked, grossPay);


        
    }
}


