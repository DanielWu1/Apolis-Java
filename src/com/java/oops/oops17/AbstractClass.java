package com.java.oops.oops17;

abstract class PaymentProcessor {
    protected double amount;

    public PaymentProcessor(double amount) {
        this.amount = amount;
    }

    // Abstract method
    public abstract void processPayment();

    protected void transactionComplete() {
        System.out.println("Payment of $" + amount + " processed.");
    }
}

class CreditCardPayment extends PaymentProcessor {
    public CreditCardPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment...");
        // Specific logic for processing credit card payment
        transactionComplete();
    }
}

class PayPalPayment extends PaymentProcessor {
    public PayPalPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Processing PayPal payment...");
        // Specific logic for processing PayPal payment
        transactionComplete();
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        PaymentProcessor creditCardPayment = new CreditCardPayment(100.0);
        creditCardPayment.processPayment();

        PaymentProcessor payPalPayment = new PayPalPayment(200.0);
        payPalPayment.processPayment();
    }
}
