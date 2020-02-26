package io.zipcoder.casino.GameClasses.CardGames;

import io.zipcoder.casino.CasinoClasses.ConsoleInput;
import io.zipcoder.casino.CasinoClasses.ConsoleOutput;
import io.zipcoder.casino.CasinoClasses.Membership;
import io.zipcoder.casino.GameClasses.GamblingGame;
import io.zipcoder.casino.GameClasses.Game;
import io.zipcoder.casino.Player.BlackJackPlayer;
import io.zipcoder.casino.Player.Player;

public class BlackJack implements GamblingGame, Game, ConsoleOutput, ConsoleInput {
    private Player currentPlayer;
    private Integer currentWager = 0;

    public Integer placeWager(Integer wager) {
        if(currentPlayer.getBalance() > wager){
            currentWager+=wager;
        }
        return currentWager;
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

    public Player playerBuilder(Membership currentMember) {
        currentPlayer = new BlackJackPlayer(currentMember);
        return currentPlayer;
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
