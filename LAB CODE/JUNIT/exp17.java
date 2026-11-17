
package com.softwaretesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exp17Test {

    @Test
    public void testMaximum() {

        Exp17 obj = new Exp17();

        assertEquals(30, obj.findMaximum(10, 20, 30));
        assertEquals(50, obj.findMaximum(50, 25, 15));
        assertEquals(40, obj.findMaximum(12, 40, 18));
        assertEquals(10, obj.findMaximum(10, 10, 5));
        assertEquals(-1, obj.findMaximum(-1, -5, -10));
    }
}
