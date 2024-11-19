package com.gmail.mx.homework.allarray.multiArray;

import java.util.Scanner;

public class MultiDimensionArrays {
    public static void main(String[] args) {

        System.out.println("Enter array elements: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("=== Matrix ===");
        int[][] matrix = new int[number][number];

        for (int i = 0; i < matrix.length; i++) {
           for (int j = 0; j < matrix.length; j++) {
               matrix[i][j] = (int)(Math.random()*50);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }


    }

}


