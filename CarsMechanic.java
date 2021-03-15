package com.company;

public class CarsMechanic extends Mechanic {
    String[] car_types_i_can_repair;

    public CarsMechanic(String name, int years_of_experience) {
        super(name, years_of_experience);
    }

    @Override
    public void repair() {
        System.out.println("repairing car");
    }
    public void replaceWheel(){
        System.out.println("replacing the defaulted wheel");
    }
}
