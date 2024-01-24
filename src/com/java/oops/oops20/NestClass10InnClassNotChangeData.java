package com.java.oops.oops20;

class Counter {
    public void createCounter() {
        int count = 0;

        class Incrementer {
            public void run() {
                // Uncommenting the following line will cause a compilation error
                // count++; // Error: Cannot assign a value to final variable 'count'

                System.out.println("Count: " + count);
            }
        }
        Incrementer test = new Incrementer();
        test.run();

    }
}

public class NestClass10InnClassNotChangeData {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.createCounter();
    }
}
