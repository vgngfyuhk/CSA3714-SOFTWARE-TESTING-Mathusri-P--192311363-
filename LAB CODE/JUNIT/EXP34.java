package com.softwaretesting;

public class Exp34 {

    public int calculateSum(int number) {

        if (number < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }

        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {

        Exp34 obj = new Exp34();

        System.out.println("SUM OF NATURAL NUMBERS");
        System.out.println("----------------------");

        System.out.println("5 : " + obj.calculateSum(5));
        System.out.println("10 : " + obj.calculateSum(10));
        System.out.println("15 : " + obj.calculateSum(15));
        System.out.println("0 : " + obj.calculateSum(0));
    }
}
