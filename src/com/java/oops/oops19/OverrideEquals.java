package com.java.oops.oops19;

public class OverrideEquals {
    public static void main(String[] args) {
        Integer num1 = new Integer(100);
        Integer num2 = new Integer(100);
        Integer num3 = new Integer(200);

        if (num1 == num2){
            System.out.println("num1 == num2: " + (num1 == num2));
        }
        System.out.println("num1 equals num2: " + num1.equals(num2)); // true
        System.out.println("num1 equals num3: " + num1.equals(num3)); // false

        Double d1 = new Double(10.5);
        Double d2 = new Double(10.5);
        Double d3 = new Double(20.5);

        if (d1 == d2){
            System.out.println("d1 == d2: " + (d1 == d2));
        }
        System.out.println("d1 equals d2: " + d1.equals(d2)); // true
        System.out.println("d1 equals d3: " + d1.equals(d3)); // false

        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean(true);
        Boolean b3 = new Boolean(false);

        if (b1 == b2){
            System.out.println("b1 == b2: " + (b1 == b2));
        }
        System.out.println("b1 equals b2: " + b1.equals(b2)); // true
        System.out.println("b1 equals b3: " + b1.equals(b3)); // false
    }
}
