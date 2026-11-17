
package com.softwaretesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exp23Test {

    @Test
    public void testSumOfDigits() {

        Exp23 obj = new Exp23();

        assertEquals(10, obj.sumOfDigits(1234));
        assertEquals(18, obj.sumOfDigits(567));
        assertEquals(1, obj.sumOfDigits(100));
        assertEquals(0, obj.sumOfDigits(0));
        assertEquals(6, obj.sumOfDigits(-123));
    }
}
