package com.gmail.mx.homework.internetshop.salesdepartment;

public class FinalReport {
    public static void main(String[] args) {

        System.out.println();
        byte number = 1;
        String product = "smartphone";
        double price = 305.99;
        int unitWeek = 24;
        byte mouth = 30;
        double totalWeek = unitWeek*price;
        double totalDay = totalWeek/7;
        double totalMonth = totalDay*mouth;

        System.out.println("Product N " + number + " " + product + ".");
        System.out.printf("Sales for week EUR: = %.2f\n", totalWeek );
        System.out.printf("Sales for day EUR: = %.2f\n", totalDay );
        System.out.printf("Sales for mouth EUR: = %.2f\n", totalMonth );
        System.out.println();


        number ++;
        product = "laptop";
        price = 570.95;
        unitWeek = 34;
        mouth = 30;
        totalWeek = unitWeek*price;
        totalDay = totalWeek/7;
        totalMonth = totalDay*mouth;

        System.out.println("Product N " + number + " " + product + ".");
        System.out.printf("Sales for week EUR: = %.2f\n", totalWeek );
        System.out.printf("Sales for day EUR: = %.2f\n", totalDay );
        System.out.printf("Sales for mouth EUR: = %.2f\n", totalMonth );




    }

}