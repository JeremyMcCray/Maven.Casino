package io.zipcoder.casino.Player;

import io.zipcoder.casino.CasinoClasses.Membership;

public class CardPlayer extends Player{
    Hand hand = new Hand();

    public Hand getHandOfCards() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public CardPlayer (){
        String playerName = "";
        Integer balance = 0;
        Integer age;
        Membership playerAccount;
    }

    public Hand checkHand( Player playerName,Hand hand){


        return this.hand;

    }
}
