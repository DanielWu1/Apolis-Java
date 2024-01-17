package com.java.oops.oops6;

public class MethodOverlaoding1 {
    public void display(int num) {
        System.out.println("One parameter: " + num);
    }

    public void display(int num1, int num2) {
        System.out.println("Two parameters: " + num1 + ", " + num2);
    }

    public void display(int num1, int num2, int num3) {
        System.out.println("Three parameters: " + num1 + ", " + num2 + ", " + num3);
    }

    public static void main(String[] args) {
        MethodOverlaoding1 example = new MethodOverlaoding1();
        example.display(10);
        example.display(10, 30);
        example.display(30, 70, 50);
    }
}
