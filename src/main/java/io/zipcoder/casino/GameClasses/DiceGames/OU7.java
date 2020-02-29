package io.zipcoder.casino.GameClasses.DiceGames;

import io.zipcoder.casino.CasinoClasses.ConsoleInput;
import io.zipcoder.casino.CasinoClasses.ConsoleOutput;
import io.zipcoder.casino.CasinoClasses.Membership;
import io.zipcoder.casino.GameClasses.Game;
import io.zipcoder.casino.Player.OU7Player;
import io.zipcoder.casino.Player.Player;
import java.util.*;
import java.util.concurrent.TimeUnit;


public class OU7 implements Game, ConsoleInput, ConsoleOutput {

    Dice pairOfDice = new Dice(2);
    OU7Player ou7Player1;
    Integer gameBalance;
    //Integer betAmount;

    // ***************************************************************************** StartGame()  - game logic *********
    public void startGame(Membership membership) {

        playerBuilder(membership);
        Boolean continueOrNot = true;
        System.out.println("\n\n" + "                Welcome to Over/Under 7                 : " + ou7Player1.getName() + "\n");
        do{
            System.out.print           ("      Enter your guess type - Over/Under/Spot  7        : ");
            Scanner playerInput = new Scanner(System.in);
            String playerGuess = playerInput.nextLine().toUpperCase();
            evaluateGuessToRoll(pairOfDice, playerGuess);
            System.out.print("\n");
            continueOrNot = playAgain();
        } while (continueOrNot);
    }

    // ***************************************************************************** Build Player **********************
    public Player playerBuilder(Membership accountDetails) {

        ou7Player1 = new OU7Player(accountDetails);
        gameBalance = ou7Player1.getBalance();

        return ou7Player1;
    }
    // ***************************************************************************** Evaluate Guess To Roll ************
    public Boolean evaluateGuessToRoll(Dice rolledDice, String actualGuess) {

        Integer thisTurnsRoll = rolledDice.rollAndSum(pairOfDice);
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

      //System.out.print           ("      Enter your guess type - Over/Under/Spot  7        : ");
        System.out.println         ("                  Your Roll is                          : " + thisTurnsRoll);
        if (thisTurnsRoll > 7 && actualGuess.equals("OVER")) {
            System.out.println("Congrats! You win");
            // gameBalance += betAmount;
            return true;
        } else
            if (thisTurnsRoll < 7 && actualGuess.equals("UNDER")){
            System.out.println("Congrats! You win");
            // gameBalance += betAmount;
            return true;
                  }
        else

            if (thisTurnsRoll == 7 && actualGuess.equals("SPOT")){
                System.out.println("Congrats! You hit the Jackpot");
                // gameBalance += betAmount;
                return true;

        }
            else {
            // gameBalance -= betAmount;
            System.out.println("Sorry. You lose");
            return false;
        }
    }

    // ***************************************************************************** Play Again   **********************
    public Boolean playAgain(){

        boolean continueOrNot = true ;
        System.out.println("Do you want to play again? Y/N");
        Scanner in =  new Scanner(System.in);
        String res = in.nextLine().toUpperCase();
        switch(res) {
            case "Y" : continueOrNot = true;
            break;
            case "N" : continueOrNot = false;
            break;

        }
        return continueOrNot;
    }
    //**********************     Methods below this line have not been used      ****************************//


    public Boolean quitGame() {
            return null;
    }
    public String getNextPlay() {

        return null;
    }
    public Boolean win() {
        return null;
    }

    public Boolean isTurn() {
        return null;
    }

    public String displayGameState() {
        return null;
    }

    public String displayNextAction() {
        return null;
    }
    //private static final Set<String> s = Collections.unmodifiableSet(new HashSet<String>(Arrays.asList("Y", "y", "N", "n")));
}

