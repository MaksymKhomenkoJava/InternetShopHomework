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
                matrix[i][j] = (int) (Math.random() * 50+1);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        int totalSumParLine = 0;
        for (int i = 0; i < matrix.length; i = i + 2) {
            int sumParLine = 0;
            for (int j = 0; j < matrix.length; j++) {
                sumParLine += matrix[i][j];
            }
            System.out.println(i + " SumParLine: " + sumParLine);
            totalSumParLine += sumParLine;
        }
        System.out.println(" TotalSumParLine: " + totalSumParLine);
        System.out.println();

        int totalSumUnParLine = 0;
        for (int i = 1; i < matrix.length; i = i + 2) {
            int sumUnParLine = 0;
            for (int j = 0; j < matrix.length; j++) {
                sumUnParLine += matrix[i][j];
            }
            System.out.println(i + " SumUnParLine: " + sumUnParLine);
            totalSumUnParLine += sumUnParLine;
        }
        System.out.println(" TotalSumUnParLine: " + totalSumUnParLine);
        System.out.println();

        int totalMultParColum = 1;
        for (int j = 0; j < matrix.length; j = j + 2) {
            int multParColum = 1;
            for (int i = 0; i < matrix.length; i++) {
                multParColum = multParColum * matrix[i][j];
            }
            System.out.println(j + " MultParColum: " + multParColum);
            totalMultParColum = totalMultParColum * multParColum;
        }
        System.out.println(" TotalMultParColum: " + totalMultParColum);
        System.out.println();

        int totalMultUnParColum = 1;
        for (int j = 1; j < matrix.length; j = j + 2) {
            int multUnParColum = 1;
            for (int i = 0; i < matrix.length; i++) {
                multUnParColum = multUnParColum * matrix[i][j];

            }
            System.out.println(j + " MultUnParColum: " + multUnParColum);
            totalMultUnParColum = totalMultUnParColum * multUnParColum;
        }
        System.out.println(" TotalMultUnParColum: " + totalMultUnParColum);
        System.out.println();

    }
}

