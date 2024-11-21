package org.example;

public enum Suit {

    HEARTS("Hearts"),
    SPADES("Spades"),
    DIAMONDS("Diamonds"),
    CLUBS("Clubs");


    public final String suitText;

    //Constructor
    private Suit(String suitText){
        this.suitText = suitText;
    }

    //Public methods which returns the suit
    public String printSuit(){
        return suitText;
    }
}
