import java.util.ArrayList;
import java.util.Collections;

/**
 * Title: Blackjack
 * Created by Alex Babou on 5/23/21.
 */
public class Deck {
    ArrayList<Cards> deck = new ArrayList<>();
    ArrayList<Cards> discard = new ArrayList<>();

    void createDeck(int decks) {
        for (Cards card : Cards.values()) {
            for (int i = 0; i < decks; i++) {
                deck.add(card);
            }
        }
        Collections.shuffle(deck);
    }

    void removeCard(Cards card) {
        deck.remove(card);
        discard.add(card);
    }

    void resetDeck() {
        deck.addAll(discard);
        Collections.shuffle(deck);
    }
}
