package com.example02;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        Function<Employee, String> fullName = employee -> {
            return employee.getFirstName() + " " + employee.getLastName();
        };
        System.out.println(fullName.apply(new Employee("John", "Doe")));;
    }
}
