package com.gmail.mx.homework.oopworks.employeescompany;

public class Employee {
    private String name;
    private String profession;
    private String email;
    private long phone;
    private int age;

    public Employee(String name, String profession, String email, long phone, int age) {
        this.name = name;
        this.profession = profession;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhoneNumber(long phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
        public String toString() {
            return "Employee " + " Name: " + name + ", Profession: " + profession + ", E-mail: " + email + ", Phone " + phone + ", Age: " + age;
        }

}
