package com.gmail.mx.homework.workwithclass;

public class WorkWithClass {
    public static void main(String[] args) {
//        варіант 1
        System.out.println("1. ");
        Person[] persons = {
                new Person("John", 30, "Developer"),
                new Person("Mary", 25, "Teacher"),
                new Person("Bob", 35, "Doctor")
        };
        for (Person person : persons) {
            person.print();
        }

        System.out.println("2. ");

        persons[0].newProfession("Desinger");
        persons[0].print();

        System.out.println("3. ");
        persons[1].name = "Sancho";
        persons[1].print();

//        варіан 2 буде працювати при пустому конструкторі public Person()
//        System.out.println("1. ");
//        Person person1 = new Person();
//        person1.name = "John";
//        person1.age = 30;
//        person1.profession = "Developer";
//        person1.print();
//
//        Person person2 = new Person();
//        person2.name = "Mary";
//        person2.age = 25;
//        person2.profession = "Teacher";
//        person2.print();
//
//        Person person3 = new Person();
//        person3.name = "Bob";
//        person3.age = 35;
//        person3.profession = "Doctor";
//        person3.print();
//
//        System.out.println("2. ");
//        person1.print();
//
//        person1.newProfession("Desinger");
//        person1.print();
//
//        person1.name = "Sancho";
//        person1.print();
    }
}
