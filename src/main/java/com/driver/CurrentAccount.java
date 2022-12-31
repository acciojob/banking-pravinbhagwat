package com.driver;

public class CurrentAccount extends BankAccount{
    String tradeLicenseId; //consists of Uppercase English characters only

    public CurrentAccount(String name, double balance, String tradeLicenseId) throws Exception {
        // minimum balance is 5000 by default. If balance is less than 5000, throw "Insufficient Balance" exception
        super(name, balance, 5000);
        this.tradeLicenseId = tradeLicenseId;
        validateLicenseId();
    }

    public String getTradeLicenseId() {
        return tradeLicenseId;
    }

    public void validateLicenseId() throws Exception {
        // A trade license Id is said to be valid if no two consecutive characters are same
        // If the license Id is valid, do nothing
        // If the characters of the license Id can be rearranged to create any valid license Id
        // If it is not possible, throw "Valid License can not be generated" Exception
        if (!isConsecutiveChar(tradeLicenseId)) {
            String newTradeId = rearrangeString(tradeLicenseId);
            if (!isConsecutiveChar(newTradeId) || newTradeId.length()==0) throw new Exception("Valid License can not be generated");
            else this.tradeLicenseId = newTradeId;
        }
    }

    public String rearrangeString(String id) {

        return null;
    }

    public boolean isConsecutiveChar(String id) {
        int n = id.length();
        for (int i = 0; i < n-1; i++) {
            if (id.charAt(i) == id.charAt(i+1)) return false;
        }
        return true;
    }

}