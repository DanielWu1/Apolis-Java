package com.java.ExceptionHnadling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling5 {
    public ExceptionHandling5(String file) {
    }

    public static void main(String[] args) {
        try {
            // Outer try block for file operation
            int[] numbers = { 1, 2, 3 };
            System.out.println("Accessing element at index 5: " + numbers[2]);
            try {
                // Inner try block for number parsing operation
                String numberStr = "123abc";
                int number = Integer.parseInt(numberStr);
            } catch (NumberFormatException e) {
                System.out.println("Inner catch - NumberFormatException: " + e.getMessage());
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds " + e.getMessage());
        }

        System.out.println("Rest of the code");
    }
}
