
package com.softwaretesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exp18Test {

    @Test
    public void testEvenOdd() {

        Exp18 obj = new Exp18();

        assertEquals("Even", obj.checkEvenOdd(10));
        assertEquals("Odd", obj.checkEvenOdd(7));
        assertEquals("Even", obj.checkEvenOdd(0));
        assertEquals("Odd", obj.checkEvenOdd(-5));
        assertEquals("Even", obj.checkEvenOdd(-8));
    }
}
