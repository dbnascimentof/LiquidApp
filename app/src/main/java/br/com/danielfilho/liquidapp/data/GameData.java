package br.com.danielfilho.liquidapp.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import br.com.danielfilho.liquidapp.R;
import br.com.danielfilho.liquidapp.model.Game;

public final class GameData {
    private final static List<Game> liquidGames = new ArrayList<>(Arrays.asList(
            new Game(1, "Starcraft", "PC", R.drawable.starcraft),
            new Game(2, "Rainbow Six", "Playstation 5", R.drawable.rainbow_six_siege),
            new Game(3, "Valorant", "PC", R.drawable.valorant),
            new Game(4, "Fortinite", "PC", R.drawable.fortinite),
            new Game(5, "CS-GO", "PC", R.drawable.csgo),
            new Game(6, "Freefire", "PC", R.drawable.freefire),
            new Game(7, "Rocket League", "PC", R.drawable.rocket_league),
            new Game(8, "GTA V", "PC", R.drawable.gtav),
            new Game(9, "Fifa 23", "Playstation 5", R.drawable.fifa23)
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
