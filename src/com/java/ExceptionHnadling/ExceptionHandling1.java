package com.java.ExceptionHnadling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExceptionHandling1 {

    public void arithmeticExceptionExample() {
        int result = 10 / 0; // ArithmeticException: Division by zero
    }

    public void nullPointerExceptionExample() {
        String str = null;
        int length = str.length(); // NullPointerException
    }

    public void arrayIndexOutOfBoundsExceptionExample() {
        int[] array = new int[5];
        int value = array[10]; // ArrayIndexOutOfBoundsException
    }

    public void fileNotFoundExceptionExample() throws FileNotFoundException {
        FileInputStream file = new FileInputStream("nonexistent.txt"); // FileNotFoundException
    }

    public void numberFormatExceptionExample() {
        int num = Integer.parseInt("abc"); // NumberFormatException
    }

    public void classCastExceptionExample() {
        Object obj = new String("Hello");
        Integer integer = (Integer) obj; // ClassCastException
    }

    public void indexOutOfBoundsExceptionExample() {
        List<Integer> list = new ArrayList<>();
        int value = list.get(1); // IndexOutOfBoundsException
    }

    public void illegalArgumentExceptionExample() {
        Thread thread = new Thread();
        thread.setPriority(11); // IllegalArgumentException: Priority out of range
    }

    public void illegalStateExceptionExample() {
        List<Integer> list = new ArrayList<>();
        Iterator<Integer> iterator = list.iterator();
        iterator.remove(); // IllegalStateException
    }

    // Main method to demonstrate exception examples
    public static void main(String[] args) {
        ExceptionHandling1 examples = new ExceptionHandling1();

        try {
            examples.arithmeticExceptionExample();
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException");
        }

        try {
            examples.nullPointerExceptionExample();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException");
        }

        try {
            examples.arrayIndexOutOfBoundsExceptionExample();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException");
        }

        try {
            examples.fileNotFoundExceptionExample();
        } catch (FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException");
        }

        try {
            examples.numberFormatExceptionExample();
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException");
        }

        try {
            examples.classCastExceptionExample();
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException");
        }

        try {
            examples.indexOutOfBoundsExceptionExample();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught IndexOutOfBoundsException");
        }

        try {
            examples.illegalArgumentExceptionExample();
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException");
        }

        try {
            examples.illegalStateExceptionExample();
        } catch (IllegalStateException e) {
            System.out.println("Caught IllegalStateException");
        }
    }
}
