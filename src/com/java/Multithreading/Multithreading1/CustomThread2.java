package com.java.Multithreading.Multithreading1;

public class CustomThread2 implements Runnable{
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i + " time : is running...");
                Thread.sleep(1000); // Pause for one second
            }
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted");
        }
    }

    public static void main(String[] args) {
        CustomThread2 runnable = new CustomThread2();
        CustomThread2 runnable1 = new CustomThread2();
        Thread thread = new Thread(runnable, "Custom thread1");
        thread.start();

        Thread thread1 = new Thread(runnable1, "Custom thread2");
        thread1.start();
    }
}
