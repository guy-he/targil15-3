package com.company;

public class Apartment {
    protected String address;

    public Apartment(String address, float size) {
        this.address = address;
        this.size = size;
    }

    protected float size;

    @Override
    public String toString() {
        return "Apartment{" +
                "address='" + address + '\'' +
                ", size=" + size +
                '}';
    }
}
