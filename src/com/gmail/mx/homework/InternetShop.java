package com.gmail.mx.homework;

public class InternetShop {
    public static void main(String[] args) {

//                ⬇ my version of homework ⬇
//      int order = 1 ;
//      String client = " Client: Alice";
//      String product = "smartphone";
//      double price = 305.99;
//      String address = "Moon Street, 10";
//      System.out.println("Order № " + order + client +".");
//      System.out.println("Product: " + product + ",");
//      System.out.println("price EUR " + price + ".");
//      System.out.println("Address: " + address + ".");
//
//      order = 2 ;
//      client = " Client: Tom";
//      product = "Laptop";
//      price = 570.95;
//      address = "Terre Street, 17";
//      System.out.println("Order № " + order + client + "."+"\n"+"Product: " + product + "."+"\n"+"price EUR " + price + "."+"\n"+"Address " + address + ".");

//               ⬇ teacher's version ⬇

        byte number = 1;
        String client = "Alice";
        String product = "smartphone";
        double price = 305.99;
        String address = "Moon Street, 10";
        System.out.println("Order No " + number + " Client: " + client + ".");
        System.out.println("Product: " + product + ",");
        System.out.println("price EUR " + price + ".");
        System.out.println("Address: " + address + ".");

        number++;
        client = "Tom";
        product = "laptop";
        price = 570.95;
        address = "Terra Street, 17";
        System.out.println("Order No " + number + " Client: " + client + ".");
        System.out.println("Product: " + product + ",");
        System.out.println("price EUR " + price + ".");
        System.out.println("Address: " + address + ".");
    }


    }
