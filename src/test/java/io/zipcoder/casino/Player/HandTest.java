package io.zipcoder.casino.Player;

import com.sun.org.apache.xpath.internal.operations.Bool;
import io.zipcoder.casino.GameClasses.CardGames.Card;
import io.zipcoder.casino.GameClasses.CardGames.Deck;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HandTest {
Hand handOfCards = new Hand();
Deck deckOfCards = new Deck();
    @Test
    public void addOneCardToHand() {
        //Given


        //When
        handOfCards.addCardToHand(deckOfCards.draw());
        //Then
        Integer actual = 1;

        Assert.assertTrue(handOfCards.handOfCards.size() == actual);
    }

    @Test
    public void removeCardFromHand() {
        //Given


        //When
        Card cardToRemove = handOfCards.addCardToHand(deckOfCards.draw());
        handOfCards.removeCardFromHand(cardToRemove);

        Integer actual = 0;

        Assert.assertTrue(handOfCards.handOfCards.size()==actual);
    }


    @Test
    public void checkIfCardIsInHand() {
    Card card = deckOfCards.draw();
    handOfCards.addCardToHand(card);
    Boolean actual = handOfCards.checkIfCardIsInHand(card);
    Boolean expected = true;
    Assert.assertEquals(expected,actual);

    }

    @Test
    public void checkIfCardIsNotInHand() {
        Card card = deckOfCards.draw();

        Boolean actual = handOfCards.checkIfCardIsInHand(card);
        Boolean expected = false;
        Assert.assertEquals(expected,actual);

    }
}