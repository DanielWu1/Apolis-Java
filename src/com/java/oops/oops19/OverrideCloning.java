package com.java.oops.oops19;

class Car implements Cloneable {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Car Model: " + model + ", Year: " + year);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class OverrideCloning {
    public static void main(String[] args) {
        try {
            Car originalCar = new Car("Tesla Model S", 2020);
            System.out.println("Original Car:");
            originalCar.displayInfo();

            // Cloning the original car
            Car clonedCar = (Car) originalCar.clone();
            System.out.println("Cloned Car:");
            clonedCar.displayInfo();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
