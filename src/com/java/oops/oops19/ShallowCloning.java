package com.java.oops.oops19;

public class ShallowCloning implements Cloneable {
    String name;
    Address address;

    ShallowCloning(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Default cloning (shallow)
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("123 Main St", "Springfield");
        ShallowCloning shallowCloning = new ShallowCloning("John Doe", address);
        ShallowCloning shallowCloning1 = (ShallowCloning) shallowCloning.clone();

        System.out.println("before shallow copy " + shallowCloning.address.street);
        System.out.println("before shallow copy1 " + shallowCloning1.address.street);

        shallowCloning1.address.street = "321 sss St";

        System.out.println("after shallow copy " + shallowCloning.address.street);
        System.out.println("after shallow copy1 " + shallowCloning1.address.street);
    }
}
