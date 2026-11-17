package com.softwaretesting;

public class Exp33 {

    public long factorial(int number) {

        if (number < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }

        long fact = 1;

        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {

        Exp33 obj = new Exp33();

        System.out.println("FACTORIAL OF A NUMBER");
        System.out.println("---------------------");

        System.out.println("5 : " + obj.factorial(5));
        System.out.println("4 : " + obj.factorial(4));
        System.out.println("3 : " + obj.factorial(3));
        System.out.println("0 : " + obj.factorial(0));
    }
}
