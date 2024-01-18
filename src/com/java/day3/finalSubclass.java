package com.java.day3;

final class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

// Attempting to extend Calculator will result in a compile-time error
// class AdvancedCalculator extends Calculator {
//     public int subtract(int a, int b) {
//         return a - b;
//     }
// }
public class finalSubclass {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 3);
        System.out.println("Sum: " + result);
    }
}
