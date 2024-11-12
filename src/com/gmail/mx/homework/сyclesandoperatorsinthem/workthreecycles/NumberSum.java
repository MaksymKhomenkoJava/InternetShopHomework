package com.gmail.mx.homework.сyclesandoperatorsinthem.workthreecycles;

import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {


        System.out.println("Enter the num: ");
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
            System.out.println(i + ") Num is " + i + " sum is " + sum);

        }
        System.out.println("..............................");
        System.out.println("Sum of numbers is " + sum);
        System.out.println();

        int i = 1;
        sum = 0;
        while (i <= num) {
            sum += i;
            System.out.println(i + ") Num is " + i + " sum is " + sum);
            i++;
        }
        System.out.println("..............................");
        System.out.println("Sum of numbers is " + sum);
        System.out.println();

        if (num == 0) {
            return;
        }
        i = 1;
        sum = 0;
        do {

            sum += i;
            System.out.println(i + ") Num is " + i + " sum is " + sum);
            i++;
        } while (i <= num);
        System.out.println("..............................");
        System.out.println("Sum of numbers is " + sum);
    }
}



