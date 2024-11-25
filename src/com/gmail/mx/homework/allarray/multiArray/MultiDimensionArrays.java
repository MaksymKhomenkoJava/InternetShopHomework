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

        System.out.println("Total Sum Pared Line: " + countSumLines(matrix, 0));
        System.out.println();

        System.out.println("Total Sum Odd Line: " + countSumLines(matrix, 1));
        System.out.println();

        System.out.println("Total Multiplication Pared Colum: " + multiplyColumns(matrix, 0));
        System.out.println();

        System.out.println("Total Multiplication UnPared Colum: " + multiplyColumns(matrix, 1));
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

    public static int countSumLines(int[][] matrix, int index) {
        int totalSumLine = 0;
        for (int i = index; i < matrix.length; i = i + 2) {
            int sumLine = 0;
            for (int j = 0; j < matrix.length; j++) {
                sumLine += matrix[i][j];
            }
            if (i % 2 == 0) {
                System.out.println(i + " SumParLine: " + sumLine);
            } else {
                System.out.println(i + " SumUnParLine: " + sumLine);
            }
            totalSumLine += sumLine;
        }
        return totalSumLine;

    }

    public static long multiplyColumns(int[][] matrix, int index) {
        int totalMultColum = 1;
        for (int j = index; j < matrix.length; j = j + 2) {
            int multColum = 1;
            for (int i = 0; i < matrix.length; i++) {
                multColum = multColum * matrix[i][j];
            }
            if (j % 2 == 0) {
                System.out.println(j + " MultParColum: " + multColum);
            } else {
                System.out.println(j + " MultUnParColum: " + multColum);
            }
            totalMultColum = totalMultColum * multColum;
        }
        return totalMultColum;
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

