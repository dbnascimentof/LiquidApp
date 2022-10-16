package br.com.danielfilho.liquidapp.model;

public class Game {

    private String title;
    private String platform;

    public Game(String title, String platform) {
        this.title = title;
        this.platform = platform;
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
