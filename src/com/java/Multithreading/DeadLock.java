package com.java.Multithreading;

public class DeadLock {
    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();

    public static void main(String[] args) {
        // Thread 1 tries to lock resource1 then resource2
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1 locked resource 1");

                // Adding a sleep to make sure both threads start trying to lock resources
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                synchronized (resource2) {
                    System.out.println("Thread 1 locked resource 2");
                }
            }
        });

        // Thread 2 tries to lock resource2 then resource1
        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2 locked resource 2");

                synchronized (resource1) {
                    System.out.println("Thread 2 locked resource 1");
                }
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();
    }
}
