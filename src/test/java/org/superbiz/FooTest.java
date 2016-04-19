package org.superbiz;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class FooTest {

    @Test
    public void myFirstSlowTest() throws InterruptedException {
        TimeUnit.SECONDS.sleep(10);
    }

}
