
package com.softwaretesting;

public class Exp17 {

    public int findMaximum(int a, int b, int c) {

        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {

        Exp17 obj = new Exp17();

        System.out.println("MAXIMUM OF THREE NUMBERS");
        System.out.println("------------------------------");

        System.out.println("10, 20, 30 : " + obj.findMaximum(10, 20, 30));
        System.out.println("50, 25, 15 : " + obj.findMaximum(50, 25, 15));
        System.out.println("12, 40, 18 : " + obj.findMaximum(12, 40, 18));
    }
}
