package com.java.oops.oops19;

public class DeepCloning implements Cloneable {
    String name;
    Address address;

    DeepCloning(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepCloning cloned = (DeepCloning) super.clone();
        cloned.address = new Address(this.address); // Deep cloning of Address
        return cloned;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("123 Main St", "Springfield");
        DeepCloning deepCloning = new DeepCloning("Jane Doe", address);
        DeepCloning deepCloning1 = (DeepCloning) deepCloning.clone();

        System.out.println("before deep clone copy " + deepCloning.address.street);
        System.out.println("before deep clone copy1 " + deepCloning1.address.street);

        deepCloning1.address.street = "321 sss St";

        System.out.println("after deep clone copy " + deepCloning.address.street);
        System.out.println("after deep clone copy1 " + deepCloning1.address.street);
    }
}
