package com.java.ExceptionHnadling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling3 {
    public static void main(String[] args) {
        try {
            // Arithmetic operation that may cause ArithmeticException
            int result = 10 / 0; // This line will throw ArithmeticException

            // File operation that may cause FileNotFoundException
            FileInputStream file = new FileInputStream("nonexistent.txt");
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException: " + e.getMessage());
        }
    }
}
