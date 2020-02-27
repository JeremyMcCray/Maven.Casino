package io.zipcoder.casino.GameClasses.DiceGames;

import io.zipcoder.casino.CasinoClasses.ConsoleInput;
import io.zipcoder.casino.CasinoClasses.ConsoleOutput;
import io.zipcoder.casino.CasinoClasses.Membership;
import io.zipcoder.casino.GameClasses.GamblingGame;
import io.zipcoder.casino.GameClasses.Games;
import io.zipcoder.casino.Player.Player;

public class Craps extends Games implements GamblingGame, ConsoleInput, ConsoleOutput {

    @Override
    public Player playerBuilder(Membership membership) {
        return null;
    }

    public Integer placeWager(Integer moneyToWager,Player playerToCheckBalance) {

        return null;
    }

    public Integer addWinnings(Integer winnings) {

        return null;
    }

    public Integer subtractLoses(Integer losses) {

        return null;
    }

    public Boolean checkPlayerBalances(Player player) {

        return null;
    }

    public Boolean quitGame() {

        return null;
    }

    public Boolean win() {

        return null;
    }

    public Boolean playAgain() {

        return null;
    }


    public Boolean isTurn() {

        return null;
    }


    public String getNextPlay() {

        return null;
    }


    public String displayGameState() {

        return null;
    }

    public String displayNextAction() {

        return null;
    }
}

