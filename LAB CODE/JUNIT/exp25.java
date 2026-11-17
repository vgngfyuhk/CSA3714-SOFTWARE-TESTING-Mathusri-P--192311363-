
package com.softwaretesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exp25Test {

    @Test
    public void testCalculateGrade() {

        Exp25 obj = new Exp25();

        assertEquals("A", obj.calculateGrade(95));
        assertEquals("B", obj.calculateGrade(85));
        assertEquals("C", obj.calculateGrade(75));
        assertEquals("D", obj.calculateGrade(65));
        assertEquals("Fail", obj.calculateGrade(40));
        assertEquals("Invalid Marks", obj.calculateGrade(105));
        assertEquals("Invalid Marks", obj.calculateGrade(-5));
        assertEquals("A", obj.calculateGrade(90));
        assertEquals("Fail", obj.calculateGrade(59));
    }
}
