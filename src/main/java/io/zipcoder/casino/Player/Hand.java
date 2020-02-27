package io.zipcoder.casino.Player;

import io.zipcoder.casino.GameClasses.CardGames.Card;

import java.util.ArrayList;

public class Hand {
    ArrayList<Card> handOfCards = new ArrayList<Card>();

    public Hand(){
    }

    public Card addCardToHand(Card cardToBeAddedToHand){

         handOfCards.add(cardToBeAddedToHand);
        return cardToBeAddedToHand;

    }
    public ArrayList<Card> getHandOfCards(){
        return this.handOfCards;
    }


    public Card removeCardFromHand(Card cardToBeRemovedToHand){

            handOfCards.remove(cardToBeRemovedToHand);
            return cardToBeRemovedToHand;

    }

    public Boolean checkIfCardIsInHand(Card cardToCheck){
        for (Card cards: handOfCards) {
            if (cards.getSuit().equals(cardToCheck.getSuit()) && cards.getRank().equals(cardToCheck.getRank())){
             return true;
            }

        }
        return false;
    }



    public String stringOfCardsInHandCurrently(){
        String cardsInHand = "";
        for (Card element: handOfCards) {
            cardsInHand+=element.getRank() +" of "+  element.getSuit();
        }
        return cardsInHand;
    }

}
