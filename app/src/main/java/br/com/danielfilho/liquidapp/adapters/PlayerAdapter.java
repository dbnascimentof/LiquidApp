package br.com.danielfilho.liquidapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.com.danielfilho.liquidapp.R;
import br.com.danielfilho.liquidapp.model.Game;
import br.com.danielfilho.liquidapp.model.Player;

public class PlayerAdapter extends RecyclerView.Adapter<PlayerAdapter.GameViewHolder>{

    private List<Player> liquidPlayers;

    public PlayerAdapter(List<Player> liquidPlayers) {
        this.liquidPlayers = liquidPlayers;
    }

    @NonNull
    @Override
    public GameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_players_list_item, parent, false);
        return new GameViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GameViewHolder holder, int position) {
        CardView playerCard = holder.itemView.findViewById(R.id.card_player);
        playerCard.setOnClickListener(View -> {
            Toast.makeText(playerCard.getContext(), "Click on " + liquidPlayers.get(position).getName(),Toast.LENGTH_SHORT).show();
        });

        ImageView playerPhoto = holder.itemView.findViewById(R.id.img_player_image);
        playerPhoto.setImageResource(liquidPlayers.get(position).getPhoto());

        TextView playerName = holder.itemView.findViewById(R.id.txt_player_name);
        playerName.setText(liquidPlayers.get(position).getName());

        TextView playerNickname = holder.itemView.findViewById(R.id.txt_player_nickname);
        playerNickname.setText(liquidPlayers.get(position).getNickname());

        TextView playerCountry = holder.itemView.findViewById(R.id.txt_player_country);
        playerCountry.setText(liquidPlayers.get(position).getCountry());
    }

    @Override
    public int getItemCount() {
        return liquidPlayers.size();
    }

    public static class GameViewHolder extends RecyclerView.ViewHolder {

        public GameViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
