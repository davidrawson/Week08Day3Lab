package example.codeclan.com.rockpaperscissors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by davidrawson on 24/01/2018.
 */

public class Move {

    ArrayList<String> moveList;

    public void setUpMoves(){
        moveList = new ArrayList<>();
        moveList.add("rock");
        moveList.add("paper");
        moveList.add("scissors");
    }

    public ArrayList<String> getMoves(){
        return new ArrayList<>(this.moveList);
    }

    public String getRandomMove(){
        Collections.shuffle(this.moveList);
        return this.moveList.get(0);
    }
}
