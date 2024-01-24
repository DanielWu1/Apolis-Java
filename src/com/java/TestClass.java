package com.java;

public class TestClass {
    public static void main(String[] args) {

        String s1 = "Hello";
        System.out.println(s1);

        String s2 = new String("Hello");
        System.out.println(s2);

        if (s1 == s2.intern()) {
            System.out.println("same reference ");
        } else {
            System.out.println("different refrence");
        }

    }

}
