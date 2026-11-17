package com.softwaretesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exp34Test {

    @Test
    public void testSumOfNaturalNumbers() {

        Exp34 obj = new Exp34();

        assertEquals(15, obj.calculateSum(5));
        assertEquals(55, obj.calculateSum(10));
        assertEquals(120, obj.calculateSum(15));
        assertEquals(0, obj.calculateSum(0));

        assertThrows(IllegalArgumentException.class,
                () -> obj.calculateSum(-5));
    }
}
