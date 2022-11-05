package br.com.danielfilho.liquidapp.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import br.com.danielfilho.liquidapp.R;
import br.com.danielfilho.liquidapp.model.Game;
import br.com.danielfilho.liquidapp.model.Player;

public final class PlayerData {
    private final static List<Player> liquidPlayers = new ArrayList<>(Arrays.asList(
        new Player("Mikolaj Ogonowski", "Elazer", 24, "Poland", R.drawable.elazer, GameData.getGameByTitle("Starcraft")),
        new Player("Clement Desplanches", "Clem", 20, "France", R.drawable.clem, GameData.getGameByTitle("Starcraft")),
        new Player("Diego Schwimer", "Kelazhur", 00, "Brazil", R.drawable.kelazhur, GameData.getGameByTitle("Starcraft")),
        new Player("Grzegorz Komincz", "MaNa", 28, "Poland", R.drawable. mana, GameData.getGameByTitle("Starcraft")),
        new Player("Daniel Nascimento", "dnascimento", 34, "Brazil", 0, GameData.getGameByTitle("GTA V"))
    ));

    public static List<Player> getPlayers(){
        return liquidPlayers;
    }

    public static List<Player> getPlayerByCountry(){
        return null;
    }

    public static List<Player> getPlayerByNickName(String nickname) {
        return null;
    }

    public static List<Player> getPlayerByGame(String gameTitle) {
        List<Player> gamePlayers = new ArrayList<>();
        for (Player player : liquidPlayers) {
            for (Game game : player.getPlayedGames()) {
                if (game.getTitle().equals(gameTitle)) {
                    gamePlayers.add(player);
                }
            }
        }
        return gamePlayers;
    }
}
