
package com.softwaretesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exp19Test {

    @Test
    public void testCompoundInterest() {

        Exp19 obj = new Exp19();

        assertEquals(210.0,
                obj.calculateCompoundInterest(1000, 10, 2), 0.001);

        assertEquals(153.75,
                obj.calculateCompoundInterest(1500, 5, 2), 0.001);

        assertEquals(160.0,
                obj.calculateCompoundInterest(2000, 8, 1), 0.001);
    }
}
