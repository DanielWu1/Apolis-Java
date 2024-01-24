package com.java.ExceptionHnadling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling4 {
    public static void main(String[] args) {
        try {
            // File operation that may cause FileNotFoundException
            FileInputStream file = new FileInputStream("nonexistent.txt");

            // Number parsing operation that may cause NumberFormatException
            String invalidNumber = "abc";
            int number = Integer.parseInt(invalidNumber);
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException occurs: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurs: " + e.getMessage());
        }

        System.out.println("rest of the code");
    }
}
