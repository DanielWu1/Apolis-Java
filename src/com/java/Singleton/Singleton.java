package com.java.Singleton;

// 1. Eager Initialization
class SingletonEager {
    private static final SingletonEager INSTANCE = new SingletonEager();

    private SingletonEager() {}

    public static SingletonEager getInstance() {
        return INSTANCE;
    }
}

// 2. Static Block Initialization
class SingletonStaticBlock {
    private static SingletonStaticBlock instance;

    static {
        try {
            instance = new SingletonStaticBlock();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    private SingletonStaticBlock() {}

    public static SingletonStaticBlock getInstance() {
        return instance;
    }
}

// 3. Lazy Initialization
class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy() {}

    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}

// 4. Thread-Safe Singleton
class SingletonThreadSafe {
    private static SingletonThreadSafe instance;

    private SingletonThreadSafe() {}

    public static synchronized SingletonThreadSafe getInstance() {
        if (instance == null) {
            instance = new SingletonThreadSafe();
        }
        return instance;
    }
}

// 5. Bill Pugh Singleton Implementation
class SingletonBillPugh {
    private SingletonBillPugh() {}

    private static class SingletonHelper {
        private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
    }

    public static SingletonBillPugh getInstance() {
        return SingletonHelper.INSTANCE;
    }
}

public class Singleton {
    public static void main(String[] args) {
        // Test for each Singleton implementation
        System.out.println("Eager Initialization: " + (SingletonEager.getInstance() == SingletonEager.getInstance()));
        System.out.println("Static Block Initialization: " + (SingletonStaticBlock.getInstance() == SingletonStaticBlock.getInstance()));
        System.out.println("Lazy Initialization: " + (SingletonLazy.getInstance() == SingletonLazy.getInstance()));
        System.out.println("Thread-Safe Singleton: " + (SingletonThreadSafe.getInstance() == SingletonThreadSafe.getInstance()));
        System.out.println("Bill Pugh Singleton Implementation: " + (SingletonBillPugh.getInstance() == SingletonBillPugh.getInstance()));
    }
}

