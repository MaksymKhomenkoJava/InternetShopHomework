package com.gmail.mx.homework.allarray.workarray;

public class WorkWithArray {
    public static void main(String[] args) {

        int [] numbers = new int[]{1,-2,-12,3,4,-5,60,7,81,9,-10};

        System.out.println("Elements array numbers: ");
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            System.out.println("Elements[" + i + "]: " + numbers[i]);

        }
        System.out.println("Sum elements array: " + sum);

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i]>max) {
                max = numbers[i];
            }
        }
        System.out.println("Max number array: " + max);

    }
}
