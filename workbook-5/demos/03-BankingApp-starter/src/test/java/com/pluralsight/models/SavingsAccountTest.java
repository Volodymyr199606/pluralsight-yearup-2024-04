package com.pluralsight.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SavingsAccountTest
{
    private SavingsAccount account;

    @BeforeEach
    public void setup()
    {
        account = new SavingsAccount(456, "Julian", 5000);
    }

    @Test
    public void canWithdraw_shouldReturnFalse_ifWithdrawalAmount_isTooHigh()
    {
        // arrange
        double withdrawalAmount = 6000;

        // act
        boolean canWithdraw = account.canWithdraw(withdrawalAmount);

        // assert
        assertFalse(canWithdraw, "Because the savings account had a balance of $5000, and I tried to withdraw $6000. $1000 minimum balance limit");
    }

    @Test
    public void canWithdraw_shouldReturnTrue_ifNewBalanceIsAboveMinimumBalance()
    {
        // arrange
        double withdrawalAmount = 4000;

        // act
        boolean canWithdraw = account.canWithdraw(withdrawalAmount);

        // assert
        assertTrue(canWithdraw, "Because the savings account had a balance of $5000, and I tried to withdraw $4000. $1000 minimum balance limit");
    }

    @Test
    public void withdraw_shouldDecreaseBalance_whenWithdrawalAmountValid()
    {
        // arrange
        double withdrawalAmount = 4000;
        double expectedNewBalance = 1000;

        // act
        double actualReturnValue = account.withdraw(withdrawalAmount);

        // assert
        assertEquals(expectedNewBalance, actualReturnValue,"Because the savings account had a balance of $5000, and I tried to withdraw $4000. $1000 minimum balance limit");
    }

}