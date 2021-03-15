package com.company;

public abstract class Player implements IPlayer {
    protected String name;
    protected String favoriteGenre;

    public Player(String name, String favoriteGenre) {
        this.name = name;
        this.favoriteGenre = favoriteGenre;
    }
}
