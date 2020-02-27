package io.zipcoder.casino.Player;

import io.zipcoder.casino.CasinoClasses.Membership;
import io.zipcoder.casino.GameClasses.GamblingGame;

public class BlackJackPlayer extends CardPlayer implements GamblerAttributes{
        String playerName = "";
        public Integer balance;
        Integer age;
        Membership playerAccount;
        Hand playerHand;

    public BlackJackPlayer(Membership playerAccount){
            this.playerName = playerAccount.getName();
            this.balance = playerAccount.getBalance();
            this.age = playerAccount.getAge();
            this.playerAccount = playerAccount;
            this.playerHand = new Hand();
    }


    public Integer getBJPlayerBalance() {
        return this.balance;
    }

    public Integer placeBet(Integer bet){
        Integer betPlaced = 0;

        return betPlaced;
    }
    public Hand getPlayerHand(){
        return this.playerHand;
    }
}