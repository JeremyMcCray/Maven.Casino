package io.zipcoder.casino.GameClasses.CardGames;

public class Card {
    private EnumRank rank;
    private EnumSuit suit;

    public Card(EnumRank cardRank, EnumSuit cardSuit) {
        this.rank = cardRank;
        this.suit = cardSuit;
    }
    public Card(EnumRank cardRank){
        this.rank = cardRank;
    }

    public EnumSuit getSuit() {
        return suit;
    }

    public EnumRank getRank() {
        return this.rank;
    }

}




