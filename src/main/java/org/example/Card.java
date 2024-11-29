package org.example;

public class Card {

    private Suit suit;
    private Rank rank;
    public boolean isFaceUp;

    //Constructor
    public Card(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
        this.isFaceUp = false;
    }

    public void flipCard(){
        isFaceUp = !isFaceUp;
    }

    //Get the rank
    public int getRank(){
        return rank.getRankValue();
    }
    public String printRank() {
        return rank.printRank();
    }

    public String getSuit(){
        return suit.printSuit();
    }

    public String toString(){
        String str = "";
        if (!isFaceUp){
            str += rank.printRank() + " of " + suit.printSuit();
        } else{
            str += "Face Down (nothing to see here)";
        }
        return str;
    }
}
