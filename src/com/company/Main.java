package com.company;

public class Main {

    public static void main(String[] args) {
        Desk desk = new Desk(36);
        desk.printCards();
        desk.mixCards();
        desk.printCards();

        Player player1 = new Player();
        Player player2 = new Player();

        player1.getCards(desk, 1);
        player2.getCards(desk, 2);

        player1.myDesk.printCards();
        player2.myDesk.printCards();
    }
}
