package com.codeclan.example;

public class CreditCard extends PaymentCard implements IChargeable{

    private double credit;
    private int interestRate;

    public CreditCard(String cardNumber, String expiryDate, int securityNumber, double credit) {
        super(cardNumber, expiryDate, securityNumber);
        this.credit = credit;
        this.interestRate = 4;
    }

    public double getCredit() {
        return credit;
    }

    public void pay(double amount) {
        if (this.credit > amount) {
            this.credit -= (amount * (1+(this.interestRate/100)));
            this.addTransactions(Double.toString(amount));
        }
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }
}
