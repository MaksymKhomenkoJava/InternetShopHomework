package com.gmail.mx.homework.allarray.workarray;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class TeacherVersion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 30;
        do {
            if (size < 0) {
                System.out.println("Wrong length(((");
            }
            System.out.print("Enter an array length: ");
            size = scanner.nextInt();
        } while (size < 0);
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(-100, 101);
        }

        System.out.print("[");
        for (int element : array) {
            System.out.print(element + "\t");
        }
        System.out.println("]");

        int sum = 0;
        for (int element : array) {
            if (element < 0) {
                sum += element;
            }
        }
        System.out.println("Sum for elements less than zero == " + sum);

        int evenCount = 0;
        for (int element : array) {
            if (element % 2 == 0) {
                evenCount++;
            }
        }
        System.out.printf("Even count == %d, odd count == %d\n", evenCount, array.length - evenCount);

        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[maxIndex] < array[i]) {
                maxIndex = i;
            }
            if (array[minIndex] > array[i]) {
                minIndex = i;
            }
        }
        System.out.printf("max element == %d and has index %d\n", array[maxIndex], maxIndex);
        System.out.printf("min element == %d and has index %d\n", array[minIndex], minIndex);

        int index = 0;
        while (index < array.length && array[index] >= 0) {
            index++;
        }
        System.out.println("index == " + index);
        if (index >= array.length) {
            System.out.println("No negative elements!!!");
        } else {
            sum = 0;
            for (int i = index + 1; i < array.length; i++) {
                sum += array[i];
            }
            System.out.println("Sum of elements after the first negative == " + sum);
        }
    }
}
