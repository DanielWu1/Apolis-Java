package com.java.oops.oops11;

public class ConstructorTest {
    ConstructorTest(){
        System.out.println("Constructor invoke.");
    }

    public static void main(String[] args) {
        // Creating instances of the Person class using the constructor
        ConstructorTest object1 = new ConstructorTest();
        ConstructorTest object2 = new ConstructorTest();
    }
}
