package com.example04;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = (int x, int y)-> {

            return  x * y ;
        };

        System.out.println( calculator.add(3,5));;
    }

}
