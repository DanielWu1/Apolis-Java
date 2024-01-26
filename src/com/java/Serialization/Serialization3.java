package com.java.Serialization;

import java.io.*;

// Superclass that implements Serializable
class Animal implements Serializable {
    private static final long serialVersionUID = 1L;
    private String species;

    public Animal(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public String toString() {
        return "Animal{species='" + species + "'}";
    }
}

// Subclass automatically becomes Serializable
class Dog extends Animal {
    private static final long serialVersionUID = 1L;
    private String name;

    public Dog(String species, String name) {
        super(species);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dog{species='" + getSpecies() + "', name='" + name + "'}";
    }
}

public class Serialization3 {

    // Method to serialize an object to a file
    public static void serialize(Object object, String filename) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(object);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to deserialize an object from a file
    public static Object deserialize(String filename) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            return in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Canine", "Buddy");
        String filename = "animal.txt";

        // Serialize the Dog object (subclass of Animal)
        serialize(dog, filename);
        System.out.println("Serialized dog: " + dog);

        // Deserialize the Dog object
        Dog deserializedDog = (Dog) deserialize(filename);
        System.out.println("Deserialized dog: " + deserializedDog);
    }
}


