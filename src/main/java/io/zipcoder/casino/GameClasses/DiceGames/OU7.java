package io.zipcoder.casino.GameClasses.DiceGames;
import io.zipcoder.casino.CasinoClasses.ConsoleInput;
import io.zipcoder.casino.CasinoClasses.ConsoleOutput;
import io.zipcoder.casino.CasinoClasses.Membership;
import io.zipcoder.casino.GameClasses.Game;
import io.zipcoder.casino.Player.OU7Player;
import io.zipcoder.casino.Player.Player;
import java.util.*;


public class OU7 implements Game, ConsoleInput, ConsoleOutput {

    Dice pairOfDice = new Dice(2);
    OU7Player ou7Player1;
    Integer gameBalance;
    Integer betAmount;
    String actualGuess;

    // ***************************************************************************** StartGame()  - game logic *********
    public void startGame(Membership membership) {

        playerBuilder(membership);
        Boolean keepPlaying = true;

        while (keepPlaying.equals(true)) {
            System.out.println("Welcome to Over/Under 7" + ou7Player1.getName() + "\n\n");
            System.out.println("Enter your bet type - Over/Under 7");
            Scanner playerInput = new Scanner(System.in);
            String playerGuess = playerInput.nextLine();
            Boolean guess = evaluateGuessToRoll(pairOfDice, playerGuess);

            keepPlaying = playAgain();
        }
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
        if (actualGuess.equals("Over") && thisTurnsRoll > 7) {
            System.out.println("Congrats! You win");
            // gameBalance += betAmount;
            return true;
        } else if (actualGuess.equals("Under") && thisTurnsRoll < 7) {
            // gameBalance += betAmount;
            System.out.println("Congrats! You win");
            return true;
//                  }else if(actualGuess.equals("Equals")&&thisTurnsRoll==7){
//                  return true;
        } else {
            // gameBalance -= betAmount;
            System.out.println("Sorry. You lose");
            return false;
        }
    }

    // ***************************************************************************** Play Again   **********************
    public Boolean playAgain(){

        boolean answer = false;
        System.out.println("Do you want to play again? Y/N");
        Scanner in =  new Scanner(System.in);
        String res = in.nextLine().toUpperCase();
        if (res == "Y" || res == "y")
            answer = true;
        else if (res == "n" || res == "N"){
            answer = false;
        }
        return answer;
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

