package com.gmail.mx.homework.allarray.sortingarray;

import java.util.Scanner;

public class SortAndSearch {
       public static void main(String[] args){

           System.out.println("Enter array elements: ");
           Scanner scanner = new Scanner(System.in);
           int numeric = scanner.nextInt();
           int[] numbers = new int[numeric];

           for (int i = 0; i < numbers.length; i++) {
               numbers[i] = (int) (Math.random() * 100);
               System.out.println("index [" + i + "]" + " number " + numbers[i]);
           }
           System.out.println(" ");
    }
}
