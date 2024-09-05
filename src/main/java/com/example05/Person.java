package com.example05;

public class Person {

    private String name;
    private int age;
    private String address;
    private String job;

    Person(String name, int age, String address, String job) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getJob() {
        return job;
    }
}
