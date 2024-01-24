package com.java.Multithreading.Multithreading2;

public class JoinMultithreading implements Runnable{


    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is running.");
            Thread.sleep(1000); // Simulate some work
            System.out.println(Thread.currentThread().getName()  + " is completed.");
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName()  + " interrupted.");
        }
    }

    public static void main(String[] args) {
        JoinMultithreading task = new JoinMultithreading();


        Thread thread1 = new Thread(task, "Thread1");
        Thread thread2 = new Thread(task, "Thread2");
        Thread thread3 = new Thread(task, "Thread3");

        thread1.start();

        try {
            System.out.println("Waiting for threads to complete.");
            thread1.join();
            System.out.println("thread1 complete");
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        thread2.start();
        thread3.start();
    }
}
