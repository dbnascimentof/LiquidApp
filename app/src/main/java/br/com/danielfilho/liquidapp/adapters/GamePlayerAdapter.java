package br.com.danielfilho.liquidapp.adapters;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.com.danielfilho.liquidapp.R;
import br.com.danielfilho.liquidapp.model.Player;

public class GamePlayerAdapter extends RecyclerView.Adapter<GamePlayerAdapter.GamePlayerViewHolder> {
    private List<Player> gamePlayers;

    public GamePlayerAdapter(List<Player> gamePlayers) {
        this.gamePlayers = gamePlayers;
    }

    @NonNull
    @Override
    public GamePlayerAdapter.GamePlayerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_game_player_list_item, parent, false);
        return new GamePlayerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GamePlayerAdapter.GamePlayerViewHolder holder, int position) {
        ImageView gamePlayerPhoto = holder.itemView.findViewById(R.id.img_game_player_avatar);
        gamePlayerPhoto.setImageResource(gamePlayers.get(position).getPhoto());

        TextView gamePlayerName = holder.itemView.findViewById(R.id.txt_game_player_name);
        gamePlayerName.setText(gamePlayers.get(position).getName());

        TextView gamePlayerNickname = holder.itemView.findViewById(R.id.txt_game_player_nickname);
        gamePlayerNickname.setText(gamePlayers.get(position).getNickname());
    }

    @Override
    public int getItemCount() {
        return gamePlayers.size();
    }

    public static class GamePlayerViewHolder extends RecyclerView.ViewHolder {

        public GamePlayerViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
