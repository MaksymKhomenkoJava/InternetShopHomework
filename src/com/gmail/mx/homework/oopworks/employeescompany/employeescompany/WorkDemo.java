package com.gmail.mx.homework.oopworks.employeescompany.employeescompany;

public class WorkDemo {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Bob Marley", "musician ", "B.Marley@yahoo.com ", 123456789, 35),
                new Employee("Bruсe Lee", "kung fu master", "Bruce@gmail.com", 98754321, 28),
                new Employee("Jessica Alba", "actress", "AlbaJess@ukr.net", 22233311, 39)
        };

        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }
}
