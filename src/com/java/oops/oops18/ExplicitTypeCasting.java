package com.java.oops.oops18;

public class ExplicitTypeCasting {
    public static void main(String[] args) {
        double transactionAmount = 12345.67;

        // Explicit Casting: Converting double to int
        int wholeNumberAmount = (int) transactionAmount;

        System.out.println("Original Transaction Amount: " + transactionAmount);
        System.out.println("Whole Number Amount: " + wholeNumberAmount);

        // Another Example: Converting double to byte
        byte smallAmount = (byte) transactionAmount;
        System.out.println("Small Amount in Byte: " + smallAmount);
    }
}
