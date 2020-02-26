package io.zipcoder.casino.Player;

import io.zipcoder.casino.GameClasses.CardGames.Card;
import io.zipcoder.casino.GameClasses.CardGames.Deck;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DealerTest {

    @Test
    public void dealCardTest() {
        Dealer theDealer = new Dealer();
        Deck testDeck = new Deck().shuffle();
        Card expected = testDeck.getCurrentDeck().peek();
        Card actual = theDealer.dealCard(testDeck);
        Assert.assertEquals(expected,actual);

    }
}