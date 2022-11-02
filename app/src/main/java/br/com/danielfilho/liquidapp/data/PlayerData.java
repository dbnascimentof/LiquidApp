package br.com.danielfilho.liquidapp.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import br.com.danielfilho.liquidapp.model.Game;
import br.com.danielfilho.liquidapp.model.Player;

public final class PlayerData {
    private final static List<Player> liquidPlayers = new ArrayList<>(Arrays.asList(
        new Player("Mikolaj Ogonowski", "Elazer", 24, "Poland", GameData.getGameByTitle("Starcraft")),
        new Player("Clement Desplanches", "Clem", 20, "France", GameData.getGameByTitle("Starcraft")),
        new Player("Diego Schwimer", "Kelazhur", 00, "Brazil", GameData.getGameByTitle("Starcraft")),
        new Player("Grzegorz Komincz", "MaNa", 28, "Poland", GameData.getGameByTitle("Odin Sphere"))
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
        return null;
    }
}
