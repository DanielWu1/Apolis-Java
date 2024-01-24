package com.java.oops.oops16;

class Light implements Illuminable {
    @Override
    public void turnOn() {
        System.out.println("Light is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is turned off.");
    }
}
public class SingleImplment {
    public static void main(String[] args) {
        Illuminable roomLight = new Light();

        roomLight.turnOn();
        roomLight.turnOff();
    }
}
