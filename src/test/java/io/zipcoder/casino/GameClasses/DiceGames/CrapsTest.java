package io.zipcoder.casino.GameClasses.DiceGames;


import io.zipcoder.casino.CasinoClasses.Membership;
import io.zipcoder.casino.GameClasses.CardGames.Card;
import io.zipcoder.casino.GameClasses.CardGames.EnumRank;
import io.zipcoder.casino.GameClasses.CardGames.EnumSuit;
import io.zipcoder.casino.Player.CrapsPlayer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

public class CrapsTest {
    Membership testMem = new Membership("Bugs Bunny",1234,2000,50);
    CrapsPlayer testPlayer = new CrapsPlayer(testMem);
    Dice testDice = new Dice(2);
    Craps crapGame = new Craps();
    Card testCard = new Card(EnumRank.three,EnumSuit.hearts);


    @Test
    public void addWinningsToPlayerBalanceTest() {
        Craps.addWinningsToPlayerBalance(testPlayer,100);
        Integer actual = testPlayer.getGameBalance();
        Integer expected = 2100;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void subtractLossesFromPlayerBalanceTest(){
        Craps.subtractLossesFromPlayerBalance(testPlayer,100);
        Integer actual = testPlayer.getGameBalance();
        Integer expected = 1900;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void outcomeTestPass7(){
        Integer testRoll = 7;
        String testBetType = "pass";
        String expected = "win";
        String actual = crapGame.outcome(testBetType,testRoll,testPlayer);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void outcomeTestPass11(){
        Integer testRoll = 11;
        String testBetType = "pass";
        String expected = "win";
        String actual = crapGame.outcome(testBetType,testRoll,testPlayer);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void outcomeTestPass2(){
        Integer testRoll = 2;
        String testBetType = "pass";
        String expected = "lose";
        String actual = crapGame.outcome(testBetType,testRoll,testPlayer);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void outcomeTestPass3(){
        Integer testRoll = 3;
        String testBetType = "pass";
        String expected = "lose";
        String actual = crapGame.outcome(testBetType,testRoll,testPlayer);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void outcomeTestPass12(){
        Integer testRoll = 12;
        String testBetType = "pass";
        String expected = "lose";
        String actual = crapGame.outcome(testBetType,testRoll,testPlayer);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void outcomeTestDontPass2(){
        Integer testRoll = 2;
        String testBetType = "don't pass";
        String expected = "win";
        String actual = crapGame.outcome(testBetType,testRoll,testPlayer);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void outcomeTestDontPass3() {
        Integer testRoll = 3;
        String testBetType = "don't pass";
        String expected = "win";
        String actual = crapGame.outcome(testBetType, testRoll, testPlayer);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void outcomeTestDontPass7() {
        Integer testRoll = 7;
        String testBetType = "don't pass";
        String expected = "lose";
        String actual = crapGame.outcome(testBetType, testRoll, testPlayer);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void outcomeTestDontPass11() {
        Integer testRoll = 11;
        String testBetType = "don't pass";
        String expected = "lose";
        String actual = crapGame.outcome(testBetType, testRoll, testPlayer);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void outcomeTestDontPass12() {
        Integer testRoll = 12;
        String testBetType = "don't pass";
        String expected = "push";
        String actual = crapGame.outcome(testBetType, testRoll, testPlayer);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void outcomeTestPassSetPoint5() {
        Integer testRoll = 5;
        String testBetType = "pass";
        String expected = "Point set to 5!";
        String actual = crapGame.outcome(testBetType, testRoll, testPlayer);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void outcomeTestDontPassSetPoint5() {
        Integer testRoll = 5;
        String testBetType = "don't pass";
        String expected = "Point set to 5!";
        String actual = crapGame.outcome(testBetType, testRoll, testPlayer);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void pointRollOutcomeTestPassPoint(){
        crapGame.setPoint(5);
        Integer testRoll = 5;
        String expected = "win";
        String actual = crapGame.pointRollOutcome(testRoll,testPlayer,"pass");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void pointRollOutcomeTestPass7(){
        crapGame.setPoint(5);
        Integer testRoll = 7;
        String expected = "lose";
        String actual = crapGame.pointRollOutcome(testRoll,testPlayer,"pass");
        Assert.assertEquals(expected,actual);
}
    @Test
    public void pointRollOutcomeTestDontPassPoint(){
        crapGame.setPoint(5);
        Integer testRoll = 5;
        String expected = "lose";
        String actual = crapGame.pointRollOutcome(testRoll,testPlayer,"don't pass");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void pointRollOutcomeTestDontPass7(){
        crapGame.setPoint(5);
        Integer testRoll = 7;
        String expected = "win";
        String actual = crapGame.pointRollOutcome(testRoll,testPlayer,"don't pass");
        Assert.assertEquals(expected,actual);
    }
}