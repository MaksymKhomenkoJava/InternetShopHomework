package com.gmail.mx.homework.allarray.workarray;

import java.util.Arrays;

public class WorkWithArray {
    public static void main(String[] args) {

        System.out.println("Elements array: ");
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 200 - 100);
            System.out.println(" index [" + i + "]" + "  " + numbers[i]);
        }
        int max = numbers[0];
        int index = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                index = i;
            }
        }
        System.out.println("Max number array: " + max + "[" + index + "]");

        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                index = i;
            }
        }
        System.out.println("Max number array: " + min + "[" + index + "]");

        int a = 0;
        int b = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                a++;
            }
            if (numbers[i] % 2 != 0) {
                b++;
            }
        }
        System.out.println("Even numbers: " + a);
        System.out.println("Odd numbers: " + b);

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                sum += numbers[i];
            }
        }
        System.out.println("Sum of negative numbers: " + sum);

    }
}
