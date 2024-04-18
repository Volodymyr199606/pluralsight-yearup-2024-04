package com.pluralsight;

import java.util.Scanner;

public class WhileLoop
{
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args)
    {

        whileLoop();

    }
    public static void whileLoop()
    {
        System.out.print("Do you love java: ? (y/n) " );
        String loveJava = userInput.nextLine().strip();

        int counter = 0;
        while (counter < 5)
        {
            System.out.println("I love Java");
            counter++;
        }

    }


}
