/**
 * Title: Blackjack
 * Created by Alex Babou on 5/23/21.
 */
public class Main {
    public static void main(String args[]) {
        if (args[0].contains("debug")) {
            Test debug = new Test();
        } else {
            Controller gameController = new Controller();
            gameController.start();
        }
    }
}
