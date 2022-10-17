package br.com.danielfilho.liquidapp.viewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import br.com.danielfilho.liquidapp.R;
import br.com.danielfilho.liquidapp.adapters.PlayerAdapter;
import br.com.danielfilho.liquidapp.model.Player;

public class PlayersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players);

        // List of players from Liquid Team.
        List<Player> liquidPlayers = new ArrayList<>();
        liquidPlayers.add(new Player("Daniel Nascimento", "dnascimento", 34, "Brazil"));
        liquidPlayers.add(new Player("Gustavo Mendonça", "guuh", 19, "Brazil"));
        liquidPlayers.add(new Player("Jackson Nascimento", "Dah", 40, "Brazil"));

        // RecyclerView Configuration
        RecyclerView rv_players_list = findViewById(R.id.rv_players_list);
        rv_players_list.setLayoutManager(new LinearLayoutManager(this));
        rv_players_list.setAdapter(new PlayerAdapter(liquidPlayers));

    }
}