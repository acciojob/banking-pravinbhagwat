package com.driver;

import java.util.Random;

public class BankAccount {

    private String name;
    private double balance;
    private double minBalance;

    public BankAccount(String name, double balance, double minBalance) {
        this.name = name;
        this.balance = balance;
        this.minBalance = minBalance;
    }

    public String generateAccountNumber(int digits, int sum) throws Exception{
        //Each digit of an account number can lie between 0 and 9 (both inclusive)
        //Generate account number having given number of 'digits' such that the sum of digits is equal to 'sum'
        //If it is not possible, throw "Account Number can not be generated" exception

        Random random = new Random();
        int num = random.nextInt();

        return null;
    }

    public void deposit(double amount) {
        //add amount to balance
        if(amount > 0) {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) throws Exception {
        // Remember to throw "Insufficient Balance" exception, if the remaining amount would be less than minimum balance
        if(amount <= 0) {
            throw new Exception("Invalid amount");
        }
        if ((this.balance-amount) < minBalance) {
            throw new Exception("Insufficient Balance");
        }
        else {
            this.balance -= amount;
        }
    }

    public void checkAmount(double amount, double minBalance) throws Exception {
        if(amount < minBalance) throw new Exception("Amount must be greater than or equal to "+minBalance);
    }
    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public double getMinBalance() {
        return minBalance;
    }
}