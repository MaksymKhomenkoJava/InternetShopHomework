package com.gmail.mx.homework.allarray.workarray;

import java.util.Arrays;

public class WorkWithArray {
    public static void main(String[] args) {

        System.out.println("1. Elements array: ");
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 200 - 100);
            System.out.println("index [" + i + "]" + " number " + numbers[i]);
        }
        System.out.println(" ");

        int max = numbers[0];
        int min = numbers[0];
        int indexmax = 0;
        int indexmin = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                indexmax = i;
            }
            if (numbers[i] < min) {
                min = numbers[i];
                indexmin = i;
            }
        }
        System.out.println("2. Max array element: " + max + "[" + indexmax + "]");
        System.out.println("3. Min array element: " + min + "[" + indexmin + "]");
        System.out.println(" ");

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
        System.out.println("4. Even array element: " + a);
        System.out.println("5. Odd array element: " + b);
        System.out.println(" ");

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                sum += numbers[i];
            }
        }
        System.out.println("6. Sum of negative array element: " + sum);
        System.out.println(" ");

////        sum = 0;
//        int j = 0;
//        while (j < 1) {
//            int i = 0;
//            if (numbers[i] < 0) {
//                j = numbers[i];
//                break;
//            }
//            i = i + 1;
//
//            System.out.println("first negative number:" + j);
//
//        }


//        for (int i = a + 1; i < numbers.length; i++) {
//            sum += numbers[i];
//        }
//        System.out.println("Sum of numbers after the first negative:" + sum);
    }
}
