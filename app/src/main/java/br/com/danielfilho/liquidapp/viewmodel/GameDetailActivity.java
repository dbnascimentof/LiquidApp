package br.com.danielfilho.liquidapp.viewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import br.com.danielfilho.liquidapp.R;
import br.com.danielfilho.liquidapp.adapters.GamePlayerAdapter;
import br.com.danielfilho.liquidapp.data.GameData;
import br.com.danielfilho.liquidapp.data.PlayerData;
import br.com.danielfilho.liquidapp.model.Game;
import br.com.danielfilho.liquidapp.model.Player;

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

            ImageView gameCover = findViewById(R.id.img_game_detail_cover);
            gameCover.setImageResource(game.getCoverImage());

            TextView gameTitle = findViewById(R.id.txt_game_detail_title);
            gameTitle.setText(game.getTitle());

            TextView gamePlatform = findViewById(R.id.txt_game_detail_platform);
            gamePlatform.setText(game.getPlatform());

            List<Player> gamePlayers = PlayerData.getPlayerByGame(game.getTitle());
            if (gamePlayers.size() != 0) {
                TextView txtGamePlayers = findViewById(R.id.txt_game_detail_players);
                txtGamePlayers.setVisibility(View.VISIBLE);

                RecyclerView rv_game_players = findViewById(R.id.rv_game_players_list);
                rv_game_players.setLayoutManager(new GridLayoutManager(this, 3));
                rv_game_players.setAdapter(new GamePlayerAdapter(gamePlayers));
            }
        }
    }
}