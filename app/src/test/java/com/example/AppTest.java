package com.example;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void testAdd() {
        App app = new App();
        Assert.assertEquals(5, app.add(2, 3));
    }
}

