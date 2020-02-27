package io.zipcoder.casino.GameClasses.CardGames;

import io.zipcoder.casino.CasinoClasses.Membership;
import io.zipcoder.casino.GameClasses.Game;
import io.zipcoder.casino.GameClasses.Games;
import io.zipcoder.casino.Player.*;

import java.util.ArrayList;

public class GoFish extends CardGame {
    public GoFish(){}
    private Integer numOfPlayers = 0;
    private Dealer gfDealer = new Dealer();
    private Deck gfDeck = new Deck().shuffle();

    @Override
    public void startGame(Membership currentMembership) {

        GoFishPlayer currentPlayer = new GoFishPlayer(currentMembership);
        ArrayList currentPlayers = new ArrayList<GoFishPlayer>();
        currentPlayers.add(currentPlayer);
        GoFish.setNumOfPlayers(getCurrentPlayers().size());
        String welcome = "Welcome to the BlackJack table, ";
        for (int i = 0; i < numOfPlayers; i++) {
            if (i == numOfPlayers - 1) {
                welcome += currentPlayers.get(i);
            } else {
                welcome += currentPlayers.get(i) + ", ";
            }
            welcome += "!";
        }
    }

    public Hand dealFirstCards(GoFishPlayer gfPlayer, Integer numOfPlayers){
        for (int i = 0;i<7;i++){
            for (int j = 0;j<numOfPlayers;j++){
                gfDealer.dealCard(gfDeck, gfPlayer);
                gfDealer.dealCard(gfDeck, gfDealer);
            }
        }
        return gfPlayer.getHandOfCards();
    }




    @Override
    public Player playerBuilder() {
        return null;
    }

    @Override
    public Hand dealCards(Integer numberOfCards) {
        return null;
    }
}