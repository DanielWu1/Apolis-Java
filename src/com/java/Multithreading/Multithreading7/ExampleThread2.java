package com.java.Multithreading.Multithreading7;

public class ExampleThread2 implements Runnable {
    private String name;

    public ExampleThread2(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Start executing " + name);
        try {
            Thread.sleep(1000);
            System.out.println("Executing " + name);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        System.out.println("Finished execution " + name);
        System.out.println();
    }
}
