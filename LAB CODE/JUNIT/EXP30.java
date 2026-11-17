package com.softwaretesting;

public class Exp30 {

    public int findLength(String str) {

        int count = 0;

        for (char ch : str.toCharArray()) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Exp30 obj = new Exp30();

        System.out.println("STRING LENGTH WITHOUT BUILT-IN FUNCTION");
        System.out.println("----------------------------------------");

        System.out.println("Hello : " + obj.findLength("Hello"));
        System.out.println("Java : " + obj.findLength("Java"));
        System.out.println("Testing : " + obj.findLength("Testing"));
        System.out.println("A : " + obj.findLength("A"));
    }
}
