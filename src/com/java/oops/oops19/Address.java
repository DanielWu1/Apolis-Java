package com.java.oops.oops19;

public class Address {
    String street;
    String city;

    Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    Address(Address other) {
        this.street = other.street;
        this.city = other.city;
    }
}
