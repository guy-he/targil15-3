package com.company;

public class Television extends ElectricDevice {
    protected float screenSize;

    public Television(boolean worksOnBatteries, float screenSize) {
        super(false);
        this.screenSize = screenSize;
    }

    @Override
    public void useDevice() {
        System.out.println("watching tv");
    }

    @Override
    public void fixDevice() {
        if (isFaulty = true){
            System.out.println("fixing tv");
            isFaulty = false;
        }
        else System.out.println(" tv is working properly");
    }
}
