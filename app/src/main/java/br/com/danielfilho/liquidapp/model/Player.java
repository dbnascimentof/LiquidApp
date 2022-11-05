package br.com.danielfilho.liquidapp.model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private String nickname;
    private int age;
    private String country;
    private int photo;
    private List<Game> playedGames = new ArrayList<>();


    public Player(String name, String nickname, int age, String country, int photo, List<Game> playedGames) {
        this.name = name;
        this.nickname = nickname;
        this.age = age;
        this.country = country;
        this.photo = photo;
        this.playedGames = playedGames;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public List<Game> getPlayedGames() {
        return playedGames;
    }

    public void setPlayedGames(List<Game> playedGames) {
        this.playedGames = playedGames;
    }
}
