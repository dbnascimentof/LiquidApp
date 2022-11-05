package br.com.danielfilho.liquidapp.viewmodel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import br.com.danielfilho.liquidapp.R;
import br.com.danielfilho.liquidapp.data.GameData;
import br.com.danielfilho.liquidapp.model.Game;

public class GameDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_detail);

        // Recovering gameId information from the intent.
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int gameId = extras.getInt("gameId");
            Game game = GameData.getGameById(gameId);

            TextView gameTitle = findViewById(R.id.txt_game_detail_title);
            gameTitle.setText(game.getTitle());

            TextView gamePlatform = findViewById(R.id.txt_game_detail_platform);
            gamePlatform.setText(game.getPlatform());
        }
    }
}