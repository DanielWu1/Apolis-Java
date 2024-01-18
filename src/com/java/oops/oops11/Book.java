package com.java.oops.oops11;

public class Book {
    private String title;
    private String author;
    private int pageCount;

    public Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void displayBookInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Page Count: " + pageCount);
    }

    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", 328);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 281);

        book1.displayBookInfo();
        System.out.println(); // Adding a blank line for readability
        book2.displayBookInfo();
    }
}
