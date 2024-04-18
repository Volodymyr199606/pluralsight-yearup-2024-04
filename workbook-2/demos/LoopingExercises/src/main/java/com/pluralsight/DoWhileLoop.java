package com.pluralsight;

import java.util.Scanner;

public class DoWhileLoop {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        doWhileLoop();
    }

    public static void doWhileLoop() {
        String playAgain;

        do {
            System.out.println("Welcome to my game again ");
            System.out.println("I love Java");
            System.out.println("I love Java");
            System.out.println("I love Java");
            System.out.println("I love Java");
            System.out.println("I love Java");
            System.out.print("Do you want to play again? (y/n) ");
            playAgain = userInput.nextLine().strip();

        } while(playAgain.equalsIgnoreCase("y"));

        System.out.println();
        System.out.println("Thanks for Playing, Come again ");
    }
}