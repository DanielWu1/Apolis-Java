package com.java.day3;

public class Book {
    private String title = "Private Book";
    String author = "Default Author";
    protected int yearPublished = 2020;
    public String genre = "Public Genre";

    private void printTitle() {
        System.out.println("Title: " + title);
    }

    void printAuthor() {
        System.out.println("Author: " + author);
    }

    protected void printYearPublished() {
        System.out.println("Year Published: " + yearPublished);
    }

    public void printGenre() {
        System.out.println("Genre: " + genre);
    }
}
