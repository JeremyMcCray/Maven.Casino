package io.zipcoder.casino.GameClasses.CardGames;


import io.zipcoder.casino.CasinoClasses.ConsoleInput;
import io.zipcoder.casino.CasinoClasses.ConsoleOutput;
import io.zipcoder.casino.CasinoClasses.Membership;
import io.zipcoder.casino.GameClasses.GamblingGame;
import io.zipcoder.casino.Player.BlackJackPlayer;
import io.zipcoder.casino.Player.Dealer;
import io.zipcoder.casino.Player.Hand;
import io.zipcoder.casino.Player.Player;
import io.zipcoder.casino.utilities.Console;

import java.util.ArrayList;
import java.util.Scanner;


public class BlackJack extends CardGame implements GamblingGame, ConsoleOutput,ConsoleInput {
  //  this is a temp membership for testing only public Membership tempMember = new Membership("Jeremy", 9999, 1000, 35);
    public BlackJackPlayer currentPlayer;
    public Dealer dealer = new Dealer();
    private ArrayList<BlackJackPlayer> listOfBlackJackPlayers = new ArrayList<BlackJackPlayer>();
    private Deck blackJackDeck = new Deck(7);
    private Integer currentPot = 0;
    private Boolean gameRunning = true;
    Console console = new Console(System.in,System.out);

    public void setUpGame(Membership member) {
        this.currentPlayer = new BlackJackPlayer(member);
       listOfBlackJackPlayers.add(this.currentPlayer);
        setNameOfGame("BlackJack");
        setCurrentPlayers(listOfBlackJackPlayers);
        startGame();
    }
    public Integer placeWager(Integer moneyToWager, BlackJackPlayer playerToCheckBalance) {
        if(playerToCheckBalance.getBJPlayerBalance() >= moneyToWager){
            currentPot+=moneyToWager;
            playerToCheckBalance.setBJPlayerBalance(playerToCheckBalance.getBJPlayerBalance()-moneyToWager);
            return playerToCheckBalance.getBJPlayerBalance();
        }
       return 0;
    }
    public Integer sumAllCardsInAHand(BlackJackPlayer playToSumHand){
        Hand handToSum = playToSumHand.getPlayerHand();
        Integer sumOfCards =0;
        for(Card element: handToSum.getHandOfCards()) {
           if(EnumRank.valueOf(element.getRank().toString()).toString().equals("ace")){
               sumOfCards += 1;
           } else if(EnumRank.valueOf(element.getRank().toString()).toString().equals("two")){
                sumOfCards += 2;
           } else if(EnumRank.valueOf(element.getRank().toString()).toString().equals("three")){
               sumOfCards += 3;
           } else if(EnumRank.valueOf(element.getRank().toString()).toString().equals("four")){
               sumOfCards += 4;
           } else if(EnumRank.valueOf(element.getRank().toString()).toString().equals("five")){
               sumOfCards += 5;
           } else if(EnumRank.valueOf(element.getRank().toString()).toString().equals("six")){
               sumOfCards += 6;
           } else if(EnumRank.valueOf(element.getRank().toString()).toString().equals("seven")){
               sumOfCards += 7;
           } else if(EnumRank.valueOf(element.getRank().toString()).toString().equals("eight")){
               sumOfCards += 8;
           } else if(EnumRank.valueOf(element.getRank().toString()).toString().equals("nine")){
               sumOfCards += 9;
           } else if(EnumRank.valueOf(element.getRank().toString()).toString().equals("ten")){
               sumOfCards += 10;
           }else if(EnumRank.valueOf(element.getRank().toString()).toString().equals("jack")){
               sumOfCards += 10;
           }else if(EnumRank.valueOf(element.getRank().toString()).toString().equals("queen")){
               sumOfCards += 10;
           }else if(EnumRank.valueOf(element.getRank().toString()).toString().equals("king")){
               sumOfCards += 10;
           }
        }
        return sumOfCards;
    }


    public void startGame(Membership member) {
        setUpGame(member);
        Scanner input = new Scanner(System.in);
        blackJackDeck.shuffle();
        do{
            System.out.println("Welcome to the Blackjack table");

            Integer bet = console.getIntegerInput("What would you like your bet to be?");
            placeWager(bet,currentPlayer);
            currentPlayer.getPlayerHand().addCardToHand(dealer.dealCard(blackJackDeck));
            System.out.println("you were dealt a " + currentPlayer.getPlayerHand().stringOfCardsInHandCurrently());
            dealer.getDealerHand().addCardToHand(dealer.dealCard(blackJackDeck));
            System.out.println("the dealer drew " + dealer.getDealerHand().stringOfCardsInHandCurrently());
            currentPlayer.getPlayerHand().addCardToHand(dealer.dealCard(blackJackDeck));
            System.out.println("your hand is currently " + currentPlayer.getPlayerHand().stringOfCardsInHandCurrently());
            dealer.getDealerHand().addCardToHand(dealer.dealCard(blackJackDeck));
            String playerChoice = console.getStringInput("Do you want to Hit or Stand? ");

            if(!hitOrStand(playerChoice).equals("hit") || !hitOrStand(playerChoice).equals("stand") || !hitOrStand(playerChoice).equals("Bust! :(")){
                do{
                    System.out.println("Just Hit again idk at this point why you have to but do it please");
                     playerChoice = input.nextLine();
                } while(hitOrStand(playerChoice).equals("Bad Input"));
            }
//            String playerAnswer = console.getStringInput("Press 1 to play again or 2 to go back to casino");
//            if(playerAnswer.equals("1")){
//                currentPlayer.getPlayerHand().clearHand();
//                dealer.getDealerHand().clearHand();
//                gameRunning=true;
//
//            }else{
//                gameRunning = false;
//            }
            gameRunning=false;
        }while(gameRunning);

    }


    @Override
    public Player playerBuilder(Membership membership) {
        currentPlayer = new BlackJackPlayer(membership);
        return super.playerBuilder(membership);
    }


    public Hand dealCardToPlayer( BlackJackPlayer playerWhoGetsCards) {

            Card tempCard = blackJackDeck.draw();
            playerWhoGetsCards.getPlayerHand().addCardToHand(dealer.dealCard(blackJackDeck));



        return playerWhoGetsCards.getPlayerHand();

    }


    public String hitOrStand(String hitOrStandOnHand){

        if(hitOrStandOnHand.toLowerCase().equals("hit")) {
            currentPlayer.getPlayerHand().addCardToHand(dealer.dealCard(blackJackDeck));
            System.out.println("your hand is now " + currentPlayer.getPlayerHand().stringOfCardsInHandCurrently());
            System.out.println("your hand sum is " + sumAllCardsInAHand(currentPlayer) + "");

            if(sumAllCardsInAHand(currentPlayer).equals(21)){
                console.print("BlackJack!");
                currentPlayer.gameBalance+= currentPot;
                currentPot = 0;

            }else if(sumAllCardsInAHand(currentPlayer)>21){
                console.print("Bust! :(");
                currentPot = 0;
                return "Bust! :(";

            }else {
                hitOrStandOnHand = console.getStringInput("Hit again or stand?");

                hitOrStand(hitOrStandOnHand);

                return "hart";
            }
        }else if(hitOrStandOnHand.toLowerCase().equals("stand")){
            System.out.println("You stand with the hand " + currentPlayer.getPlayerHand().stringOfCardsInHandCurrently()+"\n"+"Your hand sum was" + sumAllCardsInAHand(currentPlayer));

            System.out.println("The dealer has " + dealer.getDealerHand().stringOfCardsInHandCurrently());
            return "Stand";
        }else{
            System.out.println("Please enter Hit or Stand");
            return "Bad Input";
        }
        return "";
    }


 //////these methods are useless as far as I canTell//


    public Integer addWinnings(Integer moneyWon) {
        return null;
    }


    public Integer subtractLoses(Integer moneyLost) {
        return null;
    }


    public Boolean checkPlayerBalances(Player player) {

        return null;
    }


    public Integer placeWager(Integer moneyToWager, Player playerToCheckBalance) {
        return null;
    }

    public Boolean loseCheckerTrueMeansLose(BlackJackPlayer playerToTestIfWon){
        if(sumAllCardsInAHand(playerToTestIfWon) > 21){
            return true;
        }
        return false;
    }


    public void startGame() {

    }



    public Boolean quitGame(int newBalance) {

        return null;
    }


    @Override
    public String getNextPlay() {
        return null;
    }

    public String displayGameState() {
        return null;
    }


    public String displayNextAction() {
        return null;
    }


    public Hand dealCards(Integer numberOfCards, Player playerWhoGetsCard) {
        return null;
    }

}
