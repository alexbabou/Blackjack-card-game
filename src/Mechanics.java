import java.util.ArrayList;

/**
 * Title: Blackjack
 * Created by Alex Babou on 5/23/21.
 */
public class Mechanics {
    Deck gameDeck = new Deck();

    Player player = new Player();
    Player dealer = new Player("Dealer");

    ArrayList<Cards> playerDeck = new ArrayList<>();
    ArrayList<Cards> dealerDeck = new ArrayList<>();

    boolean stand = false;

    void initGame() {
        playerDeck.add(gameDeck.takeCard());
        dealerDeck.add(gameDeck.takeCard());
        playerDeck.add(gameDeck.takeCard());
        dealerDeck.add(gameDeck.takeCard());
    }

    String dealerCards(boolean show) {
        if (!show) {
            return "X " + dealerDeck.get(1).toString();
        } else {
            return displayCards(dealerDeck);
        }
    }

    String displayCards(ArrayList<Cards> deck) {
        StringBuilder rtn = new StringBuilder();
        for (Cards card : deck) {
            rtn.append(card.toString()).append(" ");
        }
        return rtn.toString();
    }

    int cardCounter(ArrayList<Cards> deck) {
        int count = 0;
        for (Cards card : deck) {
            count += card.toInt();
        }
        if (count > 21 && deck.contains(Cards.ace)) {
            count -= 10;
        }
        return count;
    }

    String gameOutcome() {
        int pcount = cardCounter(playerDeck);
        int dcount = cardCounter(dealerDeck);
        if (stand) {
            if (dcount < pcount && pcount < 22 ||
                    dcount > 21 && pcount < 22) {
                return String.format("%s, You won $%s!", pcount, player.win());
            }
            if (dcount == pcount) {
                return pcount + ", draw!";
            }
            return pcount + ", You lose.";
        }
        if (pcount == 21) {
            return pcount + ", Blackjack!";
        }
        return pcount + ", hit?";
    }

    void hit() {
        playerDeck.add(gameDeck.takeCard());
        if (cardCounter(playerDeck) >= 21) { stand(); }
    }

    void stand() {
        while (cardCounter(dealerDeck) < 17) {
            dealerDeck.add(gameDeck.takeCard());
        }
        stand = true;
    }
}
