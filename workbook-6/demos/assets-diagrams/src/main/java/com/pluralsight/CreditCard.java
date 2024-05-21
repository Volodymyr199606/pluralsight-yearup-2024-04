package com.pluralsight;

public class CreditCard implements Valuable {
    private double balance;

    public CreditCard(double balance) {
        this.balance = balance;
    }

    public void charge(double amount) {
        this.balance += amount;
    }

    public void pay(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public double getValue() {
        return -this.balance; // Credit card balance is a liability, so it's subtracted from net worth
    }
}