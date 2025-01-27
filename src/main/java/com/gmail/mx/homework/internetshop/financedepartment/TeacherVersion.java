package com.gmail.mx.homework.internetshop.financedepartment;

import java.util.Scanner;

public class TeacherVersion {
    public static void main(String[] args) {
        System.out.print("Input value: ");
        Scanner scanner = new Scanner(System.in);
        double value = scanner.nextDouble();

        double taxRate;
        if (value <= 10_000) {
//            double tax = value * 2.5 / 100;
//            System.out.println("Your calculated tax is " + tax);
            taxRate = 2.5;
        } else if (value <= 25_000) {
//            double tax = value * 4.3 / 100;
//            System.out.println("Your calculated tax is " + tax);
            taxRate = 4.3;
        } else {
//            double tax = value * 6.7 / 100;
//            System.out.println("Your calculated tax is " + tax);
            taxRate = 6.7;
        }

        double tax = value * taxRate / 100;
        System.out.println("Your calculated tax is " + tax);
    }
}

