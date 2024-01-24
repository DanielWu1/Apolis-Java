package com.java.oops.oops21;

final class Address {
    private final String street;
    private final String city;
    private final String postalCode;

    public Address(String street, String city, String postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    // No setter methods
}
public class ImmutableClass {
    public static void main(String[] args) {
        Address address = new Address("123 Main St", "Springfield", "12345");
        System.out.println("Address: " + address.getStreet() + ", " + address.getCity() + ", " + address.getPostalCode());
    }
}
