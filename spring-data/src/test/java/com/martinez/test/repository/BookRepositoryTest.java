package com.martinez.test.repository;

import com.martinez.test.persistence.PersistenceContextTest;

import org.junit.Assert;
import org.junit.Test;

public class BookRepositoryTest extends PersistenceContextTest {

    @Test
    public void count() {
        long booksCount = bookRepository.count();
        System.out.println(booksCount);
        Assert.assertTrue(booksCount > 0);
    }
}
