package com.java.oops.oops20;

class Vehicle {
    private String type;

    public Vehicle(String type) {
        this.type = type;
    }

    public void displayType() {
        System.out.println("Vehicle type: " + type);
    }

    // Inner class
    public class Engine {
        String type;

        public Engine() {
            this.type = "Engine type";
        }

        public void displayType() {
            String type = "function type";
            System.out.println("displayType type: " + type);
            System.out.println("Engine type: " + this.type);
            System.out.println("Vehicle type (accessed from inner class): " + Vehicle.this.type);
        }
    }
}

public class NestClass6DataShow {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Car");
        Vehicle.Engine engine = vehicle.new Engine();

        vehicle.displayType();
        engine.displayType();
    }
}
