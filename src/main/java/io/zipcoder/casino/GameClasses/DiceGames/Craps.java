package io.zipcoder.casino.GameClasses.DiceGames;

import io.zipcoder.casino.CasinoClasses.Membership;
import io.zipcoder.casino.GameClasses.CardGames.Card;
import io.zipcoder.casino.GameClasses.GamblingGame;
import io.zipcoder.casino.GameClasses.Game;
import io.zipcoder.casino.GameClasses.Games;
import io.zipcoder.casino.Player.CrapsPlayer;
import io.zipcoder.casino.Player.Dealer;
import io.zipcoder.casino.Player.Player;
import io.zipcoder.casino.utilities.Console;

import java.util.HashMap;
import java.util.Scanner;

import static io.zipcoder.casino.Player.GamblerAttributes.winnings;

public class Craps extends Games implements GamblingGame {
    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    private Integer point = 0;

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
        playerWhoWon.setGameBalance(playerWhoWon.getGameBalance() + winnings);
        return playerWhoWon.getBalance();
    }


    public static Integer subtractLossesFromPlayerBalance(CrapsPlayer playerWhoLost, Integer losses) {
        playerWhoLost.setGameBalance(playerWhoLost.getGameBalance() - losses);
        return playerWhoLost.getBalance();
    }

    public Boolean checkPlayerBalances() {
        return null;
    }

//    public void startGame(Membership membership) { }

    public void startGame(Membership membership) {
        Console console = new Console(System.in,System.out);
        CrapsPlayer currentPlayer = new CrapsPlayer(membership);
        Dice twoDice = new Dice(2);
        Dealer crapsDealer = new Dealer();
        HashMap<String, Integer> betsOnTable = new HashMap<>();
        System.out.println("Welcome to the Craps Table!  Good luck! \n");
        String betType = console.getStringInput("Enter your bet type - Pass/Don't Pass");
        System.out.println("Enter bet amount!");
        Integer betAmount = Integer.parseInt(console.getStringInput("Enter bet amount!"));
        System.out.println("Bets are placed, let's roll!");
        Integer roll = twoDice.rollAndSum(twoDice);
        System.out.println("You rolled a " + roll + "!");
        String outcome = outcome(betType, roll, currentPlayer);


    }

    public String pointRollOutcome(Integer roll, CrapsPlayer bettor, String betType){
        if (betType == "pass") {
            if (roll == point) {
                return "win";
            }
            if (roll == 7) {
                return "lose";
            }
        }
        if (betType == "don't pass"){
            if (roll == point){
                return "lose";
            }
            if (roll == 7){
                return "win";
            }
        }
        return "error";
    }

    public String outcome(String betType, Integer roll, CrapsPlayer bettor) {
        if (betType == "pass") {
            if (roll == 7 || roll == 11) {
                return "win";
            } else if (roll == 2 || roll == 3 || roll == 12) {
                return "lose";
            } else {
                point = roll;
                return "Point set to " + point + "!";
            }
        }
        if (betType == "don't pass") {
            if (roll == 2 || roll == 3) {
                return "win";
            } else if (roll == 7 || roll == 11) {
                return "lose";
            } else if (roll == 12) {
                return "push";
            } else {
                point = roll;
                return "Point set to " + point + "!";
            }
        }

        return "error";
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

