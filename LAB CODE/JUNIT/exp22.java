
package com.softwaretesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exp22Test {

    @Test
    public void testReverseNumber() {

        Exp22 obj = new Exp22();

        assertEquals(4321, obj.reverseNumber(1234));
        assertEquals(765, obj.reverseNumber(567));
        assertEquals(1, obj.reverseNumber(100));
        assertEquals(0, obj.reverseNumber(0));
        assertEquals(-321, obj.reverseNumber(-123));
    }
}
