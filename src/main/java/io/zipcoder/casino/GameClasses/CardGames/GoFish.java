package io.zipcoder.casino.GameClasses.CardGames;

import io.zipcoder.casino.CasinoClasses.Membership;
import io.zipcoder.casino.GameClasses.Game;
import io.zipcoder.casino.Player.Dealer;
import io.zipcoder.casino.Player.GoFishPlayer;
import io.zipcoder.casino.Player.Player;
import io.zipcoder.casino.Player.Hand;
import io.zipcoder.casino.utilities.Console;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class GoFish implements Game {

    private Player player;
    private Integer num0fPlayers;
    private Hand playerHand;
    private Hand dealerHand;
    private Card card;
    private Dealer gfDealer = new Dealer();
    private Console console = new Console(System.in, System.out);


    private ArrayList<Integer> playerFile;
    private ArrayList<Integer> opponentFile;

    private boolean endGameCheck;
    private boolean win;
    private int turnOrder;

    Deck deck = new Deck().shuffle();


    public int randomTurnOrder() {
        Random random = new Random();
        return random.nextInt(2);
    }

    // start the game

    public void startGame(Membership currentMembership) {
        GoFishPlayer currentPlayer= new GoFishPlayer(currentMembership);

        System.out.println("             Welcome to Go Fish             : " + currentMembership.getName()+"\n");
        playerHand = new Hand();
        dealerHand = new Hand();
        // playerFile = new ArrayList<Integer>(13);
        // opponentFile = new ArrayList<Integer>(13);
        endGameCheck = false;
        turnOrder = randomTurnOrder();
        for(int i=0; i<7;i++) {
            playerHand.addCardToHand(deck.draw());
            dealerHand.addCardToHand(deck.draw());
        }
        //                 "               Invalid Entry                : "
        //int cardNum = 1;
        System.out.println("              Here is your Deck             : " +"\n");
        System.out.println(playerHand.toString()+"\n");
        System.out.println("Player hand is --> "+playerHand.getHandOfCards().size());
    }

    public void playerTurn(Card cardInHand) {
        if (dealerHand.checkIfCardIsInHand(cardInHand)) {
            playerHand.addCardToHand(cardInHand);
        } else
            console.println("Go fish! draw your card " + GoFish(playerHand,cardInHand));

    }


    // when any player says GoFish
    public String GoFish(Hand hands,Card cardToBeAddedToHand) {
        System.out.println("I am here 1 ");
        if (deck.isEmpty()) {
            System.out.println("I am here 2 ");
            return "No Cards in Deck";

        } else {
            System.out.println("I am here 3 ");
            hands.addCardToHand(cardToBeAddedToHand);
            System.out.println("I am here 4");
            return hands.toString();
        }
    }





    public Boolean quitGame() {
        return null;
    }

    public Boolean win() {
        return null;
    }

    public Boolean playAgain() {
        return null;
    }

    public Player playerBuilder(Membership membership) {
        return null;
    }

    public Player playerBuilder() {
        return null;
    }


    public Boolean isTurn() {
        return null;
    }

    public Card dealCards(Integer numberOfCards) {
        return null;
    }
//
//    @Override
//     void toString(){
//        return this
//    }
}

