package com.java.Multithreading.Multithreading9;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TaskExecutor {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(new CustomTask());

        // Wait for the task to complete
        Thread.sleep(2000);

        if (future.isDone()) {
            try {
                // Retrieve the result of the task
                System.out.println("Returned value from call method is: " + future.get());
            } catch (InterruptedException e) {
                // Handle the case where the current thread was interrupted
                System.out.println("Thread was interrupted while waiting for the task to complete.");
                Thread.currentThread().interrupt(); // Restore the interrupted status
            } catch (ExecutionException e) {
                // Handle the case where the task threw an exception
                System.out.println("An error occurred while executing the task.");
                e.printStackTrace();
            }
        }

        // Shutdown the executor service
        executor.shutdown();
    }
}

