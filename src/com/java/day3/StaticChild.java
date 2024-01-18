package com.java.day3;
import static com.java.day3.StaticParent.PI;
import static com.java.day3.StaticParent.square;
import static com.java.day3.StaticParent.cube;

public class StaticChild {
    public static void main(String[] args) {
        double radius = 5;

        double area = PI * square(radius); // Using PI and square without class name
        double volume = (4.0 / 3) * PI * cube(radius); // Using PI and cube without class name

        System.out.println("Area of the circle: " + area);
        System.out.println("Volume of the sphere: " + volume);
    }
}
