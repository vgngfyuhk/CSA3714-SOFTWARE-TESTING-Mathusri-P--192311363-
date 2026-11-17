package com.softwaretesting;

public class Exp32 {

    public boolean isPerfect(int number) {

        if (number <= 1) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

    public static void main(String[] args) {

        Exp32 obj = new Exp32();

        System.out.println("PERFECT NUMBER CHECKING");
        System.out.println("-----------------------");

        System.out.println("6 : " + (obj.isPerfect(6) ? "Perfect Number" : "Not Perfect Number"));
        System.out.println("28 : " + (obj.isPerfect(28) ? "Perfect Number" : "Not Perfect Number"));
        System.out.println("12 : " + (obj.isPerfect(12) ? "Perfect Number" : "Not Perfect Number"));
        System.out.println("496 : " + (obj.isPerfect(496) ? "Perfect Number" : "Not Perfect Number"));
        System.out.println("1 : " + (obj.isPerfect(1) ? "Perfect Number" : "Not Perfect Number"));
    }
}
