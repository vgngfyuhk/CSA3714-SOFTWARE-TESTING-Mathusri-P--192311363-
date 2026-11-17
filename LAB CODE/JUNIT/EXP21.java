
package com.softwaretesting;

public class Exp21 {

    public boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Exp21 obj = new Exp21();

        System.out.println("PRIME NUMBER CHECKING");
        System.out.println("------------------------------");

        System.out.println("7 : " + (obj.isPrime(7) ? "Prime" : "Not Prime"));
        System.out.println("10 : " + (obj.isPrime(10) ? "Prime" : "Not Prime"));
        System.out.println("1 : " + (obj.isPrime(1) ? "Prime" : "Not Prime"));
        System.out.println("13 : " + (obj.isPrime(13) ? "Prime" : "Not Prime"));
        System.out.println("-5 : " + (obj.isPrime(-5) ? "Prime" : "Not Prime"));
    }
}
