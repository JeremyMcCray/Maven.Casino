package io.zipcoder.casino.Player;

import io.zipcoder.casino.GameClasses.CardGames.Card;

import io.zipcoder.casino.GameClasses.CardGames.Deck;

public class Dealer extends CardPlayer{

    public Dealer(){
        this.setPlayerName("Dealer");
        this.setBalance(0);
        }

    public Card dealCard(Deck theDeck, CardPlayer thePlayer){
        thePlayer.getHandOfCards().addCardToHand(theDeck.draw());
        return theDeck.draw();


        //Card card = new Card();
        //return null;
    }



}



