package io.zipcoder.casino.GameClasses;

import io.zipcoder.casino.Player.Player;

public interface GamblingGame {
    Integer betsOnTable = null;

    public Integer placeWager(Integer moneyToWager);

    public Integer addWinnings(Integer moneyWon);

    public Integer subtractLoses(Integer moneyLost);

    public Boolean checkPlayerBalances(Player player
    );

}
