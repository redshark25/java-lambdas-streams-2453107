package com.example05;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Saman",5, "panadura", "");

        SomeOtherClass someOtherClass = new SomeOtherClass();
        System.out.println( someOtherClass.firstAssignment.assignJob(person).getJob());;
    }



}
