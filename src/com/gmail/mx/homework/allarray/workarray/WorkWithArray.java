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

        int maxElement = numbers[0];
        int minElement = numbers[0];
        int indexMax = 0;
        int indexMin = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxElement) {
                maxElement = numbers[i];
                indexMax = i;
            }
            else if (numbers[i] < minElement) {
                minElement = numbers[i];
                indexMin = i;
            }
        }
        System.out.println("2. Max array element: " + maxElement + "[" + indexMax + "]");
        System.out.println("3. Min array element: " + minElement + "[" + indexMin + "]");
        System.out.println(" ");

        int evenElement = 0;
        int oddElement = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenElement++;
            }
            if (numbers[i] % 2 != 0) {
                oddElement++;
            }
        }
        System.out.println("4. Even array element: " + evenElement);
        System.out.println("5. Odd array element: " + oddElement);
        System.out.println(" ");

        int sumNegative = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                sumNegative += numbers[i];
            }
        }
        System.out.println("6. Sum of negative array element: " + sumNegative);
        System.out.println(" ");

        int a = 0;
        int b = 0;
        while (a >= 0 && a < numbers.length) {
            if (numbers[a] < 0) {
                a = numbers[a];
            }
            a++;
            b++;
        }
        System.out.println("7. first negative number:" + (a - 1));
        int sumAfterFirst = 0;
        for (int i = b ; i < numbers.length; i++) {
            sumAfterFirst += numbers[i];
        }
        System.out.println("8. Sum of numbers after the first negative: " + sumAfterFirst);

        int average = sumAfterFirst/(numbers.length-b);

        System.out.println("9. Arithmetic average : " + average);

        int sumArray = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumArray += numbers[i];
        }
        System.out.println("10. Sum array all element: " + sumArray);
    }


}



