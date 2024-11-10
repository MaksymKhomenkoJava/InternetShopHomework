package com.gmail.mx.homework.сyclesandoperatorsinthem.workthreecycles;

public class NumberSum {
    public static void main(String[] args) {
        int j = 1;
        int k = 1;

        for (int i = 1; i < 7; k++, i++, j += i) {

            System.out.println(k + ") Num is " + i + " sum is " + j);

        }
        System.out.println("Sum of numbers " + " " + j);
    }
}