package br.com.danielfilho.liquidapp.model;

public class Game {

    private int gameId;
    private String title;
    private String platform;
    private int coverImage;

    public Game(int gameId, String title, String platform, int coverImage) {
        this.gameId = gameId;
        this.title = title;
        this.platform = platform;
        this.coverImage = coverImage;
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

    public int getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(int coverImage) {
        this.coverImage = coverImage;
    }
}
