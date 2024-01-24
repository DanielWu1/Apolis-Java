package com.java.ExceptionHnadling;

class InvalidAgeException extends Exception {
    // Constructor that accepts a custom error message
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class ExceptionHandling10 {
    public static void registerUser(String name, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("User must be 18 or older to register");
        }
        System.out.println("User registered successfully: " + name);
    }
    public static void main(String[] args) {
        try {
            registerUser("Alice", 15); // This will throw InvalidAgeException
        } catch (InvalidAgeException e) {
            System.out.println("Registration failed: " + e.getMessage());
        }
    }


}
