package com.gmail.mx.homework.classwork;

public class Person {
    private String name;
    private int age;
    private String profession;
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
