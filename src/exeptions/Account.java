package exeptions;

import java.io.IOException;

public class Account extends Throwable {
    private float balance;

    public void deposit(float value) throws IOException {
        if (value <= 0)
            throw new IOException();
    }

    public void withdraw(float value) throws AccountExceptions {
        if (value > balance) {
            AccountExceptions accountExceptions = new AccountExceptions(new InsufficientFundsException());
        }
    }
}