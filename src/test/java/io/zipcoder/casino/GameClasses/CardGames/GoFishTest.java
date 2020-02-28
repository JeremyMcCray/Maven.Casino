package io.zipcoder.casino.GameClasses.CardGames;

import io.zipcoder.casino.CasinoClasses.Membership;
import io.zipcoder.casino.Player.GoFishPlayer;
import io.zipcoder.casino.Player.Hand;
import org.junit.Assert;
import org.junit.Test;

public class GoFishTest {

    GoFish goFish1 = new GoFish();

    @Test
    public void startGameTest() {
        Membership currentMembership = new Membership("Test Guy",1,100,18);
        //GoFishPlayer currentPlayer= new GoFishPlayer(currentMembership);
        goFish1.startGame(currentMembership);


    }

    @Test
    public void playerTurnTest() {
        //Card cardInHand = new Card();
       // goFish1.playerTurn(cardInHand);
    }

    @Test
    public void  GoFishTest () {

        Hand hands = new Hand();
        Deck newDeck = new Deck();
        Card actual = newDeck.draw();
        Card expected = newDeck.getCurrentDeck().pop();
        //System.out.println("In GoFishTest");
        String str = goFish1.GoFish(hands,expected);
       // System.out.println(" final str is --->"+str);


    }
}
