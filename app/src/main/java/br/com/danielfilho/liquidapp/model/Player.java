package br.com.danielfilho.liquidapp.model;

public class Player {
    private String name;
    private String nickname;
    private int age;
    private String country;

    public Player(String name, String nickname, int age, String country) {
        this.name = name;
        this.nickname = nickname;
        this.age = age;
        this.country = country;
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
}
