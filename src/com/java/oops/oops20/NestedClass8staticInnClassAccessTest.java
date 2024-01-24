package com.java.oops.oops20;

class Library {
    private static String libraryName = "City Library";

    public static void searchBook(String bookName) {
        class BookFinder {
            public void find() {
                System.out.println("Searching for \"" + bookName + "\" in " + libraryName);
            }
        }

        // Create an instance of the local inner class
        BookFinder finder = new BookFinder();
        finder.find();
    }
}
public class NestedClass8staticInnClassAccessTest {
    public static void main(String[] args) {
        Library.searchBook("The Java Programming Language");
    }
}
