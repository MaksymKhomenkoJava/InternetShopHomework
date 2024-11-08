package com.gmail.mx.homework.internetshop.financedepartment;


import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class TaxOnIncome {
    public static void main(String[] args) {

        System.out.println("Enter the income amount:");
        Scanner scanner = new Scanner(System.in);
        double income = scanner.nextDouble();

        double rate;
        if (income <= 10000) {
            rate = 0.025;
        } else if (income <= 25000) {
            rate = 0.043;
        } else {
            rate = 0.067;
        }
        double betAmount = Math.round(income * rate * 100) / 100.0;
        System.out.println("Tax rate " + rate + " amount EUR: " + betAmount);


    }
}





