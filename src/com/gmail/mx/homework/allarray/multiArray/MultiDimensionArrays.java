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
                matrix[i][j] = (int) (Math.random() * 50 + 1);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("_________________________________________");

        System.out.println("Total Sum Pared Line: " + countSumPairedLines(matrix));
        System.out.println();

        System.out.println("Total Sum Odd Line: " + countSumNotPairedLines(matrix));
        System.out.println();

        System.out.println("Total Multiplication Pared Colum: " + multiplyPairedColumns(matrix));
        System.out.println();

        System.out.println("Total Multiplication UnPared Colum: " + multiplyUnPairedColumns(matrix));
        System.out.println();

        int lineMagicSqare = calculateSumLines(matrix);
        int columnMagicSqare = calculateSumColumns(matrix);
        if (lineMagicSqare == columnMagicSqare) {
            System.out.println("==Calculate the sum of the diagonals and compare with the available sums==");
            } else {
            System.out.println("==Matrix is not a magic square==");
        }
        System.out.println();

    }

    public static int countSumPairedLines(int[][] matrix) {
        int totalSumParLine = 0;
        for (int i = 0; i < matrix.length; i = i + 2) {
            int sumParLine = 0;
            for (int j = 0; j < matrix.length; j++) {
                sumParLine += matrix[i][j];
            }
            System.out.println(i + " SumParLine: " + sumParLine);
            totalSumParLine += sumParLine;
        }
        return totalSumParLine;

    }

    public static int countSumNotPairedLines(int[][] matrix) {
        int totalSumUnParLine = 0;
        for (int i = 1; i < matrix.length; i = i + 2) {
            int sumUnParLine = 0;
            for (int j = 0; j < matrix.length; j++) {
                sumUnParLine += matrix[i][j];
            }
            System.out.println(i + " SumUnParLine: " + sumUnParLine);
            totalSumUnParLine += sumUnParLine;
        }
        return totalSumUnParLine;


    }

    public static int multiplyPairedColumns(int[][] matrix) {
        int totalMultParColum = 1;
        for (int j = 0; j < matrix.length; j = j + 2) {
            int multParColum = 1;
            for (int i = 0; i < matrix.length; i++) {
                multParColum = multParColum * matrix[i][j];
            }
            System.out.println(j + " MultParColum: " + multParColum);
            totalMultParColum = totalMultParColum * multParColum;
        }
        return totalMultParColum;
    }

    public static int multiplyUnPairedColumns(int[][] matrix) {
        int totalMultUnParColum = 1;
        for (int j = 1; j < matrix.length; j = j + 2) {
            int multUnParColum = 1;
            for (int i = 0; i < matrix.length; i++) {
                multUnParColum = multUnParColum * matrix[i][j];

            }
            System.out.println(j + " MultUnParColum: " + multUnParColum);
            totalMultUnParColum = totalMultUnParColum * multUnParColum;
        }
        return totalMultUnParColum;
    }

    public static int calculateSumLines(int[][] matrix) {
        int sumLines = 0;
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[i][j];
            }
            sumLines += sum;
        }
        return sumLines;
    }

    public static int calculateSumColumns(int[][] matrix) {
        int sumColums = 0;
        for (int j = 0; j < matrix.length; j++) {
            int sum = 0;
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][j];
            }
            sumColums += sum;
        }
        return sumColums;
    }


}

