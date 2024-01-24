package com.java.ExceptionHnadling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling7 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } finally {
            // Finally block executes regardless of an exception
            System.out.println("This finally block always executes");
        }
        System.out.println("Rest of the code");
    }
}
