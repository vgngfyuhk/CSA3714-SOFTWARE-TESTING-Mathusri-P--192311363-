package com.softwaretesting;

public class Exp29 {

    public double convertToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {

        Exp29 obj = new Exp29();

        System.out.println("CELSIUS TO FAHRENHEIT CONVERSION");
        System.out.println("--------------------------------");

        System.out.println("0 Celsius = " + obj.convertToFahrenheit(0) + " Fahrenheit");
        System.out.println("25 Celsius = " + obj.convertToFahrenheit(25) + " Fahrenheit");
        System.out.println("100 Celsius = " + obj.convertToFahrenheit(100) + " Fahrenheit");
        System.out.println("-40 Celsius = " + obj.convertToFahrenheit(-40) + " Fahrenheit");
        System.out.println("37 Celsius = " + obj.convertToFahrenheit(37) + " Fahrenheit");
    }
}
