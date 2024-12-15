package com.gmail.mx.homework.oopworks.polymorphism;

public class Square implements Shape{

    public double side;

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

//    public void print() {
//        System.out.println("Area Square: " + areaSquare(side));
//    }

    public String toString(){
        return "Side of Square: " + areaSquare(side);
    }

    @Override
    public double getArea() {
        return side * side;
    }
}





