package com.company;

public class PianoPlayer extends Player {
    public PianoPlayer(String name, String favoriteGenre) {
        super(name, favoriteGenre);
    }

    @Override
    public void play() {
        System.out.println("playing bach");
    }

    @Override
    public void compose() {
        System.out.println("composing piano melody");
    }
    public void practice(){
        System.out.println("practice makes perfect");
    }
    public void playJazz(){
        System.out.println("Playing I Got Rhythm by George Gershwin");

    }
}
