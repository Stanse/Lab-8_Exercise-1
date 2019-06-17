package com.mybank.domain;

public class Account {
    
    protected double balance;
    
    protected Account(double initBalance) {
        balance = initBalance;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amt) {
        balance = balance + amt;
        //return true;
    }
    
    public void withdraw(double amt) throws OverdraftException {
        boolean result = false;  // assume operation failure
        if ( amt <= balance ) {
            balance = balance - amt;
            result = true;  // operation succeeds
        } else {
            throw new OverdraftException("Error balance :", amt - balance);
        }
        //return result;
    }
}
