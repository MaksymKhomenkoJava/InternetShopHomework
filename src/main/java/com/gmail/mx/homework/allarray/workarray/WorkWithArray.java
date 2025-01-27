package com.gmail.mx.homework.allarray.workarray;

import java.util.Arrays;

public class WorkWithArray {
    public static void main(String[] args) {

        System.out.println("1. Elements array: ");
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 200 - 100);
            System.out.println("index [" + i + "]" + " number " + numbers[i]);
        }
        System.out.println(" ");

        int maxIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[maxIndex]) {
                numbers[maxIndex] = numbers[i];
                maxIndex = i;
            }
        }
        System.out.println("2. Max array element: " + numbers[maxIndex] + "[" + maxIndex + "]");

        int minIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[minIndex]) {
                numbers[minIndex] = numbers[i];
                minIndex = i;

            }
        }
        System.out.println("3. Min array element: " + numbers[minIndex] + "[" + minIndex + "]");
        System.out.println(" ");

        int evenElements = 0;
        int oddElements = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenElements++;
            }
            if (numbers[i] % 2 != 0) {
                oddElements++;
            }
        }
        System.out.println("4. Even array element: " + evenElements);
        System.out.println("5. Odd array element: " + oddElements);
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
        while (a >= 0) {
            if (numbers[a] < 0) {
                a = numbers[a];
            }
            a++;
            b++;
        }
        System.out.println("7. first negative number:" + (a - 1));
        int sumAfterFirst = 0;
        for (int i = b; i < numbers.length; i++) {
            sumAfterFirst += numbers[i];
        }
        System.out.println("8. Sum of numbers after the first negative: " + sumAfterFirst);

        int average = sumAfterFirst / (numbers.length - b);

        System.out.println("9.  average : " + average);

        int sumArray = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumArray += numbers[i];
        }
        System.out.println("10. Sum array all element: " + sumArray);
    }


}



