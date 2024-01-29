package com.java.Multithreading.Multithreading6;

public class ExampleThread extends Thread{
    int count = 0;

    @Override
    public void run(){
        synchronized (this) {
            System.out.println("Now start thread");
            for(int i = 0; i < 50; i++){
                count++;
            }
            System.out.println("Thread giving notification call.");
            this.notify();
        }
    }
}
