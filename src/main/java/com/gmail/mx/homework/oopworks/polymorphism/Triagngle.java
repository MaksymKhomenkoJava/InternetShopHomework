package com.gmail.mx.homework.oopworks.polymorphism;

public class Triagngle implements Shape {

    private double base;
    private double height;

    public Triagngle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Area Triagngle: " + getArea();
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }
}
