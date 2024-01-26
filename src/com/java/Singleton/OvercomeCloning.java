package com.java.Singleton1;

class SuperClass1 implements Cloneable {
    String variable = "property";

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Singleton1 extends SuperClass1 {
    public static Singleton1 instance = new Singleton1();

    private Singleton1() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return instance;
    }
}

public class OvercomeCloning {

    public static void main(String[] args) throws CloneNotSupportedException {
        Singleton1 instance1 = Singleton1.instance;
        Singleton1 instance2 = (Singleton1) instance1.clone();
        System.out.println("instance1 hashCode:- " + instance1.hashCode());
        System.out.println("instance2 hashCode:- " + instance2.hashCode());
    }
}
