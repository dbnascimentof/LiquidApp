package br.com.danielfilho.liquidapp.viewmodel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import br.com.danielfilho.liquidapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_tournaments = findViewById(R.id.btn_tournaments);
        btn_tournaments.setOnClickListener(View -> {
            Toast.makeText(this, "Click on Tournaments", Toast.LENGTH_LONG).show();
        });

        Button btn_games = findViewById(R.id.btn_games);
        btn_games.setOnClickListener(View -> {
            Toast.makeText(this, "Click on Game", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, GamesActivity.class);
            startActivity(intent);
        });

    }
}