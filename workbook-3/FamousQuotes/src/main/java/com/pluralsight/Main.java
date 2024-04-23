package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuoteSelector quoteSelector = new QuoteSelector();
        quoteSelector.selectQuote();
    }
}

class QuoteSelector {
    public void selectQuote() {

        String[] quotes = {
                "Quote 1: Don't watch the clock; do what it does. Keep going. - Sam Levenson",
                "Quote 2:Life is 10% what happens to us and 90% how we react to it. - Charles R. Swindoll",
                "Quote 3: Success is not the key to happiness. Happiness is the key to success. - Albert Schweitzer",
                "Quote 4: The only way to do great work is to love what you do. - Steve Jobs",
                "Quote 5: The best preparation for tomorrow is doing your best today. - H. Jackson Brown Jr",
                "Quote 6: Strive not to be a success, but rather to be of value. - Albert Einstein",
                "Quote 7: The greatest glory in living lies not in never falling, but in rising every time we fall. - Nelson Mandela",
                "Quote 8: In the middle of difficulty lies opportunity. - Albert Einstein",
                "Quote 9: Success is not final, failure is not fatal: It is the courage to continue that counts. - Winston Churchill",
                "Quote 10: It does not matter how slowly you go as long as you do not stop. - Confucius"
        };


        Scanner userInput = new Scanner(System.in);
        boolean continueLoop = true;

        while (continueLoop) {
            try {
                System.out.print("Enter a number between 1 and 10 to display a quote: ");
                int Input = Integer.parseInt(userInput.nextLine());


                if (Input >= 1 && Input <= 10) {

                    System.out.println(quotes[Input - 1]);
                } else {
                    System.out.println("Invalid input. Please enter a number between 1 and 10.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }

            System.out.print("Do you want to see another quote? (yes/no) ");
            String response = userInput.nextLine().toLowerCase();
            continueLoop = response.equals("yes");
        }

        System.out.println("Thank you for using the quote selector!");
        userInput.close();
    }
}

