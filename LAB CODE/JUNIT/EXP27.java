
package com.softwaretesting;

public class Exp27 {

    public double calculateAverage(int[] numbers) {

        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int sum = 0;

        for (int number : numbers) {
            sum = sum + number;
        }

        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {

        Exp27 obj = new Exp27();

        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {5, 10, 15};
        int[] arr3 = {100};

        System.out.println("AVERAGE OF N NUMBERS");
        System.out.println("------------------------------");

        System.out.println("Average of 10, 20, 30, 40, 50 : "
                + obj.calculateAverage(arr1));

        System.out.println("Average of 5, 10, 15 : "
                + obj.calculateAverage(arr2));

        System.out.println("Average of 100 : "
                + obj.calculateAverage(arr3));
    }
}
