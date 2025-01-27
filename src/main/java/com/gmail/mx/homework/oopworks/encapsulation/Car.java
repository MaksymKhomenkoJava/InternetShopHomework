package com.gmail.mx.homework.oopworks.encapsulation;

public class Car {

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();

    }

    private void startElectricity() {
        System.out.println("Start Electricity");
    }

    private void startCommand() {
        System.out.println("Start Command");
    }

    private void startFuelSystem() {
        System.out.println("Start FuelSystem");
    }
}
