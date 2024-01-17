package com.java.day2;

import java.util.ArrayList;
import java.util.List;

class Library {
    private static int totalBooks = 0;
    private List<String> title = new ArrayList<String>();


    public void updateTotalBooks(String title) {
        this.title.add(title);
        this.totalBooks++;
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    public List<String> getTitle() {
        return this.title;
    }
}
public class assignment2 {
    public static void main(String[] args) {
        Library test1 = new Library();
        test1.updateTotalBooks("daniel");
        System.out.println(test1.getTotalBooks());
        System.out.println(test1.getTitle());
        test1.updateTotalBooks("ton");
        System.out.println(test1.getTotalBooks());
        System.out.println(test1.getTitle());
    }
}
