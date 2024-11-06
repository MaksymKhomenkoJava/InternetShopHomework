package com.gmail.mx.homework.internetshop.financedepartment;


import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class TaxOnIncome {
    public static void main(String[] args) {

        System.out.println("Enter the income amount:");
        Scanner scanner = new Scanner(System.in);
        double income = scanner.nextDouble();


        if (income <= 10000) {
            System.out.println("Tax rate 2.5% ");
            System.out.printf("amount to be paid EUR: %.2f",income * 0.025);
        } else {
            if (income <= 25000) {
            System.out.println("Tax rate 4.3% ");
            System.out.printf("amount to be paid EUR: %.2f",income * 0.043);
        } else {
            System.out.println("Tax rate 6.7% ");
            System.out.printf("amount to be paid EUR: %.2f",income * 0.067);
            }
        }
        }
    }




