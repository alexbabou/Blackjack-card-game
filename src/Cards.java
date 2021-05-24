/**
 * Title: Blackjack
 * Created by Alex Babou on 5/23/21.
 */
public enum Cards {
    ace, two, three, four, five, six, seven, eight, nine, ten, jack, queen, king;

    @Override
    public String toString() {
        String rtn;
        switch (this) {
            case ace -> rtn = "A";
            case two -> rtn = "2";
            case three -> rtn = "3";
            case four -> rtn = "4";
            case five -> rtn = "5";
            case six -> rtn = "6";
            case seven -> rtn = "7";
            case eight -> rtn = "8";
            case nine -> rtn = "9";
            case ten -> rtn = "10";
            case jack -> rtn = "J";
            case queen -> rtn = "Q";
            case king -> rtn = "K";
            default -> rtn = null;
        }
        return rtn;
    }
    public int toInt() {
        int rtn;
        switch (this) {
            case ace -> rtn = 11;
            case two -> rtn = 2;
            case three -> rtn = 3;
            case four -> rtn = 4;
            case five -> rtn = 5;
            case six -> rtn = 6;
            case seven -> rtn = 7;
            case eight -> rtn = 8;
            case nine -> rtn = 9;
            case ten, jack, queen, king -> rtn = 10;
            default -> rtn = 0;
        }
        return rtn;
    }
}
