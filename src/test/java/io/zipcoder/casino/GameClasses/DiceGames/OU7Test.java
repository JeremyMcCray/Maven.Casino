package io.zipcoder.casino.GameClasses.DiceGames;

import io.zipcoder.casino.GameClasses.DiceGames.OU7Test;
import io.zipcoder.casino.CasinoClasses.Membership;
import io.zipcoder.casino.Player.OU7Player;
import org.junit.Assert;
import org.junit.Test;





public class OU7Test {

    @Test
    public void quitGame() {

        String actual = "";
        String expected = "";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void win() {
    }

    @Test
    public void playAgain() {
    }

    @Test
    public void playerBuilder() {

        Membership newMembership = new Membership("Fred Rogers", 123, 10000, 40);
        OU7Player newPlayer = new OU7Player(newMembership);

        //when
        String expectedName = "Fred Rogers";
        String actualName = newPlayer.getName();

        Integer actualAge = 40;
        Integer expectedAge = newPlayer.getAge();

        Integer actualIdNumber = 123;
        Integer expectedIdNumber = newPlayer.getIdNumber();
        Integer actualBalance = 10000;
        Integer expectedBalance = newPlayer.getBalance();

        //result
        Assert.assertEquals(actualName, expectedName);
        Assert.assertEquals(actualAge, expectedAge);
        Assert.assertEquals(actualIdNumber, expectedIdNumber);
        Assert.assertEquals(actualBalance, expectedBalance);
    }

    @Test
    public void startGameTest() {


    }

    public void evaluateGuessToRollTest(){

//        Dice rolledDice = new Dice(2);
//        String guess = "Over";
//        rolledDice.rollAndSum;
//        Boolean actual = true;
//        Boolean expected = true;
//        Assert.assertEquals(actual, expected);


    }

    @Test
    public void isTurn() {
    }

    @Test
    public void getNextPlay() {
    }

    @Test
    public void displayGameState() {
    }

    @Test
    public void displayNextAction() {
    }

    @Test
    public void evaluateGuessToRoll() {
    }

    @Test
    public void testPlayerBuilder() {
    }

    @Test
    public void startGame() {
    }

    @Test
    public void testEvaluateGuessToRoll() {
    }

    @Test
    public void testQuitGame() {
    }

    @Test
    public void testPlayAgain() {
    }

    @Test
    public void testGetNextPlay() {
    }

    @Test
    public void testWin() {
    }

    @Test
    public void testIsTurn() {
    }

    @Test
    public void testDisplayGameState() {
    }

    @Test
    public void testDisplayNextAction() {
    }
}