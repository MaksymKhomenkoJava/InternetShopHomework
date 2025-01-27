package com.gmail.mx.homework.сyclesandoperatorsinthem.workthreecycles;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Repetition {
    public static void main(String[] args) {

        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;
            System.out.println(i + "). Num is " + i + " Sum is " + sum);
        }
        System.out.println("");
        sum = 0;
        int i = 1;
        while (i <= number) {
            sum += i;
            System.out.println(i + "). Num is " + i + " Sum is " + sum);
            i++;
        }
        System.out.println("");
        sum = 0;
        i = 1;
        do {
            sum += i;
            System.out.println(i + "). Num is " + i + " Sum is " + sum);
            i++;
        } while (i <= number);

    }
}

