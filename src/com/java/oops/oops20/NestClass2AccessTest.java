package com.java.oops.oops20;

class Car1 {
    private String model;
    private String licensePlate = "XYZ 1234"; // Instance data member
    private Engine engine;

    public Car1(String model, String engineType) {
        this.model = model;
        this.engine = new Engine(engineType);
    }

    public void startCar() {
        engine.start();
        System.out.println(model + " with " + engine.getType() + " engine started.");
    }

    // Static nested class
    public static class Engine {
        private String type;

        public Engine(String type) {
            this.type = type;
        }

        public void start() {
            // Attempt to access an instance member of the outer class
            // System.out.println("License plate: " + licensePlate); // This will cause a compilation error

            System.out.println("Engine started");
        }

        public String getType() {
            return type;
        }
    }
}

public class NestClass2AccessTest {
    public static void main(String[] args) {
        Car1 myCar = new Car1("Benz", "Gasoline car");
        myCar.startCar();
    }
}
