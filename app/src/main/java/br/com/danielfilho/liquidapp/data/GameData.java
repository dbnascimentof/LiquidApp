package br.com.danielfilho.liquidapp.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import br.com.danielfilho.liquidapp.model.Game;

public final class GameData {
    private final static List<Game> liquidGames = new ArrayList<>(Arrays.asList(
            new Game("Starcraft", "PC"),
            new Game("Rainbow Six", "Playstation 5"),
            new Game("Valorant", "PC"),
            new Game("Fortinite", "PC"),
            new Game("CS-GO", "PC"),
            new Game("Freefire", "PC"),
            new Game("Rocket League", "PC"),
            new Game("GTA V", "PC"),
            new Game("Fifa 23", "Playstation 5")
    ));

    //TODO: Remove coding adding items to the list from the get method.
    //      Every time that the get method is called it duplicates the list items.
    public static List<Game> getLiquidGames() {
        return liquidGames;
    }
}
