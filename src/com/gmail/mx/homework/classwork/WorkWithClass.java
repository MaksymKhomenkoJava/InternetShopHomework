package com.gmail.mx.homework.classwork;

public class WorkWithClass {
    public static void main(String[] args){
        System.out.println("1. ");
        Person person1 = new Person("John", 30, "Developer");
        person1.print();

        Person person2 = new Person("Mary", 25, "Teacher");
        person2.print();

        Person person3 = new Person("Bob", 35, "Doctor");
        person3.print();

        System.out.println("2. ");
        person1.print();

        person1.newProfession("Desinger");
        person1.print();

        person1.name = "Sancho";
        person1.print();
    }
}
