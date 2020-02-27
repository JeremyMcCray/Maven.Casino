package io.zipcoder.casino.GameClasses.CardGames;

import io.zipcoder.casino.CasinoClasses.Membership;
import io.zipcoder.casino.Player.BlackJackPlayer;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BlackJackTest {
    Membership newMember = new Membership("jerm",9324,900,33);
    BlackJackPlayer testPlayer = new BlackJackPlayer(newMember);
    BlackJack blackJack = new BlackJack(newMember);
    //blackJack.currentPlayer = newMember;
    @Test
    public void playerBuilder() {
    }

    @Test
    public void dealCardsToPlayer() {
        testPlayer.getPlayerHand();

        Integer expected = 3;
        blackJack.dealCardsToPlayer(3,testPlayer);
        Integer actual = testPlayer.getPlayerHand().getHandOfCards().size();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void placeWagerTest() {
        Membership newMember = new Membership("jerm",9324,900,33);
        BlackJack blackJack = new BlackJack(newMember);
        BlackJackPlayer testPlayer = new BlackJackPlayer(newMember);

        Integer actual = blackJack.placeWager(100,testPlayer);

//        Integer actual = blackJack.currentPlayer.getBalance();

        Integer expected = 800;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void addWinnings() {
    }

    @Test
    public void subtractLoses() {
    }

    @Test
    public void checkPlayerBalances() {
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
    public void startGame() {

    }
}