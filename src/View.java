import java.util.Scanner;

/**
 * Title: Blackjack
 * Created by Alex Babou on 5/23/21.
 */
public class View extends Mechanics {
    Player player = new Player();
    Player dealer = new Player("Dealer", player.getBalance() * 10);

    private void renderText(String text) {
        System.out.println(text);
    }

    void splashScreen() {
        renderText("Welcome to BlackJack 1.0!");
        menuScreen();
    }

    void menuScreen() {
        renderText("(start) - Begin a new game\n" +
                "(exit) - Exit to IDE\n\n");
    }

    void gameControls() {
        renderText("Game Controls:\n" +
                "(H) - Hit\n" + "(S) - Stand\n");
    }

    void clearScreen() {
        renderText("\n\n\n\n\n\n\n\n\n\n\n");
    }

    void startScreen() {
        Scanner scnr = new Scanner(System.in);
        renderText("What would you like to be called? (String)");
        player.setName(scnr.next());
        renderText("How much would you like to start with? (Integer)");
        player.setBalance(scnr.nextInt());
    }

    void gameScreen() {
        initGame();
        clearScreen();
        bettingScreen();
        clearScreen();
        dealerScreen();
    }

    void bettingScreen() {
        Scanner scnr = new Scanner(System.in);
        renderText(String.format("_________________________\n" +
                "X                       X\n" +
                "X   How much would you  X\n" +
                "X      like to bet?     X\n" +
                "X_______________________X\n" +
                "Name: %s | Balance: %s\n", player.getName(), player.getBalance()));
        player.setBet(scnr.nextInt());
        dealer.addBal(player.getBet());
    }

    void dealerScreen() {
        renderText(String.format("_________________________\n" +
                "X Dealer Hand: %-8s X\n" +
                   "X                       X\n" +
                   "X Your Hand: %-10s X\n" +
                   "X_______________________X\n" +
                   "\nCurrent Bet: %s\n" +
                   "Name: %s | Balance: %s\n", dealerCards(), playerCards(), player.getBet(), player.getName(), player.getBalance()));
        gameControls();
    }

    void endScreen() {
        renderText("Thank you for playing!");
    }
}
