package com.java.Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Serialization2 {
    public static Person deserialize(String filename) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            return (Person) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        String filename = "file.txt";


        // Deserialize the Person object
        Person deserializedPerson = deserialize(filename);
        System.out.println("Deserialized person: " + deserializedPerson);
    }
}
