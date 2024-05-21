package com.pluralsight;

public class BankAccount implements Valuable {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public double getValue() {
        return this.balance;
    }
}