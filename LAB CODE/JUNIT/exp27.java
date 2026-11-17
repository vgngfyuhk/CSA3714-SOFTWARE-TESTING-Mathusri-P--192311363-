
package com.softwaretesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exp27Test {

    @Test
    public void testCalculateAverage() {

        Exp27 obj = new Exp27();

        assertEquals(30.0,
                obj.calculateAverage(new int[]{10, 20, 30, 40, 50}), 0.001);

        assertEquals(10.0,
                obj.calculateAverage(new int[]{5, 10, 15}), 0.001);

        assertEquals(100.0,
                obj.calculateAverage(new int[]{100}), 0.001);

        assertEquals(0.0,
                obj.calculateAverage(new int[]{-10, 0, 10}), 0.001);

        assertThrows(IllegalArgumentException.class,
                () -> obj.calculateAverage(new int[]{}));

        assertThrows(IllegalArgumentException.class,
                () -> obj.calculateAverage(null));
    }
}
