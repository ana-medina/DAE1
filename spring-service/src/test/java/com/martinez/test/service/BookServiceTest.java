package com.martinez.test.service;

import com.martinez.entities.Book;
import com.martinez.test.config.ServiceContextTest;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class BookServiceTest extends ServiceContextTest {

    @Test
    public void findByTitle() {
        String expectedTitle = "We were liars";
        List<Book> books = bookService.findByTitle(expectedTitle);

        books.forEach(book -> {
            String actualTitle = book.getTitle();
            System.out.println(actualTitle);
            Assert.assertTrue(actualTitle.contains(expectedTitle));
        });
    }
}
