package io.zipcoder.casino.GameClasses.DiceGames;

import io.zipcoder.casino.CasinoClasses.Membership;
import io.zipcoder.casino.GameClasses.GamblingGame;
import io.zipcoder.casino.GameClasses.Game;
import io.zipcoder.casino.GameClasses.Games;
import io.zipcoder.casino.Player.CrapsPlayer;
import io.zipcoder.casino.Player.Dealer;
import io.zipcoder.casino.Player.Player;

import java.util.HashMap;

import static io.zipcoder.casino.Player.GamblerAttributes.winnings;

public class Craps extends Games implements GamblingGame{

    public Integer placeWager() {
        return null;
    }

    @Override
    public Integer addWinnings() {
        return null;
    }

    @Override
    public Integer subtractLoses() {
        return null;
    }


    public static Integer addWinningsToPlayerBalance(CrapsPlayer playerWhoWon, Integer winnings) {
        playerWhoWon.setGameBalance(playerWhoWon.getGameBalance()+winnings);
        return playerWhoWon.getBalance();
    }



    public static Integer subtractLossesFromPlayerBalance(CrapsPlayer playerWhoLost, Integer losses) {
        playerWhoLost.setGameBalance(playerWhoLost.getGameBalance()-losses);
        return playerWhoLost.getBalance();
    }

    public Boolean checkPlayerBalances() {
        return null;
    }

//    public void startGame(Membership membership) { }

    public void startGame(Membership membership) {
        CrapsPlayer currentPlayer = new CrapsPlayer(membership);
        Dice twoDice = new Dice(2);
        Dealer crapsDealer = new Dealer();
        HashMap<String, Integer> betsOnTable = new HashMap<>();

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


}

