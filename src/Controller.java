import java.util.Scanner;

/**
 * Title: Blackjack
 * Created by Alex Babou on 5/23/21.
 */
public class Controller extends View {
    boolean gameStatus = false;

    void run() {
        Scanner scnr = new Scanner(System.in);
        splashScreen();
        gameStatus = true;

        while (gameStatus) {
            processCmds(scnr.next());
        }
        endScreen();
    }

    void gameStart() {
        startScreen();
        bettingScreen();
    }

    void processCmds(String cmd) {
        switch (cmd) {
            case "start", "restart" -> gameStart();
            case "exit" -> gameStatus = false;
            case "h", "H" -> {
                hit();
                if (!stand) dealerScreen();
                else dealerScreen2();
            }
            case "s", "S" -> {
                stand();
                dealerScreen2();
            }
            case "ok" -> {
                playerDeck.clear();
                dealerDeck.clear();
                player.setBet(0);
                stand = false;
                bettingScreen();
            }
            default -> {
                menuScreen();
                gameControls();
            }
        }
    }
}
