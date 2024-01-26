package com.java.Multithreading;

public class DeadlockResolved {

    public static void main(String[] args) {
        final Object resource1 = new Object();
        final Object resource2 = new Object();

        // Both threads try to lock resources in the same order: resource1 then resource2
        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Locked resource 1");
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized (resource2) {
                    System.out.println("Thread 1: Locked resource 2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 2: Locked resource 1");
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized (resource2) {
                    System.out.println("Thread 2: Locked resource 2");
                }
            }
        });

        t1.start();
        t2.start();
    }
}

