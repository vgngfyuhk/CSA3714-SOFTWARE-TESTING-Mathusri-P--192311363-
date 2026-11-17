package com.softwaretesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exp30Test {

    @Test
    public void testStringLength() {

        Exp30 obj = new Exp30();

        assertEquals(5, obj.findLength("Hello"));
        assertEquals(4, obj.findLength("Java"));
        assertEquals(7, obj.findLength("Testing"));
        assertEquals(1, obj.findLength("A"));
        assertEquals(0, obj.findLength(""));
    }
}
