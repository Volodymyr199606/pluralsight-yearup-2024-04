package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Asset> assets = new ArrayList<>();

        // Adding houses
        House house1 = new House("Volodymyr house", "2024-05-01", 200000.00, "123 Street", 1, 2000, 5000);
        House house2 = new House("Volodymyr vacation home", "2024-04-01", 150000.00, "456 Beach", 2, 1500, 4000);
        assets.add(house1);
        assets.add(house2);

        // Adding vehicles
        Vehicle vehicle1 = new Vehicle("Volodymyr's truck", "2024-03-01", 30000.00, "Ford F-150", 2019, 50000);
        Vehicle vehicle2 = new Vehicle("Volodymyr's car", "2024-02-01", 20000.00, "Honda Accord", 2018, 60000);
        assets.add(vehicle1);
        assets.add(vehicle2);

        // Displaying assets
        for (Asset asset : assets) {
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: " + asset.getOriginalCost());
            System.out.println("Current Value: " + asset.getValue());
            if (asset instanceof House) {
                House house = (House) asset;
                System.out.println("Address: " + house.getAddress());
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("Year: " + vehicle.getYear());
                System.out.println("Make/Model: " + vehicle.getMakeModel());
            }

            System.out.println();
        }
    }
}