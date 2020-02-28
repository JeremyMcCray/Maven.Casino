package io.zipcoder.casino.Player;

import io.zipcoder.casino.GameClasses.CardGames.Card;
import io.zipcoder.casino.GameClasses.CardGames.EnumSuit;

import java.util.ArrayList;

public class Hand {
    ArrayList<Card> handOfCards = new ArrayList<Card>();

    public Hand(){
    }


    public void clearHand(){
        handOfCards.clear();

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
        boolean isInHAnd = false;

        for (Card cards: handOfCards) {
            if (cards.getSuit().equals(cardToCheck.getSuit()) && cards.getRank().equals(cardToCheck.getRank())){
             isInHAnd = true;
            }else{
                isInHAnd = false;
            }

        }
        return isInHAnd;
    }

    @Override
    public String toString(){
        String cardsInHand = "";
        for (Card element: handOfCards) {
            String suite = "";
            if(element.getSuit().equals(EnumSuit.diamonds)){
                suite += "<>";
            }else if(element.getSuit().equals(EnumSuit.hearts)){
                suite += "<3";
            }else if(element.getSuit().equals(EnumSuit.spades)){
                suite += "SPD";
            }else if(element.getSuit().equals(EnumSuit.clubs)){
                suite += ">|<";
            }
            cardsInHand+="              [ " + element.getRank() +" - "+  suite + "]" +"\n";
        }
        return cardsInHand;
    }

    public String stringOfCardsInHandCurrently(){
        String cardsInHand = "";
        for (Card element: handOfCards) {

            cardsInHand+= "[ " + element.getRank() +" of "+  element.getSuit() + "] ";

        }
        return cardsInHand;
    }

}
