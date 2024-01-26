package com.java.DesignPattern;

class Car implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }
}

class Truck implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Truck engine started");
    }
}

class Motorcycle implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started");
    }
}
class VehicleFactory {
    public Vehicle getVehicle(String vehicleType) {
        if (vehicleType == null) {
            return null;
        }
        if (vehicleType.equalsIgnoreCase("CAR")) {
            return new Car();
        } else if (vehicleType.equalsIgnoreCase("TRUCK")) {
            return new Truck();
        } else if (vehicleType.equalsIgnoreCase("MOTORCYCLE")) {
            return new Motorcycle();
        }
        return null;
    }
}
public class FactoryPatternDemo {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();

        // Create a car
        Vehicle vehicle1 = vehicleFactory.getVehicle("CAR");
        vehicle1.startEngine();

        // Create a truck
        Vehicle vehicle2 = vehicleFactory.getVehicle("TRUCK");
        vehicle2.startEngine();

        // Create a motorcycle
        Vehicle vehicle3 = vehicleFactory.getVehicle("MOTORCYCLE");
        vehicle3.startEngine();
    }
}
