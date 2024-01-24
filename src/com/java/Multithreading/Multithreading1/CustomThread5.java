package com.java.Multithreading.Multithreading1;

public class CustomThread5 extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
    public static void main(String[] args) {


        CustomThread5 thread = new CustomThread5();
        CustomThread5 thread2 = new CustomThread5();
        System.out.println("Starting thread by calling run() directly");
//        thread.start();
        thread.run(); // Calling run() directly
        thread2.run();

        System.out.println("Finished executing the run() method");
    }
}
