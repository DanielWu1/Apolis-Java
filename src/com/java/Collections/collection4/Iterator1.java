package com.java.Collections.collection4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator1 {

    public static List<Integer> method(List<Integer> list) {
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            int number = itr.next();
            if (number % 2 != 0) { // Check if the number is odd
                itr.remove();
            }
        }
        return list;
    }

    public static void main(String[] args) {
        // Create a list with some numbers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);


        // Print the modified list
        System.out.println("List after removing odd numbers: " + method(numbers));
    }
}
