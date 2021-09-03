package com.jcoder.kafka.entity;

public class Book {

    private String bookName;
    private String isbn;

    public String getBookName() {
        return bookName;
    }

    public Book() {
    }

    public Book(String bookName, String isbn) {
        this.bookName = bookName;
        this.isbn = isbn;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
