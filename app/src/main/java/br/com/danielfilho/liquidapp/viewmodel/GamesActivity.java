package br.com.danielfilho.liquidapp.viewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import br.com.danielfilho.liquidapp.R;
import br.com.danielfilho.liquidapp.adapters.GameAdapter;
import br.com.danielfilho.liquidapp.data.GameData;
import br.com.danielfilho.liquidapp.model.Game;

public class GamesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);

        // Recyclerview configuration
        RecyclerView rv_games_list = findViewById(R.id.rv_games_list);
        rv_games_list.setLayoutManager(new LinearLayoutManager(this));
        rv_games_list.setAdapter(new GameAdapter(GameData.getLiquidGames()));

    }
}