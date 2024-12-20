package com.gmail.mx.homework.oopworks.innerclasses.interfaces;

public class ImputPrinter {
    public static void main(String[] args) {
        Printer printer = new StartPrinter();
        StartPrinter.Message message1 = new StartPrinter.Message("Hello", "Ivan");
        StartPrinter.Message message2 = new StartPrinter.Message("Message", "");
        StartPrinter.Message message3 = new StartPrinter.Message("", "");

        printer.print(message1);
        printer.print(message2);
        printer.print(message3);
    }
}
