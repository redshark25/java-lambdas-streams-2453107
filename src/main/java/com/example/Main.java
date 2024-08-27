package com.example;

import java.util.Random;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;

public class Main {

  public static void main(String[] args) {

    Greeting greeting = new HelloWorldGreeting();
    greeting.sayHello();

    Greeting greeting2 = new Greeting() {
      @Override
      public void sayHello() {
        System.out.println("Hello World");
      }
    };
    greeting2.sayHello();

    Greeting greeting3 = ()-> System.out.println("Hello World using lambda Fuction");
    greeting3.sayHello();

    Calculator calculator = (int x, int y)-> {
      Random random = new Random();
      int randomNumber = random.nextInt(100);
      return randomNumber+x+y;
    };
    System.out.println(calculator.calculate(1,2));

    IntBinaryOperator calculator2 = (int x, int y) ->{
      return x+y;

    };

   Function <String, Integer> function = (str) -> str.length();
    System.out.println("using lambda "+function.apply("hello world"));

    System.out.println("test "+calculator2.applyAsInt(1,8));
  }








}
