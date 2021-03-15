package com.company;

public class Cellphone  extends ElectricDevice{
    protected String brand;

    public Cellphone(boolean worksOnBatteries, String brand) {
        super(true);
        this.brand = brand;
    }

    @Override
    public void useDevice() {
        System.out.println("talking on the phone");
    }

    @Override
    public void fixDevice() {
        if (isFaulty = true){
            System.out.println("fixing phone");
            isFaulty = false;
        }
        else System.out.println("phone is ok");
    }
}
