package com.java.oops.oops14;

final class Vehicle {
    // Final instance variable
    private final String model;

    // Blank final static variable
    private static final int MAX_SPEED;

    static {
        MAX_SPEED = 200;
    }

    public Vehicle(String model) {
        this.model = model;
    }

    // Final method example
    public final void displayInfo() {
        System.out.println("Vehicle model: " + model + ", Max Speed: " + MAX_SPEED);
    }
}

// Attempting to extend Vehicle will result in a compilation error
// class Car extends Vehicle { }

public class finalKeywords {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Tesla Model 3");
        vehicle.displayInfo();

        // Attempting to modify a final variable will result in a compilation error
        // vehicle.model = "Tesla Model S"; // Error: cannot assign a value to final variable model
    }
}
