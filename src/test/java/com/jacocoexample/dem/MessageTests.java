package com.jacocoexample.dem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MessageTests {
    @Test
    public void testMessage() {
        Message m = new Message();
        Assertions.assertEquals("Hello hai!...",m.getMessage("hai"));
    }
    @Test
    public void testMessage1() {
        Message m = new Message();
        Assertions.assertEquals("Please provice a name! ",m.getMessage(""));
    }
}
