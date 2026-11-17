
package com.softwaretesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exp16Test {

    @Test
    public void testAnagram() {

        Exp16 obj = new Exp16();

        assertTrue(obj.isAnagram("listen", "silent"));
        assertTrue(obj.isAnagram("Dormitory", "Dirty room"));
        assertFalse(obj.isAnagram("hello", "world"));
        assertFalse(obj.isAnagram("apple", "apples"));
        assertFalse(obj.isAnagram(null, "hello"));
    }
}
