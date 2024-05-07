package com.pluralsight;

public class Room {
    private boolean occupied;
    private boolean dirty;
    private int numberOfBeds;
    private double price;

    public Room(int numberOfBeds, double price) {
        this.occupied = false;
        this.dirty = false;
        this.numberOfBeds = numberOfBeds;
        this.price = price;
    }

    public boolean isAvailable() {
        return !occupied && !dirty;
    }

    public void checkIn() {
        if (!isAvailable()) {
            throw new IllegalStateException("Room is not available for check-in");
        }
        this.occupied = true;
        this.dirty = true;
    }

    public void checkOut() {
        if (!this.occupied) {
            throw new IllegalStateException("No guest to check out");
        }
        this.occupied = false;
    }

    public void cleanRoom() {
        if (this.occupied) {
            throw new IllegalStateException("Cannot clean room while it is occupied");
        }
        this.dirty = false;
    }
}