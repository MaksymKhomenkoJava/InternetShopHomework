package com.gmail.mx.homework.allarray.sortingarray;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class SortAndSearch {
    public static void main(String[] args) {

        System.out.println("Enter array elements: ");

        Scanner scanner = new Scanner(System.in);
        int numeric = scanner.nextInt();
        int[] array = new int[numeric];

        System.out.print("Array: ");
        System.out.println(" ");

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.print("Array Insertion Sort: ");
        System.out.println(" ");
        for (int i = 0; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println(" ");
        System.out.println("Enter number x: ");

        int number = scanner.nextInt();

        System.out.println("Binary search:");
        int position = binarySort(array, number);
        if (position == 1) {
            System.out.print("Value not found");
        } else {
            System.out.printf("%d at position %d\n", number, position);

        }
        System.out.println(" ");
        System.out.println("____________________________________________ ");
        System.out.println("Check selection:");

        int arrayIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                arrayIndex = i;
                break;
            }
        }
        if (arrayIndex == -1) {
            System.out.print("Value not found");
        } else {
            System.out.print("Index number sorted array:\n");
            System.out.print(arrayIndex);
            System.out.println(" ");
            System.out.println("___________________________________________ ");
        }

    }

    public static int binarySort(int[] array, int number) {
        int left = 0;
        int right = array.length - 1;
        do {
            int middle = (left + right) / 2;
            if (array[middle] > number) {
                right = middle - 1;
            } else if (array[middle] < number) {
                left = middle + 1;
            } else {
                return middle;
            }
        } while (left <= right);
        return +1;
    }
}




