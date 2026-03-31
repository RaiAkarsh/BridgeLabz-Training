package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setup() {
        account = new BankAccount(1000.0);
    }

    @Test
    @DisplayName("Test Deposit Updates Balance Correctly")
    void testDeposit() {
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance());
    }

    @Test
    @DisplayName("Test Withdraw Updates Balance Correctly")
    void testWithdraw() {
        account.withdraw(300.0);
        assertEquals(700.0, account.getBalance());
    }

    @Test
    @DisplayName("Test Withdraw With Insufficient Balance")
    void testWithdrawInsufficientFunds() {
        assertThrows(IllegalArgumentException.class,
                () -> account.withdraw(2000.0));
    }
}
