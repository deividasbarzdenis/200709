package com.company.pvz4;

public class Account {
    private int balance = 100;

    public void withdraw(int amount) throws AccountException {
        if (balance - amount >= 0) {
            balance -= amount;
        } else {
            AccountException ex = new AccountException("pinigu nera", balance - amount);
            throw ex;
        }
    }
}
