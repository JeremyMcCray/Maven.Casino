package io.zipcoder.casino.GameClasses.CardGames;

import io.zipcoder.casino.CasinoClasses.Membership;
import io.zipcoder.casino.GameClasses.GamblingGame;
import io.zipcoder.casino.GameClasses.Game;
import io.zipcoder.casino.Player.Hand;
import io.zipcoder.casino.Player.Player;

public class BlackJack extends CardGame implements GamblingGame{

    public void gameNamer(String nameOfGame){


    }    public Integer placeWager() {

        return null;
    }

    public Integer addWinnings() {

        return null;
    }

    public Integer subtractLoses() {

        return null;
    }

    public Boolean checkPlayerBalances() {

        return null;
    }

//    public void startGame() {}




    public void startGame(Membership membership) {

    }

    public Boolean quitGame(int newBalance) {

        return null;
    }

    public Boolean win() {

        return null;
    }

    public Boolean playAgain() {

        return null;
    }

    @Override
    public Player playerBuilder(Membership membership) {
        return null;
    }

    public Player playerBuilder() {

        return null;
    }

    public Boolean isTurn() {

        return null;
    }


    @Override
    public Hand dealCards(Integer numberOfCards) {
        return null;
    }
}
