package io.zipcoder.casino.GameClasses.DiceGames;

import io.zipcoder.casino.CasinoClasses.ConsoleInput;
import io.zipcoder.casino.CasinoClasses.ConsoleOutput;
import io.zipcoder.casino.CasinoClasses.Membership;
import io.zipcoder.casino.GameClasses.GamblingGame;
import io.zipcoder.casino.GameClasses.Game;
import io.zipcoder.casino.Player.BlackJackPlayer;
import io.zipcoder.casino.Player.Player;

public class Craps implements GamblingGame, Game, ConsoleInput, ConsoleOutput {

    public Integer placeWager(Integer moneyToWager) {
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

    public void startGame() {

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

    public Player playerBuilder(Membership currentPlayer) {
        BlackJackPlayer player = new BlackJackPlayer(currentPlayer);
        return player;
    }

    public Boolean isTurn() {

        return null;
    }

    @Override
    public String getNextPlay() {
        return null;
    }

    @Override
    public String displayGameState() {
        return null;
    }

    @Override
    public String displayNextAction() {
        return null;
    }
}

