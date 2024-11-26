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


    }

    public static int pow(int value) {
        return value * value;
    }

    public static double calculateCylinderVolume(double radius, double height) {
        return 3.14*radius*radius*height;
    }
}
