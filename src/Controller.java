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
        gameScreen();
    }

    void processCmds(String cmd) {
        switch (cmd) {
            case "s", "S" -> gameStart();
            case "x", "X" -> gameStatus = false;
            default -> menuScreen();
        }
    }
}
