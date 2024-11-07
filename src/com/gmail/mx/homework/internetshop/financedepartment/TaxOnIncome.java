package com.gmail.mx.homework.internetshop.financedepartment;


import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class TaxOnIncome {
    public static void main(String[] args) {

        System.out.println("Enter the income amount:");
        Scanner scanner = new Scanner(System.in);
        double income = scanner.nextDouble();

        if (income <= 10000) {
            double minimumRate = 0.025;
            double betAmount = Math.round(income * minimumRate);
            System.out.println("Tax rate 2.5% amount EUR: " + betAmount);

        } else if (income <= 25000) {
            double mediumRate = 0.043;
            double betAmount = Math.round(income * mediumRate);
            System.out.println("Tax rate 4.3% amount EUR: " + betAmount);

        } else {
            double maximumRate = 0.067;
            double betAmount = Math.round(income * maximumRate);
            System.out.println("Tax rate 6.7% amount EUR: " + betAmount);

        }
    }
}





