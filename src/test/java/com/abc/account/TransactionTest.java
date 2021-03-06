package com.abc.account;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TransactionTest {

    private static final double DELTA = 1e-15;

    @Test
    public void When_AmountIsPositive_Expect_TransactionIsCreated() {
        Transaction transaction = new Transaction(5.0, TransactionType.CUSTOMER_DEPOSIT);

        assertEquals(5.0, transaction.getAmount(), DELTA);
        assertEquals(TransactionType.CUSTOMER_DEPOSIT, transaction.getType());
        assertNotNull(transaction.getTransactionDate());
    }

    @Test
    public void When_AmountIsNegative_Expect_TransactionIsCreated() {
        Transaction transaction = new Transaction(-20.0, TransactionType.CUSTOMER_WITHDRAWAL);

        assertNotNull(transaction);
        assertEquals(-20.0, transaction.getAmount(), DELTA);
        assertEquals(TransactionType.CUSTOMER_WITHDRAWAL, transaction.getType());
        assertNotNull(transaction.getTransactionDate());
    }
}
