package io.zipcoder.casino.Player;

import io.zipcoder.casino.CasinoClasses.Membership;


public abstract class Player {
    private String playerName = "";
    private Integer balance = 0;
    private Integer age;
    private Membership player;
    private Hand hand;

    public Membership getPlayer() {
        return player;
    }

    public void setPlayer(Membership player) {
        this.player = player;
    }



    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }



    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }




    public Integer win(Integer amount){
        Integer amountWon =0;

        return amountWon;
    }

    public Integer lose(Integer amount){
        Integer amountLost = 0;

        return amountLost;
    }


}
