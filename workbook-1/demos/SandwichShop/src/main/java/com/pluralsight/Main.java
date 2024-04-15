package com.pluralsight;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sandwichInput = new Scanner(System.in);

        // prompt the user for the size of sandwich

        System.out.print("Greetings, choose size of sandwich (1 or 2): " );
        int sandwichSize= sandwichInput.nextInt();


        // prompt the user for age

        System.out.print("Please enter your age: ");
        int age = sandwichInput.nextInt();

        double discount;

        if (age <=17){
            discount = 0.10;

        }else if (age >=65){
            discount = 0.20;

        }else discount = 0.0;

        // cost of sandwich

        double sandwichPrice;
        if (sandwichSize == 1) {
            sandwichPrice = 5.45;
        } else if (sandwichSize == 2) {
            sandwichPrice = 8.95;
        } else {
            System.out.println("Invalid sandwich size entered.");
            return;
        }

        double finalPrice = sandwichPrice - (sandwichPrice * discount);

        System.out.printf("Final price of the sandwich after discount: $%.2f", finalPrice);
        sandwichInput.close();
        


    }
}