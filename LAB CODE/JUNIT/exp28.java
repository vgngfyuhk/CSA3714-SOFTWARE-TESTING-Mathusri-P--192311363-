
package com.softwaretesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exp28Test {

    @Test
    public void testArmstrongNumber() {

        Exp28 obj = new Exp28();

        assertTrue(obj.isArmstrong(153));
        assertTrue(obj.isArmstrong(370));
        assertFalse(obj.isArmstrong(123));
        assertTrue(obj.isArmstrong(9474));
        assertFalse(obj.isArmstrong(-153));
        assertTrue(obj.isArmstrong(0));
        assertTrue(obj.isArmstrong(1));
    }
}
