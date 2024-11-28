package com.gmail.mx.homework.workwithclass;

public class Person {
    String name;
    int age;
    String profession;

    public Person(String name, int age, String profession){
        this.name = name;
        this.age = age;
        this.profession = profession;
    }
    public void print(){
        System.out.println("Name: " + name + ", Age: " + age + ", Profession: " + profession);
    }

    public void newProfession(String newJob){
        profession = newJob;
    }
}