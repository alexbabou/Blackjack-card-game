import java.util.ArrayList;

/**
 * Title: Blackjack
 * Created by Alex Babou on 5/23/21.
 */
public class Mechanics {
    Deck gameDeck = new Deck();
    ArrayList<Cards> playerDeck = new ArrayList<>();
    ArrayList<Cards> dealerDeck = new ArrayList<>();

    void initGame() {
        playerDeck.add(gameDeck.takeCard());
        dealerDeck.add(gameDeck.takeCard());
        playerDeck.add(gameDeck.takeCard());
        dealerDeck.add(gameDeck.takeCard());
    }

    String dealerCards() {
        return "X " + dealerDeck.get(1).toString();
    }

    String playerCards() {
        String rtn = "";
        for (Cards card : dealerDeck) {
            rtn += card.toString() + " ";
        }
        return rtn;
    }
}
