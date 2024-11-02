package com.gmail.mx.homework.internetshop.salesdepartment;

public class FinalReport {
    public static void main(String[] args) {

        byte number = 1;
        String product = "smartphone";
        double price = 305.99;
        String currency = "EUR";
        byte unitDay = 8;
        byte day = 7;
        byte mouth = 30;
        String totalWeek = "week: ";
        String totalMonth = "month: ";

        double result = price*unitDay;
        totalWeek += result*day;
        totalMonth += result*mouth;

        System.out.println("Product N " + number + " " + product + ".");
        System.out.println("Sales for day:" + " " + result + " " + currency);
        System.out.println("Sales for " + " " + totalWeek + " " + currency);
        System.out.println("Total Sales for " + " " + totalMonth + " " + currency);

        number++;
        product = "laptop";
        price = 570.95;
        currency = "EUR";
        unitDay = 4;
        day = 7;
        mouth = 30;
        totalWeek = "week: ";
        totalMonth = "month: ";

        result = price*unitDay;
        totalWeek += result*day;
        totalMonth += result*mouth;

        System.out.println("Product N " + number + " " + product + ".");
        System.out.println("Sales for day:" + " " + result + " " + currency);
        System.out.println("Sales for " + " " + totalWeek + " " + currency);
        System.out.println("Total Sales for " + " " + totalMonth + " " + currency);



    }

}