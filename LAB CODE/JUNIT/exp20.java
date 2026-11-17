
package com.softwaretesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exp20Test {

    @Test
    public void testVowelsAndConsonants() {

        Exp20 obj = new Exp20();

        assertEquals(3, obj.countVowels("Hello World"));
        assertEquals(7, obj.countConsonants("Hello World"));

        assertEquals(5, obj.countVowels("Education"));
        assertEquals(4, obj.countConsonants("Education"));

        assertEquals(0, obj.countVowels("12345"));
        assertEquals(0, obj.countConsonants("12345"));

        assertEquals(0, obj.countVowels(""));
        assertEquals(0, obj.countConsonants(""));
    }
}
