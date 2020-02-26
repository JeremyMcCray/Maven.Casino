package io.zipcoder.casino.GameClasses.CardGames;

import io.zipcoder.casino.Player.Player;

import java.util.ArrayList;

public abstract class CardGame {

    abstract public Card dealCards(Integer numberOfCards);

    public Player checkHand(ArrayList<Player> players){
        return null;
    }

}
