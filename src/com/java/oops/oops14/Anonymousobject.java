package com.java.oops.oops14;

class Car {
    private String model;
    private String color;
    private int year;

    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public void displayCarInfo() {
        System.out.println("Car model: " + model);
        System.out.println("Car color: " + color);
        System.out.println("Car year: " + year);
    }

}
public class Anonymousobject {
    public static void main(String[] args) {
        new Car("Tesla Model 3", "Red", 2021).displayCarInfo();

        new Car("Ford Mustang", "Blue", 2020).displayCarInfo();

        // This demonstrates the use of an anonymous object.
        // After this line, the anonymous Car object is no longer accessible.
    }
}
