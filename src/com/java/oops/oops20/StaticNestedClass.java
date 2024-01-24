package com.java.oops.oops20;

class Car {
    static String model;
    private Engine engine;

    public Car(String model, String engineType) {
        this.model = model;
        this.engine = new Engine(engineType);
    }

    public void startCar() {
        engine.start();
        System.out.println(model + " with " + engine.getType() + " engine started.");
    }

    public static class Engine {
        private String type;

        public Engine(String type) {
            this.type = type;
        }

        public void start() {
            System.out.println(model);
            System.out.println("Engine started");
        }

        public String getType() {
            return type;
        }
    }
}
public class StaticNestedClass {
    public static void main(String[] args) {
        Car myCar = new Car("Tesla Model S", "Electric");
        myCar.startCar();
    }
}
