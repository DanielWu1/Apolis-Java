package com.java.oops.oops10;

class Planet {
    String name = "Generic Planet";
}

class Earth extends Planet {
    String name = "Earth";

    void displayInfo() {
        String name = "Local Earth";
        System.out.println("Local variable: " + name);
        System.out.println("Class level variable: " + this.name); // Variable shadowing
        System.out.println("Parent class variable: " + super.name); // Variable hiding
    }
}

public class PlanetDemo {
    public static void main(String[] args) {
        Earth earth = new Earth();
        earth.displayInfo();
    }
}
