package com.tactfactory.tpjenkins;

import org.junit.Assert;
import org.junit.Test;

public class TestApplication {

    @Test
    public void test() {
       int a = 1;
       int b = 2;

       int result = Application.add(a, b);

       Assert.assertEquals(3, result);
    }

}
