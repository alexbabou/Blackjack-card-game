import java.util.ArrayList;

/**
 * Title: Blackjack
 * Created by Alex Babou on 5/23/21.
 */
public class Player {
    private String pName;
    private int pBal;
    private int currentBet;

    Player() {
        this.pName = "Player";
        this.pBal = 15000;
    }

    Player(String pName, int pBal) {
        this.pName = pName;
        this.pBal = pBal;
    }

    void addBal(int amount) {
        pBal += amount;
    }
    
    void removeBal(int amount) {
        pBal -= amount;
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
        removeBal(currentBet);
        this.currentBet = currentBet;
    }

    int getBet() {
        return currentBet;
    }
}
