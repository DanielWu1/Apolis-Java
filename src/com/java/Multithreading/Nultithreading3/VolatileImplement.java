package com.java.Multithreading.Nultithreading3;

public class VolatileImplement {
    private volatile boolean flag = false;

    public void setFlag() {
        this.flag = true;
    }

    public boolean isFlagSet() {
        return flag;
    }

    public static void main(String[] args) {
        VolatileImplement example = new VolatileImplement();

        // Thread to update the flag
        Thread updateThread = new Thread(() -> {
            try {
                System.out.println("Flag start updateThread");
                Thread.sleep(1000);
                example.setFlag();
                System.out.println("Flag set by updateThread");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Thread to monitor the flag
        Thread monitorThread = new Thread(() -> {
            System.out.println("monitor start");
            while (!example.isFlagSet()) {
                // wait
            }
            System.out.println("Flag detected by monitorThread");
        });

        monitorThread.start();
        updateThread.start();
    }
}
