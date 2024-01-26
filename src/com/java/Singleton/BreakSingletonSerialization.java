package com.java.Singleton2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Singleton2 implements Serializable {
    public static Singleton2 instance = new Singleton2();

    private Singleton2() {
    }
}

public class BreakSingletonSerialization {

    public static void main(String[] args) {
        try {
            Singleton2 instance1 = Singleton2.instance;
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
            out.writeObject(instance1);
            out.close();

            // deserialize from file to object
            ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));

            Singleton2 instance2 = (Singleton2) in.readObject();
            in.close();

            System.out.println("instance1 hashCode:- " + instance1.hashCode());
            System.out.println("instance2 hashCode:- " + instance2.hashCode());
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
