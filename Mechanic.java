package com.company;

public abstract class Mechanic {
    protected String name;
    protected int years_of_experience;

    public Mechanic(String name, int years_of_experience) {
        this.name = name;
        this.years_of_experience = years_of_experience;
    }

    public abstract void repair();
    public void use_screwDriver(){
        System.out.println(".Using screwdriver to open this screw");
    }
}
