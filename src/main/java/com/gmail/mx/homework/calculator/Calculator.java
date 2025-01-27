package com.gmail.mx.homework.calculator;

public class Calculator {
    public long factorial(int n){
        long result = 1;
        for (int i = 1; i <=n; i++) {
            result *=i;
        }
        return result;
    }
}
