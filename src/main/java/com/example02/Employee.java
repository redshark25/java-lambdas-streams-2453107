package com.example02;

public class Employee {

    private String firstName;
    private String lastName;

    Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
}
