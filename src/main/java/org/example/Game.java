package org.example;


public class Game {
    public static void main(String[] args) {

    Deck d1 = new Deck();
    d1.populate();

//    System.out.println(d1.showHand());
        d1.shuffle();
        System.out.println(d1.showHand());

    }
}