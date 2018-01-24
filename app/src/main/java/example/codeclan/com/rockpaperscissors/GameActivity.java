package example.codeclan.com.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    TextView moveText;
//    View rockButton;
//    View paperButton;
//    View scissorsButton;
//    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        moveText = findViewById(R.id.computer_move);


    }

    public void onRockButtonClicked(View button){
        Move move = new Move();
        move.setUpMoves();
        String randomMove = move.getRandomMove();
        Game game = new Game(randomMove, "rock");
        String gameResult = game.play();
        TextView computersMove = findViewById(R.id.computer_move);
        computersMove.setText(randomMove);
        TextView resultView = findViewById(R.id.result);
        resultView.setText(gameResult.toString());
    }


    public void onPaperButtonClicked(View button){
        Move move = new Move();
        move.setUpMoves();
        String randomMove = move.getRandomMove();
        Game game = new Game(randomMove, "paper");
        String gameResult = game.play();
        TextView computersMove = findViewById(R.id.computer_move);
        computersMove.setText(randomMove);
        TextView resultView = findViewById(R.id.result);
        resultView.setText(gameResult.toString());
    }


    public void onScissorsButtonClicked(View button){
        Move move = new Move();
        move.setUpMoves();
        String randomMove = move.getRandomMove();
        Game game = new Game(randomMove, "scissors");
        String gameResult = game.play();
        TextView computersMove = findViewById(R.id.computer_move);
        computersMove.setText(randomMove);
        TextView resultView = findViewById(R.id.result);
        resultView.setText(gameResult.toString());
    }
}
