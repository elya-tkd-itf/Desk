package com.company;

import java.util.Random;

public class Desk {
    public int n;
    public Card[] cards;

    public Desk(int n) {
        this.n = n;
        cards = new Card[n];
        for (int i = 0; i < n; i++)
            cards[i] = new Card(i);
    }

    public Desk(Card[] c) {
        this.n = c.length;
        cards = c.clone();
    }

    public void printCards() {
        for (Card card : cards)
            System.out.print(card.number + " ");
        System.out.println();
    }

    public void mixCards() {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int j = random.nextInt(n);
            Card tmp = cards[i];
            cards[i] = cards[j];
            cards[j] = tmp;
        }
    }
}
