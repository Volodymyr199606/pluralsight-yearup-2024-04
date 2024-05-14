package com.pluralsight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    private Vehicle vehicle;

    @BeforeEach
    void setUp() {
        vehicle = new Vehicle("Test Vehicle", "2024-02-01", 20000.00, "Test Model", 2024, 60000);
    }

    @Test
    void testGetDescription() {
        assertEquals("Test Vehicle", vehicle.getDescription());
    }

    @Test
    void testGetDateAcquired() {
        assertEquals("2024-02-01", vehicle.getDateAcquired());
    }

    @Test
    void testGetOriginalCost() {
        assertEquals(20000.00, vehicle.getOriginalCost(), 0.01);
    }

    @Test
    void testGetMakeModel() {
        assertEquals("Test Model", vehicle.getMakeModel());
    }

    @Test
    void testGetYear() {
        assertEquals(2024, vehicle.getYear());
    }

    @Test
    void testGetOdometer() {
        assertEquals(60000, vehicle.getOdometer());
    }
}