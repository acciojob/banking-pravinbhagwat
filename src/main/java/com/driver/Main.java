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
//        sb.withdraw(5000);
//        System.out.println(sb.generateAccountNumber(2, 18));
//        System.out.println(sb.getBalance());
        CurrentAccount cb = new CurrentAccount("ABC", 6000, "ABB");
        //cb.withdraw(5000);
        cb.validateLicenseId();
        System.out.println(cb.getTradeLicenseId());
        System.out.println(cb.generateAccountNumber(2, 18));
        System.out.println(cb.getBalance());

    }
}