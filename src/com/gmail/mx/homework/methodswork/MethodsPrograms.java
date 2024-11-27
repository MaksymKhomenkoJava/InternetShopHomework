package com.gmail.mx.homework.methodswork;

import java.util.Scanner;

public class MethodsPrograms {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int value = scanner.nextInt();
        System.out.println("Number squared " + value + " equals " + square(value));

        System.out.println("Enter an radius and height cylinder: ");
        double radius = scanner.nextDouble();
        double height = scanner.nextDouble();
        System.out.println("Volume cylinder with radius " + radius + " and height " + height + " equals " + calculateCylinderVolume(radius, height));

        System.out.println("Enter array elements: ");
        int number = scanner.nextInt();
        System.out.println("Sum array elements: " + sum(number));

        scanner.nextLine();
        System.out.println("Enter the word: ");
        String str = scanner.nextLine();
        System.out.println("Reverse word: \n" + reverse(str));

        System.out.println("Enter number a and number b: ");
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Result a^b equal: " + calculateNumberPower(a, b));

        System.out.println("Enter the text and number of conclusions: ");
        String text = scanner.nextLine();
        int n = scanner.nextInt();
        print(text, n);
    }

    public static int square(int value) {
        return value * value;
    }

    public static double calculateCylinderVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static int sum(int number) {
        int[] array = new int[number];
        System.out.print("Array: ");
        System.out.println(" ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }

        System.out.println(" ");
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static Double calculateNumberPower(double a, double b) {
//        return Math.pow(a, b);
        double result = 1;
        for (int i = 1; i <= b; i++) {
            result = result * a;
        }
        return result;
    }

    public static void print(String text, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }

    }

}


