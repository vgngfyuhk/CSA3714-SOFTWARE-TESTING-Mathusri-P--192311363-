
package com.softwaretesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exp26Test {

    @Test
    public void testFindLargest() {

        Exp26 obj = new Exp26();

        assertEquals(40, obj.findLargest(
                new int[]{10, 25, 15, 40, 30}));

        assertEquals(-1, obj.findLargest(
                new int[]{-5, -2, -10, -1}));

        assertEquals(7, obj.findLargest(
                new int[]{7}));

        assertEquals(100, obj.findLargest(
                new int[]{100, 50, 25}));

        assertThrows(IllegalArgumentException.class,
                () -> obj.findLargest(new int[]{}));

        assertThrows(IllegalArgumentException.class,
                () -> obj.findLargest(null));
    }
}
