package br.com.danielfilho.liquidapp.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import br.com.danielfilho.liquidapp.model.Game;
import br.com.danielfilho.liquidapp.model.Player;

public final class PlayerData {
    private final static List<Player> liquidPlayers = new ArrayList<>(Arrays.asList(
        new Player("Mikolaj Ogonowski", "Elazer", 24, "Poland", new Game("Starcraft", "PC")),
        new Player("Clement Desplanches", "Clem", 20, "France", new Game("Starcraft", "PC")),
        new Player("Diego Schwimer", "Kelazhur", 00, "Brazil", new Game("Starcraft", "PC")),
        new Player("Grzegorz Komincz", "MaNa", 28, "Poland", new Game("Starcraft", "PC"))
    ));

    public static List<Player> getPlayers(){
        return liquidPlayers;
    }
}
