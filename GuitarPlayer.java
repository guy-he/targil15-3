package com.company;

public class GuitarPlayer extends Player {
    public GuitarPlayer(String name, String favoriteGenre) {
        super(name, favoriteGenre);
    }

    @Override
    public void play() {
        System.out.println("playing hotel california");
    }

    @Override
    public void compose() {
        System.out.println("composing guitar melody");
    }
    public void rockNroll(){
        System.out.println("let the shoe begin");
    }
}
