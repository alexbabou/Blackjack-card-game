/**
 * Title: Blackjack
 * Created by Alex Babou on 5/23/21.
 */
public class View {
    private void renderText(String text) {
        System.out.println(text);
    }

    void startScreen() {
        renderText("Welcome to BlackJack 1.0!");
        menuScreen();
    }

    void menuScreen() {
        renderText("(S) - Start a new game\n" +
                "(X) - Exit to IDE\n");
    }

    void endScreen() {
        renderText("Thank you for playing!");
    }
}
