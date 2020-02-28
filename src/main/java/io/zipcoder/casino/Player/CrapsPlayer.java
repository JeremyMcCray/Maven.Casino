package io.zipcoder.casino.Player;

import io.zipcoder.casino.CasinoClasses.Membership;

public class CrapsPlayer extends Player implements GamblerAttributes{

    String playerName = "";

    public Integer getGameBalance() {
        return gameBalance;
    }

    public void setGameBalance(Integer gameBalance) {
        this.gameBalance = gameBalance;
    }

    Integer gameBalance = 0;
    Integer age;
    Membership playerAccount;

    public CrapsPlayer(Membership playerAccount){

        this.playerName = playerAccount.getName();
        this.gameBalance = playerAccount.getBalance();
        this.age = playerAccount.getAge();
        this.playerAccount = playerAccount;
    }

    public Integer placeBet(Integer bet){
        Integer betPlaced = 0;

        return betPlaced;
    }



}
