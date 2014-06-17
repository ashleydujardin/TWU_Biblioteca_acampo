package com.twu.biblioteca;

/**
 * Created by ashleycampo on 6/17/14.
 */
public class Book {
    String author;
    String year;
    String title;

    public Book(String t, String a, String y) {
        author = a;
        year = y;
        title = t;
    }

    public String toString() {
        return (title + "\t" + author + "\t" + year);
    }
}
