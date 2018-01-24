package example.codeclan.com.rockpaperscissors;

/**
 * Created by davidrawson on 24/01/2018.
 */

class Game {

    private String hand1;
    private String hand2;

    public Game(String hand1, String hand2) {
        this.hand1 = hand1;
        this.hand2 = hand2;
        }

    public String play() {

        if (hand1 == hand2) {
            return "it's a draw";
        }

        if (hand1 == "rock") {
            if (hand2 == "paper") {
                return "paper wins against rock";
            } else {
                return "rock wins against scissors";
            }
        }

        if (hand1 == "paper") {
            if (hand2 == "rock") {
                return "paper wins against rock";
            } else {
                return "scissors wins against paper";
            }
        }

        if (hand1 == "scissors") {
            if (hand2 == "rock") {
                return "rock wins against scissors";
            } else {
                return "scissors wins against paper";
            }
        }

        return "something went wrong. invalid move.";
    }


}
