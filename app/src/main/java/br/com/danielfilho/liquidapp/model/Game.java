package br.com.danielfilho.liquidapp.model;

public class Game {

    private int gameId;
    private String title;
    private String platform;

    public Game(int gameId, String title, String platform) {
        this.gameId = gameId;
        this.title = title;
        this.platform = platform;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
}
