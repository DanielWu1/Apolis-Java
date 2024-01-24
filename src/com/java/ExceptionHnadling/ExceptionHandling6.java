package com.java.ExceptionHnadling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ExceptionHandling6 {
    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("example.txt");

            System.out.println("File opened successfully");
        } catch (FileNotFoundException e) {
            System.out.println("Error opening file: " + e.getMessage());
        } finally {
            // Finally block to close the file stream
            try {
                if (inputStream != null) {
                    inputStream.close();
                    System.out.println("File stream closed");
                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
        System.out.println("Rest of the code");
    }
}
