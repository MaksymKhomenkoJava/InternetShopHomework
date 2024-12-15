package com.gmail.mx.homework.oopworks.polymorphism;

public class Triagngle implements Shape {

    public double base;
    public double height;

    public Triagngle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public static double areaTriagngle(double base, double height) {
        return (base * height) / 2;
    }

        public double getBase () {
            return base;
        }

        public void setBase (double base){
            this.base = base;
        }

        public double getHeight () {
            return height;
        }

        public void setHeight ( double height){
            this.height = height;
        }

//        public void print () {
//            System.out.println("Area Square: " + areaTriagngle(base, height));
//        }

        public String toString () {
            return "Area Square: " + areaTriagngle(base, height);
        }

        @Override
        public double getArea () {
            return (base * height) / 2;
        }
    }
