package com.java.oops.oops15;

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    void print() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }
}

public class Callbyreference {
    static void modifyPoint(Point p) {
        p.move(5, 5); // Modifying the object that p references
        System.out.println("Inside modifyPoint");
        p.print();
    }

    public static void main(String[] args) {
        Point point = new Point(10, 10);
        System.out.println("Before modifyPoint");
        point.print();

        modifyPoint(point); // Passing the reference to modifyPoint

        System.out.println("After modifyPoint");
        point.print(); // The original point object has been modified
    }
}
