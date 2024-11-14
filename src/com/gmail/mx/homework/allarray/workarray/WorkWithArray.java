package com.gmail.mx.homework.allarray.workarray;

import java.util.Arrays;

public class WorkWithArray {
    public static void main(String[] args) {
// масив з випадкових цылих чисел
        System.out.println("1. Elements array: ");
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 200 - 100);
            System.out.println("index [" + i + "]" + " number " + numbers[i]);
        }
        System.out.println(" ");
// мынымальний та максимальний елемент масиву
        int max = numbers[0];
        int min = numbers[0];
        int indexmax = 0;
        int indexmin = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                indexmax = i;
            }
            if (numbers[i] < min) {
                min = numbers[i];
                indexmin = i;
            }
        }
        System.out.println("2. Max array element: " + max + "[" + indexmax + "]");
        System.out.println("3. Min array element: " + min + "[" + indexmin + "]");
        System.out.println(" ");
// парні та непарні числа
        int a = 0;
        int b = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                a++;
            }
            if (numbers[i] % 2 != 0) {
                b++;
            }
        }
        System.out.println("4. Even array element: " + a);
        System.out.println("5. Odd array element: " + b);
        System.out.println(" ");
// сума від'ємних чисел
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                sum += numbers[i];
            }
        }
        System.out.println("6. Sum of negative array element: " + sum);
        System.out.println(" ");
// перше негативне, сума елементів після першої негативної, сума всіх улементів
        a = 0;
        b = 0;
        while (a >= 0 && a < 20) {
            if (numbers[a] < 0) {
                a = numbers[a];
            }
            a++;
            b++;
        }
        System.out.println("first negative number:" + (a - 1));

        for (int i = b + 1; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of numbers after the first negative:" + sum);

        int sumarray = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumarray += numbers[i];
        }
        System.out.println("Sumarray all element: " + sumarray);
    }


}



