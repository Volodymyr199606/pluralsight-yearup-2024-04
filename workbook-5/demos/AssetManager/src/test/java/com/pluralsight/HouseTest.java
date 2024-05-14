package com.pluralsight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseTest {
    private House house;

    @BeforeEach
    void setUp() {
        house = new House("Test House", "2024-05-01", 200000.00, "123 Street", 1, 2000, 5000);
    }

    @Test
    void testGetDescription() {
        assertEquals("Test House", house.getDescription());
    }

    @Test
    void testGetDateAcquired() {
        assertEquals("2024-05-01", house.getDateAcquired());
    }

    @Test
    void testGetOriginalCost() {
        assertEquals(200000.00, house.getOriginalCost(), 0.01);
    }

    @Test
    void testGetAddress() {
        assertEquals("123 Street", house.getAddress());
    }

    @Test
    void testGetCondition() {
        assertEquals(1, house.getCondition());
    }

    @Test
    void testGetSquareFoot() {
        assertEquals(2000, house.getSquareFoot());
    }

    @Test
    void testGetLotSize() {
        assertEquals(5000, house.getLotSize());
    }

    @Test
    void testGetValue() {
        assertEquals(361250.00, house.getValue(), 0.01);
    }
}