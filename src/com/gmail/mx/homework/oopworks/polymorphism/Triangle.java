package com.gmail.mx.homework.oopworks.polymorphism;

public class Triangle {

    public int base;
    public int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public static int areaTriangle(int base, int height) {
        return (base * height) / 2;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void print() {
        System.out.println("Area Triangle: " + areaTriangle(base, height));
    }

    @Override
    public String toString() {
        return "Area Triangle: " + areaTriangle(base, height);
    }

}
