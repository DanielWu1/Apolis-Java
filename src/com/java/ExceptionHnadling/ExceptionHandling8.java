package com.java.ExceptionHnadling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling8 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("example.txt");
            int data = fileInputStream.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fileInputStream.read();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            // Finally block to ensure the file stream is closed
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                    System.out.println("\nFile stream closed");
                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
        System.out.println("Rest of the code");
    }
}
