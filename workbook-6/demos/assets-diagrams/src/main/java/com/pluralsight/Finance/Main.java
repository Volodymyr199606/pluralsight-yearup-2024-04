package com.pluralsight.Finance;

import com.pluralsight.CreditCard;

public class Main {
    public static void main(String[] args) {
        Portfolio portfolio = new Portfolio("My Portfolio", "John Doe");

        BankAccount bankAccount = new BankAccount(123, "John Doe", 1000);
        portfolio.add(bankAccount);

        CreditCard creditCard = new CreditCard(500);
        portfolio.add(creditCard);

        System.out.println("Total value of the portfolio: " + portfolio.getValue());
    }
}