package com.codeclan.example;

public class DebitCard extends PaymentCard implements IChargeable{

    private String accountNumber;
    private String sortCode;

    public DebitCard(String cardNumber, String expiryDate, int securityNumber, String accountNumber, String sortCode) {
        super(cardNumber, expiryDate, securityNumber);
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getSortCode() {
        return sortCode;
    }

    public void pay(double amount) {
        this.addTransactions(Double.toString(amount));
    }

}
