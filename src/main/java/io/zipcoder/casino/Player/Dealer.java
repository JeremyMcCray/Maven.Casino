package io.zipcoder.casino.Player;

import io.zipcoder.casino.GameClasses.CardGames.Card;

import io.zipcoder.casino.GameClasses.CardGames.Deck;

public class Dealer extends Player{
    private Hand dealerHand=  new Hand();
    public Dealer(){

        this.setPlayerName("Dealer");
        this.setBalance(0);

        }
    public Hand getDealerHand(){
        return this.dealerHand;
    }

    public Card dealCard(Deck theDeck){
        return theDeck.draw();


        //Card card = new Card();
        //return null;
    }



}



