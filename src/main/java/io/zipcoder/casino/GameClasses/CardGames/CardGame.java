package io.zipcoder.casino.GameClasses.CardGames;

import io.zipcoder.casino.GameClasses.Games;
import io.zipcoder.casino.Player.Hand;

public abstract class CardGame extends Games {

    abstract public Hand dealCards(Integer numberOfCards);

}
