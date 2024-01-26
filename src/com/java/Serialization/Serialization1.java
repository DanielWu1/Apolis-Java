package com.java.Serialization;

import java.io.*;


class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class Serialization1 {


    public static void serialize(Person person, String filename) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {
        Person person = new Person("John Doe", 30);
        String filename = "file.txt";

        // Serialize the Person object
        serialize(person, filename);
        System.out.println("Serialized person: " + person);

    }
}

