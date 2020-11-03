package io.zipcoder.casino.GameClasses.CardGames;

import io.zipcoder.casino.CasinoClasses.Membership;
import io.zipcoder.casino.GameClasses.Game;

import io.zipcoder.casino.Player.Dealer;
import io.zipcoder.casino.Player.GoFishPlayer;
import io.zipcoder.casino.Player.Player;
import io.zipcoder.casino.Player.Hand;
import io.zipcoder.casino.utilities.Console;

import java.util.*;

import java.util.ArrayList;


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

    private Card cardToAskFor = null;

    // *******************************************************************************  start the game  ****************
    public void startGame(Membership currentMembership) {

        setUpGameAndPlayer(currentMembership);
        System.out.println("             Welcome to Go Fish             : " + "\n");
        System.out.println("              Here is your Deck             : " + "\n");
        System.out.println(playerHand.toString());
        System.out.println("            Here is Dealers Deck            : " + "\n");
        System.out.println(dealerHand.toString());


        boolean gameNotDone = true;

        while(gameNotDone == true){
            playerTurn();
            boolean isInHand = checkIfInHand(cardToAskFor,dealerHand);
            if(isInHand){
                System.out.println("Congrats You Guessed A Correct Number ");
            }else{
                System.out.println("Sorry Card Not Found but we have to logic");
            }
            gameNotDone = false;
        }




    }
    public boolean  checkIfInHand(Card cardToFind,Hand handToCheck){
        return handToCheck.checkIfCardIsInHand(cardToFind);
    }




    // *******************************************************************************  Player Turn   ******************
    private void playerTurn(){

        System.out.println("Your Turn : Ask AI for preferred Card : ");
        Card askedFor = collectCardChoice();
        boolean validCard = false;

        while(validCard == false){

            for(int x = 0; x <= playerHand.getHandOfCards().size() -1; x++){
                if(askedFor.getRank().equals(playerHand.getHandOfCards().get(x).getRank())){
                    cardToAskFor = askedFor;
                    validCard = true;
                    break;
                }
            }
            if(validCard == false){
                askedFor = collectCardChoice();
            }

        }
    }

    /*
        while(validCard == false){

        for(int x = 0; x <= playerHand.getHandOfCards().size() -1; x++){
            if(askedFor.getRank().equals(dealerHand.getHandOfCards().get(x).getRank())){
                numberFound++;
                validCard = true;
                cardToCheckFor = dealerHand.getHandOfCards().get(x);
            }
        }
        if(numberFound == 0){

        }

    }

     */

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
    public Card collectCardChoice(){
        //                 "Your Turn : Ask AI for preferred Card : "
        System.out.println("        [ 2 - 10 ] or [J Q K A]         ");
        System.out.print("       Card Must Be In Your Hand      : ");

        Scanner readInput = new Scanner(System.in);
        String userInput = readInput.nextLine();

        EnumRank tempRank = null;

        boolean stopPickingCard = false;

        while(stopPickingCard == false){
            if(userInput.equals("2")){
                tempRank = EnumRank.two;
                stopPickingCard = true;
            }else if(userInput.equals("3")){
                tempRank = EnumRank.three;
                stopPickingCard = true;
            }else if(userInput.equals("4")){
                tempRank = EnumRank.four;
                stopPickingCard = true;
            }else if(userInput.equals("5")){
                tempRank = EnumRank.five;
                stopPickingCard = true;
            }else if(userInput.equals("6")){
                tempRank = EnumRank.six;
                stopPickingCard = true;
            }else if(userInput.equals("7")){
                tempRank = EnumRank.seven;
                stopPickingCard = true;
            }else if(userInput.equals("8")){
                tempRank = EnumRank.eight;
                stopPickingCard = true;
            }else if(userInput.equals("9")){
                tempRank = EnumRank.nine;
                stopPickingCard = true;
            }else if(userInput.equals("10")){
                tempRank = EnumRank.ten;
                stopPickingCard = true;
            }else if(userInput.equals("J")){
                tempRank = EnumRank.jack;
                stopPickingCard = true;
            }else if(userInput.equals("Q")){
                tempRank = EnumRank.queen;
                stopPickingCard = true;
            }else if(userInput.equals("K")){
                tempRank = EnumRank.king;
                stopPickingCard = true;
            }else if(userInput.equals("A")){
                tempRank = EnumRank.ace;
                stopPickingCard = true;
            }else{
                //                 "        [ 2 - 10 ] or [J Q K A]         "
                System.out.print("Invalid Input:                Try Again : ");
                stopPickingCard = false;
                userInput = readInput.nextLine();
            }
        }
        Card actualcard = new Card(tempRank, null);

        return actualcard;
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

