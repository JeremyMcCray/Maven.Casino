package io.zipcoder.casino.GameClasses.CardGames;


import io.zipcoder.casino.GameClasses.Games;
import io.zipcoder.casino.Player.Hand;
import io.zipcoder.casino.Player.Player;

import java.util.ArrayList;

public abstract class CardGame extends Games {


    abstract public Hand dealCards(Integer numberOfCards,Player playerWhoGetsCard);

    public Player checkHand(ArrayList<Player> players){
        return null;
    }

}
