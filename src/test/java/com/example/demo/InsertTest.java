package com.example.demo;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class InsertTest {
    private BookService bookService;
    BookWawa book;

    @Before
    public void before(){
        bookService = new BookService();
        book = new BookWawa();
    }

    @Test
    public void Test(){
        BookWawa result = bookService.insert(book);
        Assert.assertEquals("aaaa",result.getRemark(),"我们家娃娃的"+book.getName());
    }
}
