package io.zipcoder.casino.Player;

import io.zipcoder.casino.GameClasses.CardGames.Card;
import io.zipcoder.casino.GameClasses.CardGames.Deck;

public class Dealer extends Player{

    public Dealer(){
        this.playerName = "Dealer";
        this.balance = 0;
        }

    public Card dealCard(Deck theDeck){
        return theDeck.draw();

    }
}
