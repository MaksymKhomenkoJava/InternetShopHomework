package com.gmail.mx.homework.oopworks.polymorphism;

public class Circle {

    public int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public static int areaCircle(int radius) {
        return (int) (Math.PI * radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Area Circle: " + areaCircle(radius);
    }
    public void print() {
        System.out.println("Area Circle: " + areaCircle(radius));
    }
}
