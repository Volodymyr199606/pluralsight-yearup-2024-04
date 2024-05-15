package com.pluralsight.models;

public class SavingsAccount {
    private int accountNumber;
    private String owner;
    private double balance;
    private final double minimumBalance = 1000.0;

    public SavingsAccount(int accountNumber, String owner, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public double withdraw(double amount) {
        if (canWithdraw(amount)) {
            balance -= amount;
            return balance;
        } else {
            return balance;
        }
    }

    public boolean canWithdraw(double amount) {
        return balance - amount >= minimumBalance;
    }
}