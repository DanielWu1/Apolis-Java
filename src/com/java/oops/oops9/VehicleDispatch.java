package com.java.oops.oops9;

class Vehicle {
}

class Car extends Vehicle {
    public Car(){
        System.out.println("Car created");
    }
}

class TransportCompany {
    Vehicle dispatchVehicle() {
        System.out.println("TransportCompany: dispatchVehicle()");
        return new Vehicle();
    }
}

class CarRentalService extends TransportCompany {
    Car dispatchVehicle() {
        System.out.println("CarRentalService: dispatchVehicle()");
        return new Car();
    }
}

public class VehicleDispatch {
    public static void main(String[] args) {
        CarRentalService rentalService = new CarRentalService();
        rentalService.dispatchVehicle();
    }
}
