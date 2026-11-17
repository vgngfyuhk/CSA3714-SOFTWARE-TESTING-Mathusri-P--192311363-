
package com.softwaretesting;

public class Exp25 {

    public String calculateGrade(int marks) {

        if (marks < 0 || marks > 100) {
            return "Invalid Marks";
        } else if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {

        Exp25 obj = new Exp25();

        System.out.println("STUDENT GRADE CALCULATION");
        System.out.println("------------------------------");

        System.out.println("95 : " + obj.calculateGrade(95));
        System.out.println("85 : " + obj.calculateGrade(85));
        System.out.println("75 : " + obj.calculateGrade(75));
        System.out.println("65 : " + obj.calculateGrade(65));
        System.out.println("40 : " + obj.calculateGrade(40));
        System.out.println("105 : " + obj.calculateGrade(105));
    }
}
