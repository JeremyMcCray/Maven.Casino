package io.zipcoder.casino.GameClasses.DiceGames;


import io.zipcoder.casino.CasinoClasses.ConsoleInput;
import io.zipcoder.casino.CasinoClasses.ConsoleOutput;
import io.zipcoder.casino.CasinoClasses.Membership;
import io.zipcoder.casino.GameClasses.GamblingGame;
import io.zipcoder.casino.GameClasses.Games;
import io.zipcoder.casino.Player.CrapsPlayer;
import io.zipcoder.casino.Player.Dealer;
import io.zipcoder.casino.Player.Player;


import java.util.HashMap;

public class Craps extends Games implements GamblingGame {


    public static Integer addWinningsToPlayerBalance(CrapsPlayer playerWhoWon, Integer winnings) {
        playerWhoWon.setGameBalance(playerWhoWon.getGameBalance() + winnings);
        return playerWhoWon.getBalance();
    }


    public Integer subtractLoses() {

        return null;
    }

    public Boolean checkPlayerBalances(Player player) {

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


    public String getNextPlay() {

        return null;
    }


    public String displayGameState() {

        return null;
    }

    @Override
    public Integer placeWager(Integer moneyToWager, Player playerToCheckBalance) {
        return null;
    }

    @Override
    public Integer addWinnings(Integer moneyWon) {
        return null;
    }

    @Override
    public Integer subtractLoses(Integer moneyLost) {
        return null;

    }
}
