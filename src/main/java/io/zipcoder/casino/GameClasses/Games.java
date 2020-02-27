package io.zipcoder.casino.GameClasses;

import io.zipcoder.casino.CasinoClasses.Membership;
import io.zipcoder.casino.Player.Player;

import java.util.ArrayList;

public abstract class Games implements Game{
    private static String nameOfGame = "";
    private static ArrayList currentPlayers = new ArrayList(){};
    private static Integer numOfPlayers = currentPlayers.size();

    public static void startGame(){
        numOfPlayers = currentPlayers.size();
        String welcome = "Welcome to the " + nameOfGame + " table, ";
        for (int i = 0;i < numOfPlayers;i++){
            if (i == numOfPlayers - 1) {
                welcome += currentPlayers.get(i);
            } else {
                welcome += currentPlayers.get(i) + ", ";
            }
            welcome += "!";
        }
    };

    public Boolean quitGame(){
        return true;
    };

    public Boolean win() {
        return true;

    }

    public Boolean playAgain(){
        return true;
    };

    public Player playerBuilder(Membership membership) {

        return null;
    }

    public Boolean isTurn(){
        return true;
    }

    public Integer getNumOfPlayers() {
        return numOfPlayers;
    }

    public static ArrayList getCurrentPlayers() {
        return currentPlayers;
    }

    public static void setCurrentPlayers(ArrayList currentPlayers) {
        Games.currentPlayers = currentPlayers;
    }

    public static void setNumOfPlayers(Integer numOfPlayers) {
        Games.numOfPlayers = numOfPlayers;
    }

    public static String getNameOfGame() {
        return nameOfGame;
    }

    public static void setNameOfGame(String nameOfGame) {
        Games.nameOfGame = nameOfGame;
    }
}
