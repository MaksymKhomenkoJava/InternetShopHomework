package com.gmail.mx.homework.calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("1! ==" + calculator.factorial(1));
        System.out.println("3! ==" + calculator.factorial(3));
    }
}
