package com.company;

public class AirplaineMachanic extends Mechanic {
    protected int rank;

    public AirplaineMachanic(String name, int years_of_experience, int rank) {
        super(name, years_of_experience);
        this.rank = rank;
    }

    @Override
    public void repair() {
        System.out.println("repairing airplane");
    }
    public void checkEngine(){
        System.out.println("checking the engine");
    }
}
