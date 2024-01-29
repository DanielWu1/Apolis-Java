package com.java.Multithreading.Multithreading6;

public class WaitandNotify {
    public static void main(String[] args) throws InterruptedException {
        ExampleThread threadTest = new ExampleThread();
        threadTest.start();
        synchronized(threadTest){
            System.out.println("main thread calling wait method.");
            threadTest.wait();
            System.out.println("main thread got notification call.");
            System.out.println("Result : "+threadTest.count);
        }
    }
}
