package com.softwaretesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exp29Test {

    @Test
    public void testCelsiusToFahrenheit() {

        Exp29 obj = new Exp29();

        assertEquals(32.0, obj.convertToFahrenheit(0), 0.001);
        assertEquals(77.0, obj.convertToFahrenheit(25), 0.001);
        assertEquals(212.0, obj.convertToFahrenheit(100), 0.001);
        assertEquals(-40.0, obj.convertToFahrenheit(-40), 0.001);
        assertEquals(98.6, obj.convertToFahrenheit(37), 0.001);
    }
}
