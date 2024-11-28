package org.example;

public class Card {

    private Suit suit;
    private Rank rank;
    private boolean isFaceUp;

    //Constructor
    public Card(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
        this.isFaceUp = true;
    }

    public void flipCard(){
        isFaceUp = false;
    }

    //Get the rank
    public int getRank(){
        return rank.getRankValue();
    }

    public String getSuit(){
        return suit.printSuit();
    }

    public String toString(){
        String str = "";
        if (isFaceUp){
            str += rank.printRank() + " of " + suit.printSuit();
        } else{
            str += "Face Down (nothing to see here)";
        }
        return str;
    }
}
