package br.com.danielfilho.liquidapp.viewmodel;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
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
            Intent intent = new Intent(this, GamesActivity.class);
            startActivity(intent);
        });

        Button btn_players = findViewById(R.id.btn_players);
        btn_players.setOnClickListener(View -> {
            Intent intent = new Intent(this, PlayersActivity.class);
            startActivity(intent);
        });

        // Bottom navigation logic
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnItemSelectedListener(item ->{
            switch (item.getItemId()) {
                case R.id.menu_status:
                    Toast.makeText(this, "Click on Status", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.menu_experiences:
                    Toast.makeText(this, "Click on Experiences", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.menu_calendar:
                    Toast.makeText(this, "Click on Calendar", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.menu_store:
                    Intent storeIntent = new Intent(this, StoreActivity.class);
                    startActivity(storeIntent);
                    break;
                case R.id.menu_more:
                    Toast.makeText(this, "Click on More", Toast.LENGTH_SHORT).show();
                    break;
            }
            return true;
        });
    }
}