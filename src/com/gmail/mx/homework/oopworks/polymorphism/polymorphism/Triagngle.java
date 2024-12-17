package com.gmail.mx.homework.oopworks.polymorphism.polymorphism;

public class Triagngle implements Shape {

    private double base;
    private double height;

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

        public String toString () {
            return "Area Triagngle: " + areaTriagngle(base, height);
        }

        @Override
        public double getArea () {
            return (base * height) / 2;
        }
    }
