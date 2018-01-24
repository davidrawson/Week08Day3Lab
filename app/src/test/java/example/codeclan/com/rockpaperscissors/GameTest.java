package example.codeclan.com.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by davidrawson on 24/01/2018.
 */

public class GameTest {

    Game game1;
    Game game2;

    @Before
    public void before(){
        game1 = new Game("rock", "scissors");
    }

    @Test
    public void rockBeatsScissors(){
        Game game = new Game("rock", "scissors");
        assertEquals("rock wins against scissors", game.play());
    }

}
