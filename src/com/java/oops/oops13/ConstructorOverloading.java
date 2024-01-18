package com.java.oops.oops13;
class Book {
    private String title;
    private String author;
    private int pageCount;

    public Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    public Book(String title, int pageCount) {
        this("Unknown Author");
        this.title = title;
        this.pageCount = pageCount;
    }

    public Book(String author) {
        this.author = author;
    }

    public void printData() {
        System.out.println("Book title is - " + title);
        System.out.println("Book author is - " + author);
        System.out.println("Book page count is - " + pageCount);
    }


}
public class ConstructorOverloading {
    public static void main(String[] args) {
    Book book = new Book("The Great Gatsby", 180);
    book.printData();
}
}
