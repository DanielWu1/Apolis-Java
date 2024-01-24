package com.java.oops.oops16;

class Car implements Driveable, Refuelable{

    @Override
    public void startEngine() {
        System.out.println("Engine started.");
    }

    @Override
    public void drive() {
        System.out.println("Car is driving.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stopped.");
    }

    @Override
    public void refuel() {
        System.out.println("Car is refueled.");
    }
}
public class MutiImplment {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.startEngine();
        myCar.drive();
        myCar.stopEngine();
        myCar.refuel();
    }
}
