package com.gmail.mx.homework.oopworks.polymorphism;

public class Square {

    public int length;
    public int width;

    public Square(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public static int areaSquare(int length, int width) {
        return length * width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void print() {
        System.out.println("Area Square: " + areaSquare(length, width));
    }

    @Override
    public String toString() {
        return "Area Square: " + areaSquare(length, width);
    }
}




