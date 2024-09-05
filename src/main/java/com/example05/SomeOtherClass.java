package com.example05;

public class SomeOtherClass {

    AssignJob firstAssignment = (Person person)-> {
        if(person.getAge() > 35){

            person.setJob("Manager");
            return person;
        }else {
            person.setJob("Not a Manager");
            return person;}
    };
}
