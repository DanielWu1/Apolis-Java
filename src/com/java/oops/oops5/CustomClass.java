package com.java.oops.oops5;

public class CustomClass {
    int x = 20;

    public void display() {
        int x = 30;
        System.out.println(x);
        System.out.println(this.x);
    }

    public static void main(String[] a) {
        CustomClass customClass = new CustomClass();
        customClass.display();
    }
}
