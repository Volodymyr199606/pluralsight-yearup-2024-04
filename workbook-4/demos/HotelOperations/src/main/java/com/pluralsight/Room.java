package com.pluralsight;

public class Room {
    private final int numberOfBeds;
    private final double price;
    private final boolean occupied;
    private final boolean dirty;

    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = false;
        this.dirty = false;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return !occupied && !dirty;
    }
}