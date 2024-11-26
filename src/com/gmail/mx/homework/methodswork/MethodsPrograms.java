package com.gmail.mx.homework.methodswork;

import java.util.Scanner;

public class MethodsPrograms {
    public static void main(String[] args) {

        System.out.println("Enter an integer: ");

        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        System.out.println("Number squared " + value + " equals " + pow(value));

        System.out.println("Enter an radius and height cylinder: ");
        double radius = scanner.nextDouble();
        double height = scanner.nextDouble();
        System.out.println("Volume cylinder with radius " + radius + " and height " + height + " equals " + calculateCylinderVolume(radius, height));

        System.out.println("Enter array elements: ");
        int number = scanner.nextInt();
        System.out.println("Sum array elements: " + sumArray(number));


//        String[] lines = {"=PRINT METHOD="};
//        System.out.println("=" + reversString(lines) + "=");
    }

    public static int pow(int value) {
        return value * value;
    }

    public static double calculateCylinderVolume(double radius, double height) {
        return 3.14 * radius * radius * height;
    }

    public static int sumArray(int number) {
        int[] array = new int[number];
        System.out.print("Array: ");
        System.out.println(" ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        int sumArray = 0;
        for (int i = 0; i < array.length; i++) {
            sumArray += array[i];
        }
        return sumArray;
    }


//    public static String reversString(String[] lines) {
////        lines[i] = lines.toString();
//        StringBuilder sb = new StringBuilder(lines);
//        reversedS
//        String result = "";
//        for (int i = 0; i < lines.length-1; i--) {
//            result = result + lines[i];
//        }
//        return result;
//    }

}


