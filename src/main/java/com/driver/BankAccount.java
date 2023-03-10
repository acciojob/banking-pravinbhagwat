package com.driver;

import java.util.Arrays;

public class BankAccount {

    private String name;
    private double balance;
    private double minBalance;

    public BankAccount(String name, double balance, double minBalance) throws Exception{
        if(balance < minBalance) throw new Exception("Insufficient Balance");
        this.name = name;
        this.balance = balance;
        this.minBalance = minBalance;
    }

    public String generateAccountNumber(int digits, int sum) throws Exception{
        //Each digit of an account number can lie between 0 and 9 (both inclusive)
        //Generate account number having given number of 'digits' such that the sum of digits is equal to 'sum'
        //If it is not possible, throw "Account Number can not be generated" exception

        if(sum>9*digits){
            throw new Exception("Account Number can not be generated");
        }
        return accountNoGenerator(digits,sum);
    }

    private String accountNoGenerator(int digits, int sum) {
        int[] acconutNo=new int[digits];
        String acconutNoStr = "";
        for(int i=0; i<digits; i++){
            if(sum>=9){
                acconutNo[i]=9;
                acconutNoStr+=9;
                sum=sum-9;
            }else{
                acconutNo[i]=sum;
                acconutNoStr+=sum;
                sum=0;
            }
        }
//        return Arrays.toString(acconutNo);
        return acconutNoStr;
    }

    public void deposit(double amount) {
        //add amount to balance
        if(amount > 0) {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) throws Exception {
        // Remember to throw "Insufficient Balance" exception, if the remaining amount would be less than minimum balance
//        if(amount <= 0) {
//            throw new Exception("Invalid amount");
//        }
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