package br.com.danielfilho.liquidapp.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import br.com.danielfilho.liquidapp.model.Game;

public final class GameData {
    private final static List<Game> liquidGames = new ArrayList<>(Arrays.asList(
            new Game(1, "Starcraft", "PC"),
            new Game(2, "Rainbow Six", "Playstation 5"),
            new Game(3, "Valorant", "PC"),
            new Game(4, "Fortinite", "PC"),
            new Game(5, "CS-GO", "PC"),
            new Game(6, "Freefire", "PC"),
            new Game(7, "Rocket League", "PC"),
            new Game(8, "GTA V", "PC"),
            new Game(9, "Fifa 23", "Playstation 5")
    ));

    public static List<Game> getLiquidGames() {
        return liquidGames;
    }

    public static Game getGameById(int gameId){
        for (Game game : liquidGames) {
            if (game.getGameId() == gameId) {
                return game;
            }
        }
        return null;
    }

    public static List<Game> getGameByPlatform(String platform) {
        List<Game> gamesByPlatform = new ArrayList<>();

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
