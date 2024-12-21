package com.gmail.mx.homework.oopworks.enumwork;

public class StartEnum {
    public static void main(String[] args) {
        Advisor advisor = new Advisor();

        System.out.println("Advise for Monday:");
        advisor.advise(Advisor.Day.MONDAY);

        System.out.println("Advise for Friday:");
        advisor.advise(Advisor.Day.FRIDAY);

        System.out.println("Advise for Saturday:");
        advisor.advise(Advisor.Day.SATURDAY);

    }
}
