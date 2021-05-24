import java.util.Scanner;

/**
 * Title: Blackjack
 * Created by Alex Babou on 5/23/21.
 */
public class View extends Mechanics {

    private void renderText(String text) {
        System.out.println(text);
    }

    void splashScreen() {
        renderText("Welcome to BlackJack 1.0!\n");
        menuScreen();
    }

    void menuScreen() {
        renderText("""
                (start) - Begin a new game
                (exit) - Exit to IDE

                """);
    }

    void gameControls() {
        renderText("""
                Game Controls:
                (H) to Hit | (S) to Stand
                """);
    }

    void clearScreen() {
        renderText("\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    void startScreen() {
        Scanner scnr = new Scanner(System.in);
        clearScreen();
        renderText("""
                _________________________
                X                       X
                X  What would you like  X
                X     to be called?     X
                X_______________________X
                """);
        player.setName(scnr.next());
        clearScreen();
        renderText("""
                _________________________
                X                       X
                X  How much would you   X
                X  like to start with?  X
                X_______________________X
                """);
        player.setBalance(scnr.nextInt());
    }

    void bettingScreen() {
        clearScreen();
        if (player.getBalance() < 50) {
            renderText("""
                _________________________
                X       Game Over       X
                X                       X
                X    You lost it all.   X
                X_______________________X
                
                Type 'restart' or 'exit'
                """);
        } else {
            Scanner scnr = new Scanner(System.in);
            renderText(String.format("""
                    _________________________
                    X                       X
                    X    Place your bet:    X
                    X       (min: 50)       X
                    X_______________________X
                    Name: %s | Balance: %s
                    """, player.getName(), player.getBalance()));
            player.setBet(scnr.nextInt());
            if (player.getBet() < 50)
                bettingScreen();
            else {
                initGame();
                dealerScreen();
            }
        }
    }

    void dealerScreen() {
        clearScreen();
        gameControls();
        renderText(String.format("""
                        _________________________
                        X Dealer Hand: %-9sX
                        X Total:                X
                        X                       X
                        X Your Hand: %-10s X
                        X Total: %-14s X
                        X_______________________X
                        Current Bet: %s
                        Name: %s | Balance: %s
                        """, dealerCards(false), displayCards(playerDeck), cardCounter(playerDeck),
                player.getBet(), player.getName(), player.getBalance()));
    }

    void dealerScreen2() {
        clearScreen();
        renderText("//// " + gameOutcome() + " ////");
        renderText(String.format("""
                        _________________________
                        X Dealer Hand: %-8s X
                        X Total: %-14s X
                        X                       X
                        X Your Hand: %-10s X
                        X Total: %-14s X
                        X_______________________X
                        Current Bet: %s
                        Name: %s | Balance: %s
                        """, displayCards(dealerDeck), cardCounter(dealerDeck), displayCards(playerDeck), cardCounter(playerDeck),
                player.getBet(), player.getName(), player.getBalance()));

        renderText("Type 'ok' to continue...");
    }

    void endScreen() {
        clearScreen();
        renderText("Thank you for playing!");
    }
}
