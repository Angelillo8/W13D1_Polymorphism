package com.codeclan.example;

import java.util.ArrayList;

public abstract class PaymentCard {

    private String cardNumber;
    private String expiryDate;
    private int securityNumber;

    private ArrayList<String> transactions;

    public PaymentCard(String cardNumber, String expiryDate, int securityNumber) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNumber = securityNumber;
        this.transactions = new ArrayList<>();
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public int getSecurityNumber() {
        return securityNumber;
    }

    public ArrayList<String> getTransactions() {
        return transactions;
    }

    public void addTransactions(String transaction) {
        this.transactions.add(transaction);
    }

}
