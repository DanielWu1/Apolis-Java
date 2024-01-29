package com.java.Multithreading.Multithreading9;

import java.util.concurrent.Callable;

public class CustomTask implements Callable {

    @Override
    public String call() throws Exception {
        System.out.println("Thread : " + Thread.currentThread().getName() + "starts");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("Thread : " + Thread.currentThread().getName() + " ends");
        return "Task is done successfully";
    }
}
