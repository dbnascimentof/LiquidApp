package br.com.danielfilho.liquidapp.viewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import br.com.danielfilho.liquidapp.R;
import br.com.danielfilho.liquidapp.adapters.GameAdapter;
import br.com.danielfilho.liquidapp.model.Game;

public class GamesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);

        // List of games played by Liquid Team.
        List<Game> liquidGames = new ArrayList<>();
        liquidGames.add(new Game("Rainbow Six", "Playstation 5"));
        liquidGames.add(new Game("Valorant", "PC"));
        liquidGames.add(new Game("Fortinite", "PC"));
        liquidGames.add(new Game("CS-GO", "PC"));
        liquidGames.add(new Game("Freefire", "PC"));
        liquidGames.add(new Game("Rocket League", "PC"));
        liquidGames.add(new Game("GTA V", "PC"));
        liquidGames.add(new Game("Fifa 23", "Playstation 5"));

        // Recyclerview configuration
        RecyclerView rv_games_list = findViewById(R.id.rv_games_list);
        rv_games_list.setLayoutManager(new LinearLayoutManager(this));
        rv_games_list.setAdapter(new GameAdapter(liquidGames));

    }
}