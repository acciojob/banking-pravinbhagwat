package com.driver;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws Exception {
//        BankAccount bankAccount = new BankAccount("Pravin", 5000, 1000);
        SavingsAccount sb = new SavingsAccount("Pravin", 50000, 50000, 8);
//        double ci = sb.getCompoundInterest(12, 5);
//        System.out.println(ci);
//        double si = sb.getSimpleInterest(2);
//        System.out.println(si);
        sb.withdraw(5000);
        System.out.println(sb.getBalance());
    }
}