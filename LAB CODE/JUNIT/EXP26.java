
package com.softwaretesting;

public class Exp26 {

    public int findLargest(int[] arr) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {

        Exp26 obj = new Exp26();

        int[] arr1 = {10, 25, 15, 40, 30};
        int[] arr2 = {-5, -2, -10, -1};
        int[] arr3 = {7};

        System.out.println("LARGEST ELEMENT IN AN ARRAY");
        System.out.println("------------------------------");

        System.out.println("Array 1: 10, 25, 15, 40, 30");
        System.out.println("Largest: " + obj.findLargest(arr1));

        System.out.println("Array 2: -5, -2, -10, -1");
        System.out.println("Largest: " + obj.findLargest(arr2));

        System.out.println("Array 3: 7");
        System.out.println("Largest: " + obj.findLargest(arr3));
    }
}
