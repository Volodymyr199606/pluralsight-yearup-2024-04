package com.pluralsight;

public class Main
{
    public static void main(String[] args)
    {
        Car car = new Car("Ford", "Mustang");
        System.out.println(car.getSpeed());
        car.accelerate(20);
        System.out.println(car.getSpeed());
        car.accelerate(-20);
        System.out.println(car.getSpeed());



    }
}