/**
 * Title: Blackjack
 * Created by Alex Babou on 5/23/21.
 */
public class Player {
    private String pName;
    private int pBal;

    Player(String pName) {
        this.pName = pName;
        this.pBal = 15000;
    }

    Player(String pName, int pBal) {
        this.pName = pName;
        this.pBal = pBal;
    }
    
    void addBalance(int amount) {
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
}
