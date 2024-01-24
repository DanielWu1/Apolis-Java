package com.java.ExceptionHnadling;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ExceptionHandling2 {
    public void classCastExceptionExample() {
        Object obj = new String("Hello");
        Integer integer = (Integer) obj; // ClassCastException
    }

    public int indexOutOfBoundsExceptionExample() {
        int[] test = new int[1];
        return test[3];// IndexOutOfBoundsException
    }

    public static void main(String[] args) {
        ExceptionHandling2 examples = new ExceptionHandling2();
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

    }
}
