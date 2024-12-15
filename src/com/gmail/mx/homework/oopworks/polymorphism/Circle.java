package com.gmail.mx.homework.oopworks.polymorphism;

public class Circle implements Shape{

    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public static double areaCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

//    public void print() {
//        System.out.println("Area Circle: " + areaCircle(radius));
//    }

    public String toString() {
        return "Area Circle: " + areaCircle(radius);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
