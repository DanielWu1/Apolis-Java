package com.java.Multithreading.Multithreading7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTest {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(new ExampleThread1("Task1"));
        executor.submit(new ExampleThread2("Task2"));
        executor.shutdown();
    }
}
