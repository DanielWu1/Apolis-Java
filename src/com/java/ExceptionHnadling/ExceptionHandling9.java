package com.java.ExceptionHnadling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling9 {
    public static void main(String[] args) {
        // Try-with-resources statement
        try (FileInputStream fileInputStream = new FileInputStream("example.txt")) {
            int data = fileInputStream.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fileInputStream.read();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        System.out.println("\nRest of the code");
    }
}
