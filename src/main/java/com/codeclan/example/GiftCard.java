package com.codeclan.example;

public class GiftCard implements IChargeable{

    private double balance;

    public GiftCard(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }

    public void pay(double amount) {
        if (this.balance > amount) {
            this.balance -= amount;
        }
    }
}
