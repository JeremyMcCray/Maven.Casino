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

    private Deck deck;

    // *******************************************************************************  start the game  ****************
    public void startGame(Membership currentMembership) {

        setUpGameAndPlayer(currentMembership);
        System.out.println("             Welcome to Go Fish             : " + "\n");
        System.out.println("              Here is your Deck             : " + "\n");
        System.out.println(playerHand.toString());

        boolean gameNotDone = true;

        while(gameNotDone == true){



        }




    }
    // *******************************************************************************  Player Turn   ******************
    private void playerTurn(){
        System.out.println("Your Turn : Ask AI for preffered Card : ");
    }


    // *******************************************************************************  Set Up Game   ******************
    public void setUpGameAndPlayer(Membership memberCredentials){
        GoFishPlayer currentPlayer= new GoFishPlayer(memberCredentials);
        playerHand = new Hand();
        dealerHand = new Hand();
        // playerFile = new ArrayList<Integer>(13);
        // opponentFile = new ArrayList<Integer>(13);
        endGameCheck = false;
        deck = new Deck();
        deck.shuffle();
        turnOrder = randomTurnOrder();
        for(int i=0; i<7;i++) {
            playerHand.addCardToHand(deck.draw());
            dealerHand.addCardToHand(deck.draw());
        }
    }
    // *******************************************************************************  Random Turn Order  *************
    public int randomTurnOrder() {
        Random random = new Random();
        return random.nextInt(2);
    }
    // *******************************************************************************  player Turn  *******************
    public void playerTurn(Card cardInHand) {
        if (dealerHand.checkIfCardIsInHand(cardInHand)) {
            playerHand.addCardToHand(cardInHand);
        } else
            console.println("Go fish! draw your card " + GoFish(playerHand,cardInHand));
    }
    // *******************************************************************************  Go Fish   **********************
    private String GoFish(Hand hands,Card cardToBeAddedToHand) {
        if (deck.isEmpty()) {
            return "No Cards in Deck";
        } else {

            hands.addCardToHand(cardToBeAddedToHand);
            return card.toString();
        }
    }

    // **********************************    METHODS INHERITED _ NOT BEING USED  ***************************************
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
}

