package com.softwaretesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exp32Test {

    @Test
    public void testPerfectNumber() {

        Exp32 obj = new Exp32();

        assertTrue(obj.isPerfect(6));
        assertTrue(obj.isPerfect(28));
        assertFalse(obj.isPerfect(12));
        assertTrue(obj.isPerfect(496));
        assertFalse(obj.isPerfect(1));
        assertFalse(obj.isPerfect(0));
        assertFalse(obj.isPerfect(-6));
    }
}
