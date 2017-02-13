package com.martinez.test.persistence;

import com.martinez.persistence.PersistenceJPAConfig;
import com.martinez.repository.BookRepository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PersistenceJPAConfig.class)
public class PersistenceContextTest {

    @Autowired
    protected BookRepository bookRepository;

    @Test
    public void dummy() {
        //dummy test to not get exception :)
        Assert.assertTrue(true);
    }
}