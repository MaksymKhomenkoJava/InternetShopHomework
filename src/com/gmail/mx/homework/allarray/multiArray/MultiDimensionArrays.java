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
                matrix[i][j] = (int) (Math.random() * 50);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        int sumLine;
        for (int i = 0; i < matrix.length; i=i+2) {
            sumLine = 0;
            for (int j = 0; j < matrix.length; j++) {
                sumLine += matrix[i][j];
            }
            System.out.println(i + " SumLine: " + sumLine);

        }
        System.out.println();

        int sumColum;
        for (int j = 0; j < matrix.length; j++) {
            sumColum = 0;
            for (int i = 0; i < matrix.length; i++) {
                sumColum += matrix[i][j];

            }
            System.out.println(j + " SumColum: " + sumColum);
        }
        System.out.println();


//        for (int i = 0; i < matrix.length; i++) {
//            int sumLine = 0;
//            for (int j = 0; j < matrix.length; j++) {
//                if (matrix[i][j] % 2 == 0) {
//                    sumLine += matrix[i][j];
//                } else {
//                    break;
//                }
//            }
//            System.out.println(i + " SumLine: " + sumLine);

//        }

    }
}

