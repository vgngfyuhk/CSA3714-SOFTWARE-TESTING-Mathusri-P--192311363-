package com.softwaretesting;

public class Exp35 {

    public boolean isLeapYear(int year) {

        if (year <= 0) {
            return false;
        }

        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Exp35 obj = new Exp35();

        System.out.println("LEAP YEAR CHECKING");
        System.out.println("------------------");

        System.out.println("2024 : " + (obj.isLeapYear(2024) ? "Leap Year" : "Not a Leap Year"));
        System.out.println("2023 : " + (obj.isLeapYear(2023) ? "Leap Year" : "Not a Leap Year"));
        System.out.println("2000 : " + (obj.isLeapYear(2000) ? "Leap Year" : "Not a Leap Year"));
        System.out.println("1900 : " + (obj.isLeapYear(1900) ? "Leap Year" : "Not a Leap Year"));
        System.out.println("2028 : " + (obj.isLeapYear(2028) ? "Leap Year" : "Not a Leap Year"));
    }
}
