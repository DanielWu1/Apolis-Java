package com.java.Multithreading.Multithreading5;

class Counter {
    private int count = 0;

    // Method with a synchronized block
    public void increment() {
        synchronized (this) {
            count++;
            System.out.println("Thread " + Thread.currentThread().getName() + " incremented count to: " + count);
            try {
                Thread.sleep(400); // Simulating a delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public int getCount() {
        return count;
    }
}

public class SynchronizationBlock {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Creating two threads that increment the counter
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                counter.increment();
            }
        }, "T1");

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                counter.increment();
            }
        }, "T2");

        // Starting both threads
        t1.start();
        t2.start();


        // Displaying the final count value
        System.out.println("Final count: " + counter.getCount());
    }
}

