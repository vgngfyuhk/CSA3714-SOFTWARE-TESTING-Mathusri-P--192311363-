
package com.softwaretesting;

public class Exp24 {

    public boolean compareStrings(String str1, String str2) {

        if (str1 == null || str2 == null) {
            return str1 == str2;
        }

        return str1.equalsIgnoreCase(str2);
    }

    public static void main(String[] args) {

        Exp24 obj = new Exp24();

        System.out.println("STRING COMPARISON (IGNORE CASE)");
        System.out.println("--------------------------------");

        System.out.println("Hello, hello : " +
                obj.compareStrings("Hello", "hello"));

        System.out.println("JAVA, java : " +
                obj.compareStrings("JAVA", "java"));

        System.out.println("Apple, Orange : " +
                obj.compareStrings("Apple", "Orange"));

        System.out.println("Test, TEST : " +
                obj.compareStrings("Test", "TEST"));
    }
}
.
