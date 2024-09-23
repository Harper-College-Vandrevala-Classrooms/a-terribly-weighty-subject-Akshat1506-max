package com.csc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestConverter {

    Converter converter;

    @BeforeEach
    void setUp() {
        converter = new Converter();
    }

    @Test
    public void testZeroOuncesToPounds() {
        assertEquals("0.0000 lbs", converter.toPounds(0));
    }

    @Test
    public void test1OunceToPounds() {
        assertEquals("0.0625 lbs", converter.toPounds(1));
    }

    @Test
    public void test16OuncesToPounds() {
        assertEquals("1.0000 lb", converter.toPounds(16));
    }

    @Test
    public void test32OuncesToPounds() {
        assertEquals("2.0000 lbs", converter.toPounds(32));
    }

    @Test
    public void testDefaultToPounds() {
        assertEquals("0.0000 lbs", converter.toPounds());
    }

    @Test
    public void testZeroOuncesToPoundsAndOunces() {
        assertEquals("0 lbs 0 oz", converter.toPoundsAndOunces(0));
    }

    @Test
    public void test1OunceToPoundsAndOunces() {
        assertEquals("0 lbs 1 oz", converter.toPoundsAndOunces(1));
    }

    @Test
    public void test16OuncesToPoundsAndOunces() {
        assertEquals("1 lb 0 oz", converter.toPoundsAndOunces(16));
    }

    @Test
    public void test32OuncesToPoundsAndOunces() {
        assertEquals("2 lbs 0 oz", converter.toPoundsAndOunces(32));
    }

    @Test
    public void testDefaultToPoundsAndOunces() {
        assertEquals("0 lbs 0 oz", converter.toPoundsAndOunces());
    }

    @Test
    public void testToOuncesFromPoundsAndOunces() {
        assertEquals("12 ounces.", converter.toOunces(0, 12));
    }

    @Test
    public void testToOuncesFromPoundsAndOuncesFullConversion() {
        assertEquals("31 ounces.", converter.toOunces(1, 15));
    }
}