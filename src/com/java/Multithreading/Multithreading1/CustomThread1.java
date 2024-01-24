package com.java.Multithreading.Multithreading1;

public class CustomThread1 extends Thread  {
    public CustomThread1(String threadName) {
        super(threadName);
    }
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i + "time : is running...");
                Thread.sleep(1000); // Pause for one second
            }
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted");
        }
    }

    public static void main(String[] args) {
        CustomThread1 thread = new CustomThread1("gg");
        thread.start(); // Start the thread
    }
}
