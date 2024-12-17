package com.gmail.mx.homework.oopworks.polymorphism.polymorphism;

public class Square implements Shape{

    private double side;

    public Square(double side) {
        this.side = side;

    }

    public static double areaSquare(double side) {
        return side * side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public String toString(){
        return "Area Square: " + areaSquare(side);
    }

    @Override
    public double getArea() {
        return side * side;
    }
}





