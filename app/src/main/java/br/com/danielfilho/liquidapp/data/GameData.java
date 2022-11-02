package br.com.danielfilho.liquidapp.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

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

    public static List<Game> getLiquidGames() {
        return liquidGames;
    }

    public static List<Game> getGameByPlatform(String platform) {
        List<Game> gamesByPlatform = new ArrayList<>();

        // filtering liquidGames to find games from a specific platform,
        // adding the result to a new list.
        Stream<Game> gameStream = liquidGames.stream().filter(game -> game.getTitle().equals(platform));
        gameStream.forEach(gamesByPlatform::add);

        return gamesByPlatform;
    }

    public static List<Game> getGameByTitle(String title) {
        List<Game> gamesByTitle = new ArrayList<>();

        Stream<Game> gameStream = liquidGames.stream().filter(game -> game.getTitle().equals(title));
        gameStream.forEach(gamesByTitle::add);

        return gamesByTitle;
    }
}
