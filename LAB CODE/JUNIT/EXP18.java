
package com.softwaretesting;

public class Exp18 {

    public String checkEvenOdd(int number) {

        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {

        Exp18 obj = new Exp18();

        System.out.println("EVEN OR ODD CHECKING");
        System.out.println("------------------------------");

        System.out.println("10 : " + obj.checkEvenOdd(10));
        System.out.println("7 : " + obj.checkEvenOdd(7));
        System.out.println("0 : " + obj.checkEvenOdd(0));
        System.out.println("-5 : " + obj.checkEvenOdd(-5));
    }
}
