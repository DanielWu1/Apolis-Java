package com.java.day3;

public class Member extends Book{
    public void checkBookAccess() {
        Book book = new Book();

        // System.out.println(book.title); // Error: private access
        // System.out.println(book.author); // Error: default access in another package
        System.out.println(book.yearPublished); // OK: protected access from subclass
        System.out.println(book.genre); // OK: public access

        // Accessing Book class methods
        // book.printTitle(); // Error: private access
        // book.printAuthor(); // Error: default access in another package
        book.printYearPublished(); // OK: protected access from subclass
        book.printGenre(); // OK: public access
    }

    public static void main(String[] args) {
        Member member = new Member();
        member.checkBookAccess();
    }
}
