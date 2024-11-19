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

        int sumParLine;
        for (int i = 0; i < matrix.length; i = i + 2) {
            sumParLine = 0;
            for (int j = 0; j < matrix.length; j++) {
                sumParLine += matrix[i][j];
            }
            System.out.println(i + " SumParLine: " + sumParLine);

        }
        System.out.println();

        int sumUnParLine;
        for (int i = 1; i < matrix.length; i = i + 2) {
            sumUnParLine = 0;
            for (int j = 0; j < matrix.length; j++) {
                sumUnParLine += matrix[i][j];
            }
            System.out.println(i + " SumUnParLine: " + sumUnParLine);
        }
        System.out.println();

        int multParColum;
        for (int j = 0; j < matrix.length; j = j + 2) {
            multParColum = 1;
            for (int i = 0; i < matrix.length; i++) {
                multParColum = multParColum * matrix[i][j];

            }
            System.out.println(j + " MultParColum: " + multParColum);
        }
        System.out.println();
        int multUnParColum;
        for (int j = 1; j < matrix.length; j = j + 2) {
            multUnParColum = 1;
            for (int i = 0; i < matrix.length; i++) {
                multUnParColum = multUnParColum * matrix[i][j];

            }
            System.out.println(j + " MultParColum: " + multUnParColum);
        }
        System.out.println();




    }
}

