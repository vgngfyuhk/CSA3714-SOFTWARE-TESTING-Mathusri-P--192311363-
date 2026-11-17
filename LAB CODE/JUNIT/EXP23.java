
package com.softwaretesting;

public class Exp23 {

    public int sumOfDigits(int number) {

        int sum = 0;
        number = Math.abs(number);

        while (number != 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        Exp23 obj = new Exp23();

        System.out.println("SUM OF DIGITS");
        System.out.println("------------------------------");

        System.out.println("1234 : " + obj.sumOfDigits(1234));
        System.out.println("567 : " + obj.sumOfDigits(567));
        System.out.println("100 : " + obj.sumOfDigits(100));
        System.out.println("0 : " + obj.sumOfDigits(0));
        System.out.println("-123 : " + obj.sumOfDigits(-123));
    }
}
