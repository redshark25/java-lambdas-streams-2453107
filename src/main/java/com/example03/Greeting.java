package com.example03;

@FunctionalInterface
public interface Greeting {
    void sayHello();
    //void sayGoodbye();
    //when there is a functional interface tag its not possible
    // to add another method into the interface
}
