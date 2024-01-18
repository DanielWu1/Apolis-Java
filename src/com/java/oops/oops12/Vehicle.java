package com.java.oops.oops12;

public class Vehicle {
    private String model;
    private String color;
    private int year;

    public Vehicle(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public Vehicle(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Vehicle(String model) {
        this.model = model;
    }

    public void printData() {
        System.out.println("Vehicle model is - " + model);
        System.out.println("Vehicle color is - " + color);
        System.out.println("Vehicle year is - " + year);
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Tesla Model S", "Red", 2022);
        Vehicle vehicle2 = new Vehicle("Ford Mustang", "Blue");
        Vehicle vehicle3 = new Vehicle("Honda Civic");
        vehicle1.printData();
        vehicle2.printData();
        vehicle3.printData();
    }
}

