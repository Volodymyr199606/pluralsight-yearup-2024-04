package com.pluralsight.Finance;

import com.pluralsight.Depositable;
import com.pluralsight.Valuable;

public class BankAccount implements Valuable, Depositable
{
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    @Override
    public double getValue() {
        return this.balance;
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }
}