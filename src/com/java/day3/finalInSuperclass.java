package com.java.day3;

class Vehicle {
    public final void startEngine() {
        System.out.println("Starting the engine.");
    }
}

class Car extends Vehicle {
    // Attempting to override startEngine will result in a compile-time error
    // public void startEngine() {
    //     System.out.println("Starting the car engine.");
    // }
}
public class finalInSuperclass {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine(); // Calls the final method from Vehicle class
    }
}
