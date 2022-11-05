package br.com.danielfilho.liquidapp.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

import br.com.danielfilho.liquidapp.R;
import br.com.danielfilho.liquidapp.model.Game;
import br.com.danielfilho.liquidapp.viewmodel.GameDetailActivity;

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.GameViewHolder>{

    private List<Game> liquidGames;

    public GameAdapter(List<Game> liquidGames) {
        this.liquidGames = liquidGames;
    }

    @NonNull
    @Override
    public GameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_games_list_item, parent, false);
        return new GameViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GameViewHolder holder, int position) {
        CardView gameCard = holder.itemView.findViewById(R.id.card_game);
        TextView gameTitle = holder.itemView.findViewById(R.id.txt_game_title);
        TextView gamePlatform = holder.itemView.findViewById(R.id.txt_game_platform);

        gameTitle.setText(liquidGames.get(position).getTitle());
        gamePlatform.setText(liquidGames.get(position).getPlatform());

        gameCard.setOnClickListener(View -> {
            Intent intent = new Intent(gameCard.getContext(), GameDetailActivity.class);
            intent.putExtra("gameId", liquidGames.get(position).getGameId());
            gameCard.getContext().startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return liquidGames.size();
    }

    public static class GameViewHolder extends RecyclerView.ViewHolder {

        public GameViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
