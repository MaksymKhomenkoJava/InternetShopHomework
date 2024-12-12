package com.gmail.mx.homework.oopworks;

public class Employee {
    private final String name;
    private final String profession;
    private final String email;
    private final long phone;
    private final int age;

    public Employee(String name, String profession, String email, long phone, int age) {
        this.name = name;
        this.profession = profession;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }
    public void print(){
        System.out.println("Name: " + name + " Profession: " + profession + " E-mail: " + email + " Phone " + phone + " Age: " + age );
    }
}
