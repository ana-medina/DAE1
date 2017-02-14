package com.martinez.test.config;

import com.martinez.config.ServiceContext;
import com.martinez.service.BookService;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ServiceContext.class)
public class ServiceContextTest {

    @Autowired
    protected BookService bookService;

    @Test
    public void dummy() {
        //dummy test to not get exception :)
        Assert.assertTrue(true);
    }
}
