package example.codeclan.com.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        TextView moveText = findViewById(R.id.computer_move);

        View rockButton = findViewById(R.id.rock);
        rockButton.setTag("rock");
        View paperButton = findViewById(R.id.paper);
        paperButton.setTag("paper");
        View scissorsButton = findViewById(R.id.scissors);
        scissorsButton.setTag("scissors");
    }

    public void onButtonClicked(View button){

        Move move = new Move();
        move.setUpMoves();
        String randomMove = move.getRandomMove();
//        Log.d(getClass().toString(), "button tag is "+ button.getTag());
        Game game = new Game(randomMove, button.getTag().toString());
        String gameResult = game.play();
        TextView computersMove = findViewById(R.id.computer_move);
        computersMove.setText(randomMove);
        TextView resultView = findViewById(R.id.result);
        resultView.setText(gameResult.toString());
    }

}
