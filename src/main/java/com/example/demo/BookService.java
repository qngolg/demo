package com.example.demo;

public class BookService {
    public BookWawa insert(BookWawa book) {
        book.setRemark("我们家娃娃的"+book.getName());
        return book;
    }
}
