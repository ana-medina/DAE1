package com.martinez.test.repository;

import com.martinez.entities.Book;
import com.martinez.test.persistence.PersistenceContextTest;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class BookRepositoryTest extends PersistenceContextTest {

    @Test
    public void count() {
        long booksCount = bookRepository.count();
        Assert.assertTrue(booksCount > 0);
    }

    @Test
    public void findAllBooks(){
        List<Book> books = bookRepository.findAll();
        Assert.assertFalse(books.isEmpty());
    }

    @Test
    public void findByTitle() {
        String titleExpected = "We were liars";
        List<Book> books = bookRepository.findByTitle(titleExpected);
        String titleActual = books.get(0).getTitle();
        Assert.assertTrue(titleActual.contains(titleExpected));
    }
}
