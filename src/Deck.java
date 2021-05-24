import java.util.ArrayList;
import java.util.Collections;

/**
 * Title: Blackjack
 * Created by Alex Babou on 5/23/21.
 */
public class Deck {
    ArrayList<Cards> deck = new ArrayList<>();
    ArrayList<Cards> discard = new ArrayList<>();

    Deck() {
        createDeck();
    }

    void createDeck() {
        for (Cards card : Cards.values()) {
            for (int i = 0; i < 4; i++) {
                deck.add(card);
            }
        }
        Collections.shuffle(deck);
    }

    Cards takeCard() {
        if (deck.isEmpty()) { resetDeck(); }
        Cards card = deck.remove(0);
        discard.add(card);
        return card;
    }

    void resetDeck() {
        deck.addAll(discard);
        Collections.shuffle(deck);
    }
}
