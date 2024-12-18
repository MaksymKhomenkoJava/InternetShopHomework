package com.gmail.mx.homework.oopworks.polymorphism.polymorphism;

public class GeometricFigures {
    public static void main(String[] args) {

        System.out.println("Area Geometric Figures: ");
        System.out.println();

        Circle circle = new Circle(10);
        System.out.println(circle);

        Square square = new Square(5);
        System.out.println(square);

        Triagngle triangle = new Triagngle(4, 9);
        System.out.println(triangle);

        System.out.println();
        System.out.println("New Area Geometric Figures: ");
        System.out.println();

        circle.setRadius(2);
        System.out.println("New value " + circle);

        square.setSide(3);
        System.out.println("New value " + square);

        triangle.setBase(7);
        triangle.setHeight(6);
        System.out.println("New value " + triangle);

        System.out.println();
        System.out.println("Array Area Geometric Figures: ");
        System.out.println();

        Shape[] shapes = new Shape[]{
                new Circle(1),
                new Square(1),
                new Triagngle(1, 1)
        };

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        System.out.println();

        double totalArea = calculateTotalArea(shapes);
        System.out.println("Total area array figures " + totalArea);
    }

    public static double calculateTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }
}

