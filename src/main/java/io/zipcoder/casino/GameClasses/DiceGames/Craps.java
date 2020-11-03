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
    private Integer point = 0;
    boolean pointApplies = false;
    Integer currentBet = 0;

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

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
        Console console = new Console(System.in, System.out);
        CrapsPlayer currentPlayer = new CrapsPlayer(membership);
        boolean playOn = true;
        Dice twoDice = new Dice(2);
        Dealer crapsDealer = new Dealer();
        HashMap<String, Integer> betsOnTable = new HashMap<>();
        System.out.println("Welcome to the Craps Table!  Good luck! \n");
        while (playOn == true) {
            String betType = console.getStringInput("Enter your bet type - Pass/Don't Pass");
            Integer betAmount = Integer.parseInt(console.getStringInput("Enter bet amount!"));
            subtractLossesFromPlayerBalance(currentPlayer, betAmount);
            System.out.println("Bets are placed, let's roll!");
            Integer roll = twoDice.rollAndSum(twoDice);
            System.out.println("You rolled a " + roll + "!");
            while (pointApplies == false) {
                if (outcome(betType, roll, currentPlayer).equals("win")) {
                    addWinningsToPlayerBalance(currentPlayer, betAmount * 2);
                    System.out.println("You win " + betAmount + "!");
                    break;
                } else if (outcome(betType, roll, currentPlayer).equals("lose")) {
                    subtractLossesFromPlayerBalance(currentPlayer, betAmount);
                    System.out.println("You lose " + betAmount + "!");
                    break;
                } else pointApplies = true;

            }
            while (pointApplies == true) {
                System.out.println("Roll again!");
                roll = twoDice.rollAndSum(twoDice);
                System.out.println("You rolled a " + roll + "!");

                if (pointRollOutcome(roll, currentPlayer, betType).equals("win")) {
                    addWinningsToPlayerBalance(currentPlayer, betAmount * 2);
                    System.out.println("You win " + betAmount + "!");
                    break;
                } else if (pointRollOutcome(roll, currentPlayer, betType).equals("lose")) {
                    subtractLossesFromPlayerBalance(currentPlayer, betAmount);
                    System.out.println("You lose " + betAmount + "!");
                    break;
                } else if (pointRollOutcome(roll, currentPlayer, betType).equals("push")) {
                    addWinningsToPlayerBalance(currentPlayer, betAmount);
                    System.out.println("It's a push!");
                    break;
                }
            }
            playOn = playAgain();

        }
        currentPlayer.getPlayer().setBalance(currentPlayer.getGameBalance());
    }




    public String pointRollOutcome(Integer roll, CrapsPlayer bettor, String betType){
        if (betType.equals("pass")) {
            if (roll.equals(point)) {
                return "win";
            }
            if (roll == 7) {
                return "lose";
            }
        }
        if (betType.equals("don't pass")){
            if (roll.equals(point)){
                return "lose";
            }
            if (roll == 7){
                return "win";
            }
        }
        return "error";
    }

    public String outcome(String betType, Integer roll, CrapsPlayer bettor) {
        if (betType.equals("pass")) {
            if (roll == 7 || roll == 11) {
                return "win";
            } else if (roll == 2 || roll == 3 || roll == 12) {
                return "lose";
            } else {
                point = roll;
                pointApplies = true;
                System.out.println( "Point set to " + point + "!");
                return "Point set to " + point + "!";

            }
        }
        if (betType.equals("don't pass")) {
            if (roll == 2 || roll == 3) {
                return "win";
            } else if (roll == 7 || roll == 11) {
                return "lose";
            } else if (roll == 12) {
                return "push";
            } else {
                point = roll;
                pointApplies = true;
                System.out.println("Point set to " + point + "!");
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

    public Boolean playAgain(){

        boolean answer = false;
        System.out.println("Would you like to keep playing? Y/N");
        Scanner in =  new Scanner(System.in);
        String decision = in.nextLine().toLowerCase();
        if (decision.equals("y")) {
            answer = true;
        } else if (decision.equals("n")){
            answer = false;
        }
        return answer;
    }

    public Boolean isTurn() {
        return null;
    }


}

