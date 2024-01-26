package com.java.DesignPattern;

class Book {
    private final String title; // required
    private final String author; // required
    private final int pageCount; // optional
    private final String publisher; // optional
    private final int publicationYear; // optional

    private Book(BookBuilder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.pageCount = builder.pageCount;
        this.publisher = builder.publisher;
        this.publicationYear = builder.publicationYear;
    }

    // All getter, and NO setter to provide immutability
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", pageCount=" + pageCount + ", publisher=" + publisher
                + ", publicationYear=" + publicationYear + "]";
    }

    public static class BookBuilder {
        private final String title;
        private final String author;
        private int pageCount;
        private String publisher;
        private int publicationYear;

        public BookBuilder(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public BookBuilder pageCount(int pageCount) {
            this.pageCount = pageCount;
            return this;
        }

        public BookBuilder publisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public BookBuilder publicationYear(int publicationYear) {
            this.publicationYear = publicationYear;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}

public class Designpattern3 {
    public static void main(String[] args) {

        Book book = new Book.BookBuilder("The Great Gatsby", "F. Scott Fitzgerald")
                .pageCount(218)
                .publisher("Charles Scribner's Sons")
                .publicationYear(1925)
                .build();


        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Page Count: " + book.getPageCount());
        System.out.println("Publisher: " + book.getPublisher());
        System.out.println("Publication Year: " + book.getPublicationYear());


        System.out.println(book);
    }
}
