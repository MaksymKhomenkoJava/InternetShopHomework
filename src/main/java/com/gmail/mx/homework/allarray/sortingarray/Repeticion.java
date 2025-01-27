package com.gmail.mx.homework.allarray.sortingarray;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Repeticion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array Elements: ");
        int size = scanner.nextInt();
        int[] array = generate(size);

        System.out.print("Array: ");
        System.out.println(" ");
        print(array);
        insertionSort(array);
        System.out.println();
        System.out.print("Array Insertion Sort: ");
        System.out.println();
        print(array);
        System.out.println();
        System.out.print("Search number: ");
        int number = scanner.nextInt();
        int position = binarySort(array, number);
        if (position < 0) {
            System.out.println("Not element in array");
        } else {
            System.out.println(number + "at position" + position);
        }
    }

    public static int[] generate(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 101);
        }
        return array;
    }

    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(",");
            }
            System.out.print(array[i]);
        }
        System.out.print("]");
    }

    private static void insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    private static int binarySort(int[] array, int number) {
        int left = 0;
        int right = array.length - 1;
        do {
            int middle = (left + right) / 2;
            if (array[middle] > number) {
                right = middle - 1;
            } else {
                if (array[middle] < number) {
                    left = middle + 1;
                } else {
                    return middle;
                }
            }
        } while (left <= right);
        return -1;


    }
}



