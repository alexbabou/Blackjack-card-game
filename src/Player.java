import java.util.ArrayList;

/**
 * Title: Blackjack
 * Created by Alex Babou on 5/23/21.
 */
public class Player {
    private String pName;
    private int pBal = 0;
    private int currentBet;

    Player() {
        this.pName = "Player";
        this.pBal = 15000;
    }

    Player(String pName) {
        this.pName = pName;
    }
    
    void setName(String pName) {
        this.pName = pName;
    }
    
    String getName() {
        return pName;
    }

    void setBalance(int pBal) {
        this.pBal = pBal;
    }

    int getBalance() {
        return pBal;
    }

    void setBet(int currentBet) {
        pBal -= currentBet;
        this.currentBet = currentBet;
    }

    int getBet() {
        return currentBet;
    }

    int win() {
        this.pBal += currentBet * 2;
        return currentBet * 2;
    }

    void draw() {
        this.pBal += currentBet;
    }
}
