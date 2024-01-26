package com.java.Multithreading;

class Buffer {
    private int data;
    private boolean isEmpty = true;

    // Method for the consumer to consume data
    public synchronized void consume() {
        while (isEmpty) {
            try {
                wait(); // Wait until data is produced
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
        }
        System.out.println("Consumed: " + data);
        isEmpty = true;
        notify(); // Notify producer that data has been consumed
    }

    // Method for the producer to produce data
    public synchronized void produce(int newData) {
        while (!isEmpty) {
            try {
                wait(); // Wait until data is consumed
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
        }
        this.data = newData;
        System.out.println("Produced: " + data);
        isEmpty = false;
        notify(); // Notify consumer that new data is available
    }
}
public class Notify {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        // Producer Thread
        Thread producerThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                buffer.produce(i);
            }
        });

        // Consumer Thread
        Thread consumerThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                buffer.consume();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
