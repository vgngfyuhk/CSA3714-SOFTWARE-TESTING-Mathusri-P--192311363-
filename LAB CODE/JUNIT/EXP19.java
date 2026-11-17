
package com.softwaretesting;

public class Exp19 {

    public double calculateCompoundInterest(double principal, double rate, double time) {

        double amount = principal * Math.pow((1 + rate / 100), time);

        double compoundInterest = amount - principal;

        return compoundInterest;
    }

    public static void main(String[] args) {

        Exp19 obj = new Exp19();

        System.out.println("COMPOUND INTEREST CALCULATION");
        System.out.println("--------------------------------");

        System.out.println("Principal: 1000, Rate: 10%, Time: 2 years");
        System.out.println("Compound Interest: " +
                obj.calculateCompoundInterest(1000, 10, 2));

        System.out.println("Principal: 1500, Rate: 5%, Time: 2 years");
        System.out.println("Compound Interest: " +
                obj.calculateCompoundInterest(1500, 5, 2));

        System.out.println("Principal: 2000, Rate: 8%, Time: 1 year");
        System.out.println("Compound Interest: " +
                obj.calculateCompoundInterest(2000, 8, 1));
    }
}
