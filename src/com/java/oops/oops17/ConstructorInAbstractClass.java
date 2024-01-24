package com.java.oops.oops17;

abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();
}

class Dog extends Animal {
    public Dog(String name) {
        super(name); // Calling the constructor of the abstract class Animal
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Bark!");
    }
}
public class ConstructorInAbstractClass {
    public static void main(String[] args) {
        Animal myDog = new Dog("Rex");
        myDog.makeSound();
    }
}
