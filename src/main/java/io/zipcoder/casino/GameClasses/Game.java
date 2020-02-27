package io.zipcoder.casino.GameClasses;

import io.zipcoder.casino.Player.Player;

import java.util.ArrayList;

public interface Game {



    public Boolean quitGame();

    public Boolean win();

    public Boolean playAgain();

    public Player playerBuilder();

    public Boolean isTurn();
}
