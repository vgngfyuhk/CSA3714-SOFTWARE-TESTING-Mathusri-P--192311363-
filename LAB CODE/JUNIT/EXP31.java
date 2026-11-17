package com.softwaretesting;

public class Exp31 {

    public boolean isPalindrome(String str) {

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        return str.equalsIgnoreCase(reverse);
    }

    public static void main(String[] args) {

        Exp31 obj = new Exp31();

        System.out.println("STRING PALINDROME CHECKING");
        System.out.println("---------------------------");

        System.out.println("MADAM : " + obj.isPalindrome("MADAM"));
        System.out.println("LEVEL : " + obj.isPalindrome("LEVEL"));
        System.out.println("HELLO : " + obj.isPalindrome("HELLO"));
        System.out.println("RADAR : " + obj.isPalindrome("RADAR"));
        System.out.println("JAVA : " + obj.isPalindrome("JAVA"));
    }
}
