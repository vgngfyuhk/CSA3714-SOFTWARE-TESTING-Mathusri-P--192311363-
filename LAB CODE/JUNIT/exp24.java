
package com.softwaretesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exp24Test {

    @Test
    public void testCompareStrings() {

        Exp24 obj = new Exp24();

        assertTrue(obj.compareStrings("Hello", "hello"));
        assertTrue(obj.compareStrings("JAVA", "java"));
        assertFalse(obj.compareStrings("Apple", "Orange"));
        assertTrue(obj.compareStrings("Test", "TEST"));
        assertFalse(obj.compareStrings("Hello", "World"));
        assertTrue(obj.compareStrings(null, null));
        assertFalse(obj.compareStrings(null, "Hello"));
    }
}
