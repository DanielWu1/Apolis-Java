package com.java.Multithreading.Multithreading1;

public class CustomThread4 {
    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(i);
                    Thread.sleep(1000); // Pause for one second
                }
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        });

        thread.start(); // Start the thread
    }
}
