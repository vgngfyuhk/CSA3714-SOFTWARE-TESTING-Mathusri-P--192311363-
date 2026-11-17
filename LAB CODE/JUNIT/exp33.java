package com.softwaretesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exp33Test {

    @Test
    public void testFactorial() {

        Exp33 obj = new Exp33();

        assertEquals(120, obj.factorial(5));
        assertEquals(24, obj.factorial(4));
        assertEquals(6, obj.factorial(3));
        assertEquals(1, obj.factorial(0));
        assertEquals(1, obj.factorial(1));

        assertThrows(IllegalArgumentException.class,
                () -> obj.factorial(-5));
    }
}
