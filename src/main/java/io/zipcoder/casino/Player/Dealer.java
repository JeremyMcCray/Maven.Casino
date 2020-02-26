package io.zipcoder.casino.Player;

import io.zipcoder.casino.GameClasses.CardGames.Card;
import io.zipcoder.casino.GameClasses.CardGames.Deck;

public class Dealer extends Player{

    public Dealer(){

        this.setPlayerName("Dealer");
        this.setBalance(0);

        }

    public Card dealCard(Deck theDeck){
        return theDeck.draw();

    }
}
