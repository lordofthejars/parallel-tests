package org.superbiz;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class BarTest {

    @Test
    public void mySecondSlowTest() throws InterruptedException {
        TimeUnit.SECONDS.sleep(15);
    }

}
