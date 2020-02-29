package io.zipcoder.casino.GameClasses.CardGames;

import io.zipcoder.casino.CasinoClasses.Membership;
import io.zipcoder.casino.Player.Dealer;
import io.zipcoder.casino.Player.GoFishPlayer;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GoFishTest {
    GoFish game = new GoFish();
    Deck testDeck = new Deck().shuffle();
    Membership testMem = new Membership("Pete Best",1234,25,70);
    GoFishPlayer gfPlayer = new GoFishPlayer(testMem);
    Dealer gfDealer = new Dealer();

    @Test
    public void dealFirstCardsTestPlayer() {
        game.dealFirstCards(gfPlayer,2);
        int expected = 7;
        int actual = gfPlayer.getHandOfCards().getNumberOfCards();
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void dealFirstCardsTestDealer() {
        game.dealFirstCards(gfPlayer,2);
        int expected = 7;
        int actual = gfDealer.getHandOfCards().getNumberOfCards();
        Assert.assertEquals(expected,actual);
    }




}