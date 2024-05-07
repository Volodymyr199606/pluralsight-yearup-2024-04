package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Room room = new Room(2, 124.00);
        System.out.println("Room is available: " + room.isAvailable());


        Reservation reservation = new Reservation("double", 3, true);
        System.out.println("Reservation total: " + reservation.getReservationTotal());


        System.out.println("Room type: " + reservation.getRoomType());
        reservation.setRoomType("king");
        System.out.println("Updated room type: " + reservation.getRoomType());

        System.out.println("Number of nights: " + reservation.getNumberOfNights());
        reservation.setNumberOfNights(5);
        System.out.println("Updated number of nights: " + reservation.getNumberOfNights());

        System.out.println("Is it a weekend? " + reservation.isWeekend());
        reservation.setIsWeekend(false);
        System.out.println("Updated weekend status: " + reservation.isWeekend());


        Employee employee = new Employee("E001", "John Doe", "Housekeeping", 15.00, 45);
        System.out.println("Employee total pay: " + employee.getTotalPay());

        room.checkIn();
        System.out.println("Room is available after check in: " + room.isAvailable());

        // Simulate a guest checking out
        room.checkOut();
        System.out.println("Room is available after check out: " + room.isAvailable());

        // Simulate the room being cleaned
        room.cleanRoom();
        System.out.println("Room is available after cleaning: " + room.isAvailable());
    }



}