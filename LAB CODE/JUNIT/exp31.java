package com.softwaretesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exp31Test {

    @Test
    public void testPalindrome() {

        Exp31 obj = new Exp31();

        assertTrue(obj.isPalindrome("MADAM"));
        assertTrue(obj.isPalindrome("LEVEL"));
        assertFalse(obj.isPalindrome("HELLO"));
        assertTrue(obj.isPalindrome("RADAR"));
        assertFalse(obj.isPalindrome("JAVA"));
        assertTrue(obj.isPalindrome("Madam"));
        assertTrue(obj.isPalindrome(""));
    }
}
