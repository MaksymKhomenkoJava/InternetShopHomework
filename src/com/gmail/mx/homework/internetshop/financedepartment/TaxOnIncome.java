package com.gmail.mx.homework.internetshop.financedepartment;


import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class TaxOnIncome {
    public static void main(String[] args) {

        System.out.println("Enter the income amount:");
        Scanner scanner = new Scanner(System.in);
        double income = scanner.nextDouble();
        double minimumRate = 0.025;
        double maximumRate = 0.043;
        double mediumRate = 0.067;


        if (income <= 10000) {
            System.out.println("Tax rate 2.5% ");
            System.out.printf("Tax amount EUR: %.2f",income * minimumRate);
        } else {
            if (income <= 25000) {
            System.out.println("Tax rate 4.3% ");
            System.out.printf("Tax amount EUR: %.2f",income * mediumRate);
        } else {
            System.out.println("Tax rate 6.7% ");
            System.out.printf("Tax amount EUR: %.2f",income * maximumRate);
            }
        }
        }
    }




