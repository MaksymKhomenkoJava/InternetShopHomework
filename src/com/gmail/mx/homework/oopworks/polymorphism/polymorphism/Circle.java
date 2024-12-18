package com.gmail.mx.homework.oopworks.polymorphism.polymorphism;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Area Circle: " + getArea();
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
