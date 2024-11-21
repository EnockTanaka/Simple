package org.example;

public enum Rank {

    ACE(1, "Ace"), DUECE(2, "2"), THREE(3, "3"), FOUR(4, "4"),
    FIVE(5, "5"), SIX(6, "6"), SEVEN(7, "7"), EIGHT(8, "8"),
    NINE(9, "9"), TEN(10, "10"), QUEEN(10, "Queen"), JACK(10, "Jack"),
    KING(10, "King");


    //PRIVATE fields
    private final int rankValue;
    private final String rankString;

    //constructor
    private Rank(int rankValue, String rankString){
        this.rankValue = rankValue;
        this.rankString = rankString;
    }



    //getter (public Methods)
    public int getRankValue(){
        return rankValue;
    }

    public String printRank(){
        return rankString;
    }
}
