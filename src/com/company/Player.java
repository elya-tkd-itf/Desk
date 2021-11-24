package com.company;

public class Player {
    public Desk myDesk;

    public void getCards(Desk desk, int n) {
        Card[] cards = new Card[desk.n / 2];
        for (int i = 0; i < desk.n / 2; i++)
            cards[i] = desk.cards[n - 1 + 2 * i];
        myDesk = new Desk(cards);
    }
}
