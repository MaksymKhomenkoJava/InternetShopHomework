package com.gmail.mx.homework.oopworks.polymorphism;

public class GeometricShares {
    public static void main(String[] args) {

        System.out.println("Area Geometric Shares: ");

        Circle circle = new Circle(10);
        circle.print();

        Square square = new Square(5, 6);
        square.print();

        Triangle triangle = new Triangle(4,9);
        triangle.print();

        System.out.println();

        circle.setRadius(2);
        System.out.println("New value " + circle);

        square.setLength(3);
        square.setWidth(4);
        System.out.println("New value " + square);

        triangle.setBase(7);
        triangle.setHeight(6);
        System.out.println("New value " + triangle);


    }


}
