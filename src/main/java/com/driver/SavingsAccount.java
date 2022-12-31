package com.driver;

public class SavingsAccount extends BankAccount{
    private double rate;
    private double maxWithdrawalLimit;

    public SavingsAccount(String name, double balance, double maxWithdrawalLimit, double rate){
        // minimum balance is 0 by default
        super(name, balance, 0);
        this.maxWithdrawalLimit = maxWithdrawalLimit;
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public double getMaxWithdrawalLimit() {
        return maxWithdrawalLimit;
    }

    public void withdraw(double amount) throws Exception {
        // Might throw the following errors:
        // 1. "Maximum Withdraw Limit Exceed" : If the amount exceeds maximum withdrawal limit
        // 2. "Insufficient Balance" : If the amount exceeds balance
        if (amount > maxWithdrawalLimit) throw new Exception("Maximum Withdraw Limit Exceed");
        super.withdraw(amount);
    }

    public double getSimpleInterest(int years){
        // Return the final amount considering that bank gives simple interest on current amount
        double balance = getBalance();
        double rate = this.rate;
        return(balance*rate*years)/100;
    }

    public double getCompoundInterest(int times, int years){
        // Return the final amount considering that bank gives compound interest on current amount given times per year
        double balance = getBalance();
        double rate = this.rate/100;
        double finalAmount = balance * Math.pow(1 + (rate / times), times * years);
        double cInterest = finalAmount-balance;
        return cInterest;
    }

}
