package io.zipcoder.casino.GameClasses.CardGames;


import io.zipcoder.casino.CasinoClasses.ConsoleInput;
import io.zipcoder.casino.CasinoClasses.ConsoleOutput;
import io.zipcoder.casino.CasinoClasses.Membership;
import io.zipcoder.casino.GameClasses.GamblingGame;
import io.zipcoder.casino.Player.BlackJackPlayer;
import io.zipcoder.casino.Player.Hand;
import io.zipcoder.casino.Player.Player;

import java.util.ArrayList;


public class BlackJack extends CardGame implements GamblingGame, ConsoleOutput,ConsoleInput {
    public Membership tempMember = new Membership("Jeremy", 9999, 1000, 35);
    public BlackJackPlayer currentPlayer;
    private ArrayList<BlackJackPlayer> listOfBlackJackPlayers;
    private Deck blackJackDeck = new Deck(7);
    private Integer currentWager = 0;

    public BlackJack(Membership member) {
        this.currentPlayer = new BlackJackPlayer(member);
        listOfBlackJackPlayers.add(this.currentPlayer);
        setNameOfGame("BlackJack");
        setCurrentPlayers(listOfBlackJackPlayers);
        startGame();
    }


    public void startGame() {

    }


    @Override
    public Player playerBuilder(Membership membership) {
        currentPlayer = new BlackJackPlayer(membership);
        return super.playerBuilder(membership);
    }


    public Hand dealCardsToPlayer(Integer numberOfCards, BlackJackPlayer playerWhoGetsCards) {
        for (int i = 0; i < numberOfCards; i++) {
            Card tempCard = blackJackDeck.draw();
            playerWhoGetsCards.getPlayerHand().getHandOfCards().add(tempCard);
        }

        return playerWhoGetsCards.getPlayerHand();
    }


    //public Integer placeWager(Integer moneyToWager, Player playerToCheckBalance) {
    //  return null;
    //}

    @Override
    public Integer placeWager(Integer moneyToWager, Player playerToCheckBalance) {
        return null;
    }

    @Override
    public Integer addWinnings(Integer moneyWon) {
        return null;
    }

    @Override
    public Integer subtractLoses(Integer moneyLost) {
        return null;
    }

    @Override
    public Boolean checkPlayerBalances(Player player) {
        return null;
    }


    @Override
    public String getNextPlay() {
        return null;
    }

    @Override
    public String displayGameState() {
        return null;
    }

    @Override
    public String displayNextAction() {
        return null;
    }

    @Override
    public Hand dealCards(Integer numberOfCards, Player playerWhoGetsCard) {
        return null;
    }


////////////this is uselessMethod////////////////
}
