package io.zipcoder.casino.GameClasses.DiceGames;


import io.zipcoder.casino.CasinoClasses.Membership;
import io.zipcoder.casino.Player.CrapsPlayer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

public class CrapsTest {
    Membership testMem = new Membership("Bugs Bunny",1234,2000,50);
    CrapsPlayer testPlayer = new CrapsPlayer(testMem);

    @Test
    public void addWinningsToPlayerBalanceTest() {
        Craps.addWinningsToPlayerBalance(testPlayer,100);
        Integer actual = testPlayer.getGameBalance();
        Integer expected = 2100;
        Assert.assertEquals(expected,actual);
    }
}