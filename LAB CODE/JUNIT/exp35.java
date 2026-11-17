package com.softwaretesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exp35Test {

    @Test
    public void testLeapYear() {

        Exp35 obj = new Exp35();

        assertTrue(obj.isLeapYear(2024));
        assertFalse(obj.isLeapYear(2023));
        assertTrue(obj.isLeapYear(2000));
        assertFalse(obj.isLeapYear(1900));
        assertTrue(obj.isLeapYear(2028));
        assertFalse(obj.isLeapYear(0));
        assertFalse(obj.isLeapYear(-2024));
    }
}
