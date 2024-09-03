package com.example03;

public class Main {
    public static void main(String[] args) {

        //one way of printing hello world
        Greeting greeting = new HelloGreeting();
        greeting.sayHello();

        // 2nd way
        Greeting greeting2 = new HelloGreeting(){
            @Override
            public void sayHello() {
                System.out.println("Hello World");
            }
        };

        greeting2.sayHello();

        //3rd way
        Greeting greeting3 = ()-> {
            System.out.println("Hello World");

        };
        greeting3.sayHello();

    }
}
