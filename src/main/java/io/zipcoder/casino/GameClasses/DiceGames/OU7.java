package io.zipcoder.casino.GameClasses.DiceGames;


import io.zipcoder.casino.CasinoClasses.ConsoleInput;
import io.zipcoder.casino.CasinoClasses.ConsoleOutput;
import io.zipcoder.casino.CasinoClasses.Membership;
import io.zipcoder.casino.GameClasses.Game;
import io.zipcoder.casino.GameClasses.Games;
import io.zipcoder.casino.Player.Player;

public class OU7 extends Games implements ConsoleInput, ConsoleOutput {

    Dice pairOfDice = new  Dice(2);

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

        return null;
    }

    public Boolean isTurn() {
        return null;
    }

    public String getNextPlay(){
        return null;
    }

    public String displayGameState() {
        return null;
    }

    public String displayNextAction() {
        return null;
    }

    public Boolean evaluateGuessToRoll(Dice rolledDice,String playerGuess){
        Integer thisTurnsRoll = rolledDice.rollAndSum(pairOfDice);
        if(playerGuess.equals("Over") && thisTurnsRoll >7) {
            return true;
        }else if(playerGuess.equals("Under") && thisTurnsRoll <7) {
            return true;
        }else{
            return false;
        }
    }


}
