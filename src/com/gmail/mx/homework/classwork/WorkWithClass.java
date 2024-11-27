package com.gmail.mx.homework.classwork;

public class WorkWithClass {
    public static void main(String[] args){
        Person person = new Person("John", 25, "Developer");
        person.print();
        person.newProfession("Desinger");
        person.print();
    }
}
