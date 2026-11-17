
package com.softwaretesting;

public class Exp22 {

    public int reverseNumber(int number) {

        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        return reverse;
    }

    public static void main(String[] args) {

        Exp22 obj = new Exp22();

        System.out.println("REVERSE OF A NUMBER");
        System.out.println("------------------------------");

        System.out.println("1234 : " + obj.reverseNumber(1234));
        System.out.println("567 : " + obj.reverseNumber(567));
        System.out.println("100 : " + obj.reverseNumber(100));
        System.out.println("0 : " + obj.reverseNumber(0));
        System.out.println("-123 : " + obj.reverseNumber(-123));
    }
}
