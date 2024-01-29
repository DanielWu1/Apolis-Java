package com.java.Multithreading.Multithreading4;

class Counter {
    private int count = 0;

    // Synchronized method to increment the count
    public synchronized void increment() {
        System.out.println("current thread is: " + Thread.currentThread().getName());
        count++;
    }

    // Synchronized method to get the current count value
    public synchronized int getCount() {
        return count;
    }
}

public class Synchronization {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Creating two threads that increment the counter
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                counter.increment();
            }
        });

        // Starting both threads
        t1.start();
        t2.start();
        // Displaying the final count value
        System.out.println("Final count: " + counter.getCount());
    }
}

