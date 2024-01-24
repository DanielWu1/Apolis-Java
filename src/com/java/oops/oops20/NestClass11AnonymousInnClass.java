package com.java.oops.oops20;

interface Base {
    void method();
}


public class NestClass11AnonymousInnClass {
    public static void main(String[] s) {
        Base base = new Base() {
            @Override
            public void method() {
                System.out.println("Implementation Class: method()");
            }
        };
        base.method();
    }
}
