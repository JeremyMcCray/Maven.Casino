package io.zipcoder.casino.GameClasses.CardGames;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

public class DeckTest {
    @Test
    public void shuffleTest(){
        Deck newDeck = new Deck();
        Deck shuffled = newDeck.shuffle();
        Card expected = newDeck.getCurrentDeck().pop();
        Card actual = shuffled.getCurrentDeck().pop();

        Assert.assertFalse(expected==actual);

    }

    @Test
    public void drawTest(){
        Deck shuffled = new Deck().shuffle();
        Card expected = shuffled.getCurrentDeck().peek();
        Card actual = shuffled.draw();
        Assert.assertEquals(expected,actual);

    }

}