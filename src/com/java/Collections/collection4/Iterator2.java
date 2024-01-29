package com.java.Collections.collection4;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator2 {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        ListIterator<String> listIterator = colors.listIterator();

        while (listIterator.hasNext()) {
            String color = listIterator.next();
            System.out.println(color);


            if (color.equals("Green")) {
                listIterator.set("Yellow");
            }
        }



        System.out.println("\nModified list: " + colors);
    }
}
