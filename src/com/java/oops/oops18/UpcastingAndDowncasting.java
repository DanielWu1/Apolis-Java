package com.java.oops.oops18;

class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}

public class UpcastingAndDowncasting {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Animal animal = dog; //upcasting
        animal.eat();

        Dog dog1 = (Dog) animal; //downcasting
        dog1.bark();
    }
}
