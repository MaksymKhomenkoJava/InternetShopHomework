package com.gmail.mx.homework.internetshop.financedepartment;


import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class TaxOnIncome {
    public static void main(String[] args) {

        System.out.println("Enter the income amount:");
        Scanner scanner = new Scanner(System.in);
        double income = scanner.nextDouble();


        if (income <= 10000) {
            System.out.println("Tax rate 2.5% amount to be paid: " + income * 0.025 + " " + "EUR");
        } else {
            if (income <= 25000) {
            System.out.println("Tax rate 4.3% amount to be paid: " + income * 0.043 + " " + "EUR");
        } else {
            System.out.println("Tax rate 6.7% amount to be paid: " + income * 0.067 + " " + "EUR");
            }
        }
        }
    }




