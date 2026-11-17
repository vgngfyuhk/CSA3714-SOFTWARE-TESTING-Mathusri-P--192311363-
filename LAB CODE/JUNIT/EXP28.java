
package com.softwaretesting;

public class Exp28 {

    public boolean isArmstrong(int number) {

        if (number < 0) {
            return false;
        }

        int original = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number = number / 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {

        Exp28 obj = new Exp28();

        System.out.println("ARMSTRONG NUMBER CHECKING");
        System.out.println("------------------------------");

        System.out.println("153 : " +
                (obj.isArmstrong(153) ? "Armstrong" : "Not Armstrong"));

        System.out.println("370 : " +
                (obj.isArmstrong(370) ? "Armstrong" : "Not Armstrong"));

        System.out.println("123 : " +
                (obj.isArmstrong(123) ? "Armstrong" : "Not Armstrong"));

        System.out.println("9474 : " +
                (obj.isArmstrong(9474) ? "Armstrong" : "Not Armstrong"));

        System.out.println("-153 : " +
                (obj.isArmstrong(-153) ? "Armstrong" : "Not Armstrong"));
    }
}
