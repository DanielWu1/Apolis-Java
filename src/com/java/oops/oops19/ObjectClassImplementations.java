package com.java.oops.oops19;

class Book implements Cloneable {
    private String title;
    private String author;
    private int isbn;

    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "', isbn=" + isbn + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return isbn == book.isbn;
    }

    @Override
    public int hashCode() {
        return isbn;
    }

    @Override
    public Book clone() {
        try {
            return (Book) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public void printClass() {
        System.out.println("Class name: " + getClass().getName());
    }
}
public class ObjectClassImplementations {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "James Gosling", 123456);
        Book book2 = new Book("Effective Java", "Joshua Bloch", 789012);
        Book book3 = book1.clone(); // Cloning book1


        System.out.println(book1);
        System.out.println("book1 equals book2: " + book1.equals(book2)); // false
        System.out.println("book1 equals book3: " + book1.equals(book3)); // true
        System.out.println("HashCode of book1: " + book1.hashCode());
        book1.printClass();

    }
}
