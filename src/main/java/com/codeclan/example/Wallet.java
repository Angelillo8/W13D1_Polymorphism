package com.codeclan.example;

import java.util.ArrayList;

public class Wallet {

    private ArrayList<IChargeable> cards;

    public Wallet() {
        this.cards = new ArrayList<>();
    }

    public void addCard(IChargeable iChargeable) {
        this.cards.add(iChargeable);
    }

    public IChargeable chooseCard(IChargeable iChargeable) {
        int cardIndex= this.cards.indexOf(iChargeable);
        return this.cards.get(cardIndex);
    }

    public void charge(IChargeable iChargeable, double amount) {
        IChargeable cardToCharge = this.chooseCard(iChargeable);
        cardToCharge.pay(amount);
    }

    public int countCards() {
        return this.cards.size();
    }
}
