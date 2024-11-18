package com.gmail.mx.homework.allarray.sortingarray;

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
        for (int j = 0; j < array.length; j++)

            System.out.print(array[j] + " ");
        System.out.println(" ");
        System.out.println("Enter number x: ");

        int number = scanner.nextInt();
        int x = number;
        int xIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                xIndex = i;
                break;
            }

        }
        System.out.print("Index number of a number in a sorted array:\n");
        System.out.print(xIndex);

    }


}

