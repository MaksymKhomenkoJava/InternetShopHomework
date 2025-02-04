package com.gmail.mx.homework.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void zero() {
        // give
        Calculator calculator = new Calculator();

        //when
//        calculator.factorial(0);
        long result = calculator.factorial(0);

        //then
        Assertions.assertNotNull(calculator);
        Assertions.assertEquals(1, result);
        System.out.println("0! ==" + calculator.factorial(0));
        ;
    }

    @Test
    void one() {
        // give
        Calculator calculator = new Calculator();

        //when
//        calculator.factorial(1);
        long result = calculator.factorial(1);

        //then
        Assertions.assertNotNull(calculator);
        Assertions.assertEquals(1, result);
        System.out.println("1! ==" + calculator.factorial(3));
        ;
    }

    @Test
    void three() {
        // give
        Calculator calculator = new Calculator();

        //when
//        calculator.factorial(1);
        long result = calculator.factorial(3);

        //then
        Assertions.assertNotNull(calculator);
        Assertions.assertEquals(6, result);
        System.out.println("3! ==" + calculator.factorial(6));
    }
}
