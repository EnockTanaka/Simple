package org.example;

import java.util.Random;

public class Deck extends Hand{
    Random random = new Random();

    public void populate(){
        for (Suit suit: Suit.values()){
            for (Rank rank: Rank.values()){
                Card card = new Card(rank, suit);
                card.flipCard();
                this.add(card);
            }
        }

    }

    public void shuffle(){
        for (int i = cards.size() - 1; i > 0; i-- ){
            int pick = random.nextInt(i);
            Card randCard = cards.get(pick);
            Card lastcard = cards.get(i);
            cards.set(i , randCard);
            cards.set(pick, lastcard);
        }

    }

    public void deal(Hand[] hands, int perHand){
        for (int i = 0; i < perHand; i++ ){
            for (int j = 0; j < hands.length; j++){
                this.give(cards.get(0), hands[j]);
            }
        }
    }

    public void deal(Hand hand, int perHand){
        for (int i = 0; i < perHand; i++){
            this.give(cards.get(0), hand);
        }
    }

    public void flipCard(Card c){
        c.flipCard();
    }

}
