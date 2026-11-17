
package com.softwaretesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exp21Test {

    @Test
    public void testPrimeNumber() {

        Exp21 obj = new Exp21();

        assertTrue(obj.isPrime(7));
        assertFalse(obj.isPrime(10));
        assertFalse(obj.isPrime(1));
        assertTrue(obj.isPrime(13));
        assertFalse(obj.isPrime(-5));
        assertFalse(obj.isPrime(0));
        assertTrue(obj.isPrime(2));
    }
}
