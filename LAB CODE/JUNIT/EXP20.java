
package com.softwaretesting;

public class Exp20 {

    public int countVowels(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    public int countConsonants(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch >= 'a' && ch <= 'z' &&
                !(ch == 'a' || ch == 'e' || ch == 'i' ||
                  ch == 'o' || ch == 'u')) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Exp20 obj = new Exp20();

        String str = "Hello World";

        System.out.println("VOWELS AND CONSONANTS COUNT");
        System.out.println("------------------------------");
        System.out.println("String: " + str);
        System.out.println("Vowels: " + obj.countVowels(str));
        System.out.println("Consonants: " + obj.countConsonants(str));
    }
}
