package com.gmail.mx.homework.allarray.sortingarray;

import java.util.Arrays;
import java.util.Scanner;

public class SortAndSearch {
    public static void main(String[] args) {

        System.out.println("Enter array elements: ");

        Scanner scanner = new Scanner(System.in);
        int numeric = scanner.nextInt();
        int[] array = new int[numeric];

        System.out.print("Array: [");

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.print(" ]");
        System.out.println();

        int n = array.length;
        int minIndex = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int k = i + 1; k < n; k++) {
                minIndex = i;
                if (array[k] < array[i]) {
                    minIndex = k;
                }
                if (minIndex != i) {
                    int a = array[i];
                    array[i] = array[k];
                    array[k] = a;
                    System.out.print(" "+array[k]+" ");
                }


            }

        }
            }
}
